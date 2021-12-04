package tech.bsahli.creational.singleton;

public class DBSingleton {

    private static DBSingleton instance = new DBSingleton();

    private DBSingleton(){} // to make it it impossible to create instances from outside the class

    public static DBSingleton getInstance() {
        return instance;
    }
}
