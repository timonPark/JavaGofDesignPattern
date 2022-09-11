package me.kindcoder.gofdesignpattern.singleton.implement;

public class Singleton {
    private Singleton(){}

    public static class SingleTonCreate{
        public static final Singleton SINGLETON = new Singleton();
        public static Singleton getSingleton(){
            return SINGLETON;
        }
    }

    public static Singleton getSingleton(){
        return SingleTonCreate.getSingleton();
    }
}
