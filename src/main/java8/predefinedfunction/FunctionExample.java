package main.java8.predefinedfunction;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample {

    public static void main(String[] args) {
        Function<Integer, Integer> f1 = n -> n * n;
        System.out.println(f1.apply(5));

        Function<String, Integer> f2 = String::length;//x -> x.length();
        System.out.println(f2.apply("sampleData"));

        var al = List.of(
            new Employee("John", 50000, 5),
            new Employee("David", 20000, 2),
            new Employee("Scott", 30000, 3),
            new Employee("Scott", 40000, 6)
        );

        Function<Employee, Integer> f3 = x -> {
         int bonus = 0;
            if(x.salary > 20000)bonus = 1000;
            else if (x.salary < 20000) bonus = 2000;
            else bonus = 5000;
         return bonus;
        };

        for(Employee e : al)
            System.out.println(f3.apply(e));

        //we can use f1 and predicate also
        Predicate<Employee> predicate = y -> y.salary > 25000;
        System.out.println( " ---- " + predicate.test(al.get(0)));

        //first f2 will execute and the inputs is string "2", the result of f1 is feed to f2;
        //this is different from filter, filter will apply the on the every record in above we are using response of one to another
        System.out.println("andThen- " + f2.andThen(f1).apply(String.valueOf(2)));

        Function<Integer, Integer> f4 = n -> n * n * n;

        //first f1 will execute and the result is feed to f4
        System.out.println("compose- " + f4.compose(f1).apply(5));

    }
}
