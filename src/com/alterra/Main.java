package com.alterra;

public class Main {
    public static void main (String[]args){
        System.out.println("Hello Semesta");
        User newUser = new User();

        newUser.setNama("Naufal Alfarici");
        newUser.setHP("0897488419486");

        System.out.println(newUser.getInfo());
    }
}
