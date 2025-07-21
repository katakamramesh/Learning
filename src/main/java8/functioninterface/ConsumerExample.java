package main.java8.functioninterface;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s + " is an animal");
        Consumer<String> c2 = s -> System.out.println(s + " has 4 legs");

        c1.andThen(c2).accept("cow");
    }

}
