package main.java8;

public class FunctionalInterfaces {
    //only 1 abstract method, any number of default and static methods
    //default : Runnable, Callable, Comparable, ActionListener
    //@FunctionInterface introduced in java 8
    //default method(can be overridden)
    //static method(cannot be overridden)

    public static void main(String[] args) {
        Ola o = new Ola();// this is old way of doing
        o.bookCab();
        Cab c = new Ola();
        c.bookCab();
        //this is the new way to write , no need of the implementation class Ola, we can just remove it
        Cab cab = () -> System.out.println("ola cab");
        cab.bookCab();

        //this is the new way to write , no need of the implementation class Ola, we can just remove it
        Auto auto = (source, destination) -> System.out.println("auto booked from " + source + " to " + destination);
        auto.bookAuto("hyd", "mumbai");

        //similarly for returning a value
        Bike auto1 = ((source, destination) -> {
           System.out.println("return auto booked from " + source + " to " + destination);
           return " cost of auto is 5k";
        });
        System.out.println(auto1.bookReturnBike("chennai", "kolkata"));
    }
}

@FunctionalInterface
interface Cab{
    public void bookCab();
}

class Ola implements Cab{
    @Override
    public void bookCab() {
        System.out.println("it is ola");
    }
}

@FunctionalInterface
interface Auto{
    public void bookAuto(String source, String destination);
}

class Uber implements Auto {
    @Override
    public void bookAuto(String source, String destination) {
        System.out.println("auto booked from " + source + " to " + destination);
    }

}

@FunctionalInterface
interface Bike{
    public String bookReturnBike(String source, String destination);
}

class Rapido implements Bike {
    @Override
    public String bookReturnBike(String source, String destination) {
        return " cost of bike is 5k";
    }
}