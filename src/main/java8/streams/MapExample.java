package main.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class MapExample {

    //map will take function as a parameter
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("axasdn", "by1111", "cz", "dhq", "uee");
        List<String> capsList = new ArrayList<>();

        //before java 8
        for(String i : stringList){
            capsList.add(i.toUpperCase());
        }
        System.out.println(capsList);

        //after java 8
        System.out.println(stringList.stream().map(x -> x.toUpperCase()).toList());

        //find the length of string
        stringList.stream().map(p -> p.length()).forEach(System.out :: println);
    }
}
