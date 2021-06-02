package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        for (int i = 1; i <= n;) {
            f*= i;
            i++;
            //System.out.printf("%-3dx%-5d=%-1d\n",n,i,m);

        }
        System.out.println(f);
    }}
