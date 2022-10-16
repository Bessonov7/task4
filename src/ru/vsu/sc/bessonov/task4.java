package ru.vsu.sc.bessonov;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        int n;
        Scanner in = new Scanner(System.in);

        n = readInt(in);

        System.out.println(sumPrime(n));
    }

    public static int readInt(Scanner sc) {
        while (true) {
            try {
                String s = sc.nextLine();
                return Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println("Введите целочисленное значение ");
            }
        }
    }
    public static int chekPrime(int x){
        for (int i = 2; i <= Math.sqrt(x); i++){
            if (x % i == 0){
                return 0;
            }
        }
        return x;
    }

    public static int sumPrime(int x){
        int res = 0;
        for (int i = 2; i <= x; i++){
            res += chekPrime(i);
        }
        return res;
    }
}

