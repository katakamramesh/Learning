package main.java8.predefinedfunction;

import java.util.ArrayList;
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


        // Ex4: Single employee test
        Employee emp = new Employee("John", 20000, 2);

        // Predicate: Salary > 30000 and Experience > 3
        Predicate<Employee> pr = e -> e.salary > 30000 && e.experience > 3;
        System.out.println(pr.test(emp));  // Output: false

        // Ex5: Filter a list of employees
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("John", 50000, 5));
        al.add(new Employee("David", 20000, 2));
        al.add(new Employee("Scott", 30000, 3));
        al.add(new Employee("Scott", 40000, 6));

        for (Employee e : al) {
            if (pr.test(e)) {
                System.out.println(e.ename + " " + e.salary);
            }
        }

    }


}

class Employee {
    String ename;
    double salary;
    int experience;

    Employee(String ename, double salary, int experience) {
        this.ename = ename;
        this.salary = salary;
        this.experience = experience;
    }
}
