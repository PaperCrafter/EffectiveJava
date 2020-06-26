package chapter3.staticfactory;

import java.util.function.Supplier;

public class Singleton {
    private Singleton(){};
    private static Singleton INSTANCE = new Singleton();
    public static Singleton getInstance(){
        return INSTANCE;
    }
}

class Example{
    public void use(){
        Supplier<Singleton> singletonSupplier = Singleton::getInstance;
    }
}