package org.example;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(10);

        counter1.increase();
        counter1.decrease();
        System.out.println("Counter1 value: " + counter1.value());

        counter2.increase(5);
        counter2.decrease(3);
        System.out.println("Counter2 value: " + counter2.value());
    }
}
