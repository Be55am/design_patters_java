package tech.bsahli.creational.builder;

public class BuilderDemo {


    public static void main(String [] args){
        LunchOrder lunchOrder = new LunchOrder.Builder().bread("khobz").meat("meat").dressing("salad").build();

        System.out.println(lunchOrder);

    }
}
