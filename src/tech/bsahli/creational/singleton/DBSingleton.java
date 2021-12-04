package tech.bsahli.creational.singleton;

public class DBSingleton {

    // the keyword volatile makes the singleton thread safe
    private static volatile DBSingleton instance = null;

    private DBSingleton() {// to make it it impossible to create instances from outside the class
        if (instance != null) // in case of using reflection
            throw new RuntimeException("Use getInstance() to create an Instance");
    }

    public static DBSingleton getInstance() {
        if (instance == null) {// this will make the singleton lazily loaded
            synchronized (DBSingleton.class) { // sinchronize the class when we create an instance
                // in case two threads try to create
                if (instance == null)
                    instance = new DBSingleton();
            }
        }
        return instance;
    }
}
