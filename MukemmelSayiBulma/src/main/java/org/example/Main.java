package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam = 0;

        System.out.println("Lütfen Bir Sayı Giriniz : ");
        sayi = input.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;
            }
        }
        if (sayi == toplam) {
            System.out.println(sayi + " Bu Sayı En Mükemmeldir .");
        } else {
            System.out.println(sayi + " Bu Sayı Mükemmel Sayı Değildir.");
        }
    }
}
