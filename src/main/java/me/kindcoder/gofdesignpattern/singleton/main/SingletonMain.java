package me.kindcoder.gofdesignpattern.singleton.main;

import me.kindcoder.gofdesignpattern.singleton.implement.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        System.out.println(singleton == singleton2);
    }
}
