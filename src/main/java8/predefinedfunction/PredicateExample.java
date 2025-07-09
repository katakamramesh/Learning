package main.java8.predefinedfunction;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> predicate = (z) -> (z > 5);
        System.out.println("ex1: " + predicate.test(11));//check the number is > 5

        Predicate<String> predicate1 = (x) -> (x.length() >  10);
        System.out.println("ex2: " + predicate1.test("check"));//check if len is > 10

        List<String> stringsList = List.of("basdb", "iuas","asiuoqqasdh", "asdiu");
        for(int i = 0; i < stringsList.size() ; i++){
            if(predicate1.test(stringsList.get(i))){// based on condition, handle further
                System.out.println("ex3: " + stringsList.get(i));
            }
        }


    }
}
