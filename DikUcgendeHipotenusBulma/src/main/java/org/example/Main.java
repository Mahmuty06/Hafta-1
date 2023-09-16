package org.example;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {

        int a,b,c,cevre ;
        double alan ;
        Scanner giris =new Scanner(System.in) ;
         System.out.println("Birinci Kenar Uzunluğunu Giriniz");
         a = giris.nextInt();

        System.out.println("İkinci Kenar Uzunluğunu Giriniz");
        b=giris.nextInt();

        System.out.println("Üçüncü Kenar Uzunluğunu Giriniz");
        c=giris.nextInt();

        cevre= a+b+c ;

        alan = Math.sqrt(cevre * (cevre-a) * (cevre-b) * (cevre-c));
        System.out.println("Ücgenin Çevresi : " + cevre);

        System.out.println("Ücgenin Alanı :" + alan);



        }
    }
