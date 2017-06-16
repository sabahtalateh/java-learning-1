package com.sabahtalateh.course;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
        System.out.println(calc.getResult());
    }
}
