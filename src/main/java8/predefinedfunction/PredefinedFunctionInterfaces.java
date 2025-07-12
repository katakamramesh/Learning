package main.java8.predefinedfunction;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionInterfaces {

    // if you want to check condition true, it has 1 args and return boolean
    Predicate predicate = new Predicate() {
        @Override
        public boolean test(Object o) {
            return false;
        }
    };
    // if you want to do operation it has 2 methods, one is args and another is return type
    Function function = new Function() {
        @Override
        public Object apply(Object o) {
            return null;
        }
    };
    // it accepts a parameter but does not return anything
    Consumer consumer = new Consumer() {
        @Override
        public void accept(Object o) {

        }
    };
    // doesn't accept anything but returns an object
    Supplier supplier = new Supplier() {
        @Override
        public Object get() {
            return null;
        }
    };

}
