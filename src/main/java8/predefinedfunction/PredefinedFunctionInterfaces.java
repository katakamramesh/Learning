package main.java8.predefinedfunction;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionInterfaces {

    Predicate predicate = new Predicate() {
        @Override
        public boolean test(Object o) {
            return false;
        }
    };
    Function function = new Function() {
        @Override
        public Object apply(Object o) {
            return null;
        }
    };
    Consumer consumer = new Consumer() {
        @Override
        public void accept(Object o) {

        }
    };
    Supplier supplier = new Supplier() {
        @Override
        public Object get() {
            return null;
        }
    };

}
