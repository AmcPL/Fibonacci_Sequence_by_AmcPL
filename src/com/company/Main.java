package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Fibonacci_Sequence(0);
    }
    public static int Fibonacci_Sequence(int n){
        ArrayList<Integer> Fibonacci = new ArrayList<Integer>(n);
        Fibonacci.add(0);
        if(n>0) {
            Fibonacci.add(1);
            for (int i = 1; i < n; ++i) {
                int temp = Fibonacci.get(i) + Fibonacci.get(i - 1);
                Fibonacci.add(temp);
            }
            System.out.println(Fibonacci);
        }
        else System.out.println("the value of n is not correct");
        System.out.println(Fibonacci);

    return 0;
    }
}
