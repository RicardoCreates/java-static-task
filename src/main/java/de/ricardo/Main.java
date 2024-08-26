package de.ricardo;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        Counter.incrementTotalCount();
        Counter.incrementTotalCount();

        counter1.incrementInstanceCount();
        counter1.incrementInstanceCount();

        counter2.incrementInstanceCount();

        System.out.println(counter1);
        System.out.println(counter2);

        System.out.println("Total Count: " + Counter.getTotalCount());

        int sum = Calculator.add(12, 15);
        System.out.println("Sum: " + sum);

        int sum2 = Calculator.subtract(12, 15);
        System.out.println("Sum2: " + sum2);

        int sum3 = Calculator.multiply(12, 15);
        System.out.println("Sum3: " + sum3);

        double sum4 = Calculator.divide(12, 15);
        System.out.println("Sum4: " + sum4);

    }
}