package com.alterra;

public class Main {
    public static void main (String[]args){
        System.out.println("Hello Semesta");
        User newUser = new User();

        newUser.setNama("Wahyu Nusantara Azis");
        newUser.setHP("082114161323");

        System.out.println(newUser.getInfo());

        TestingFitur1 newTest = new TestingFitur1();
        newTest.setCoverage(40);
        System.out.println(newTest);
    }
}
