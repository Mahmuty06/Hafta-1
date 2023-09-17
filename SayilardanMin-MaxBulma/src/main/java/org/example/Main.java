package org.example;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner input =new Scanner(System.in) ;
     int sayi , minSayi = 0 , maxSayi = 0  ;

        System.out.println("Kaç Sayı Gireceksiniz : ");
        sayi = input.nextInt();

        for ( int i =1 ; i <=sayi ; i++ ) {
            System.out.println( i + ". Sayıyı giriniz");
            int x = input.nextInt();


            if(x > maxSayi){
                maxSayi = x;
            }
            if(minSayi == 0) minSayi = x;
            if(x < minSayi){
                minSayi = x;
            }

        }
        System.out.println("Max sayı " + maxSayi);
        System.out.println("Min sayı " + minSayi);
    }
}