package main.java8;

public class LambdaExpressions {

    //what is lambda expression --> it is an anonymous function which has no return type, no access modifier, no method name

    //before java 8 - no args
    public void print(){
        System.out.println("all is ok");
    }
    //in java 8 () -> sout("all is ok");

    //before java 8 -- with args
    public void sum(int a , int b){
        System.out.println(a + b);
    }
    //in java 8 (a,b) -> sout(a + b);

    //before java 8 -- with return and args
    public int multiple(int a){
        return a * a;
    }
    //in java 8 (a) -> a * a or a -> a * a;
    //if we want return statement then we need to mention {} like a -> {return (a * a);}

    //semicolon is required in case of {} in lambda expression

}
