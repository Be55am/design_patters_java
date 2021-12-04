package tech.bsahli.creational.singleton;

public class DBSingleton {

    private static DBSingleton instance = null;

    private DBSingleton(){} // to make it it impossible to create instances from outside the class

    public static DBSingleton getInstance() {

        if(instance == null) // this will make the singleton lazily loaded
            instance = new DBSingleton();
        return instance;
    }
}
