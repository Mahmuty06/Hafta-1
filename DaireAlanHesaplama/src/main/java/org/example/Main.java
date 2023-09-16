package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner deger =new Scanner(System.in) ;
        int yariCap , derece ;
        double pi = 3.14 , alan ;

        System.out.println("Lütfen Yarıçap Değeri Giriniz");
        yariCap = deger.nextInt() ;
        System.out.println("Lütfen Derece Giriniz");
        derece = deger.nextInt() ;

        alan =(pi * (yariCap * yariCap) * derece ) / 360 ;
        System.out.println("Hesaplanan Alan: " +alan);

    }
}