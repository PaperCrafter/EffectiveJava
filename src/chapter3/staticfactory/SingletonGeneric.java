package chapter3.staticfactory;

public class SingletonGeneric<T>{
    private SingletonGeneric(){};
    private static SingletonGeneric INSTANCE = new SingletonGeneric();
    public static SingletonGeneric getInstance(){
        return INSTANCE;
    }
}