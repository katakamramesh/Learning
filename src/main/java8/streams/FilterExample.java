package main.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class FilterExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,23,45,56,78,89,90);
        List<Integer> evenNumbers;

        //before java 8
        for(int i : numbers){
            if(i % 2 == 0)
                System.out.print("---" + i);
        }
        System.out.println("");

        //using java 8
        evenNumbers = numbers.stream().filter(x -> x % 2 == 0).toList();
        System.out.print(evenNumbers);
        System.out.println("");

        //alternative use
        numbers.stream().filter(y -> y % 2 == 0).forEach(p -> System.out.print(p + " - "));
        System.out.println("");

        numbers.stream().filter(y -> y % 2 == 0).forEach(System.out::print);
        System.out.println("");

        //multiple conditions
        numbers.stream().filter(a -> a % 2 == 0 && a % 3 == 0).forEach(System.out :: print);
        System.out.println("");

        //custom class
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"phone", 10000));
        productList.add(new Product(2,"tv", 20000));
        productList.add(new Product(1,"laptop", 30000));

        productList.stream().filter(x -> x.price > 15000).forEach(y -> System.out.print(y.name));
    }
}
