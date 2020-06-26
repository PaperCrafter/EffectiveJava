package chapter3.singleton.field;

class Singleton<T>{
    private Singleton(){};
    private static Singleton INSTANCE = new Singleton();
    public static Singleton getInstance(){
        return INSTANCE;
    }
}
