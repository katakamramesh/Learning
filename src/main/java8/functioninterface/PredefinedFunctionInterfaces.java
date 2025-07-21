package main.java8.predefinedfunction;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionInterfaces {

    // checks condition true or false, it has 1 args and return boolean
    Predicate predicate = new Predicate() {
        @Override
        public boolean test(Object o) {
            return false;
        }
    };
    // does the operation, 1 args and 1 returns object
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
    // doesn't accept parameter but returns an object
    Supplier supplier = new Supplier() {
        @Override
        public Object get() {
            return null;
        }
    };

}
