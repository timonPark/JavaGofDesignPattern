package me.kindcoder.gofdesignpattern.singleton.implement;

public class Singleton {
    private Singleton(){}

    private static class SingleTonCreate{
        private static final Singleton SINGLETON = new Singleton();
        private static Singleton getSingleton(){
            return SINGLETON;
        }
    }

    public static Singleton getSingleton(){
        return SingleTonCreate.getSingleton();
    }
}
