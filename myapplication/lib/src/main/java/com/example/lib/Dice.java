package com.example.lib;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        System.out.println(Roll(6));

    }

    public static int Roll(int n){
        Random rand = new Random();
        int r= (int)rand.nextInt((n-1) + 1) + 1;
        return r;
    }
}