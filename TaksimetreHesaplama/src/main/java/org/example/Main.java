package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km ;
        double perKm = 2.2 , toplam ;
        Scanner deger = new Scanner(System.in);
        System.out.println("Km değeri giriniz");
         km=deger.nextInt();

         toplam = (perKm * km) ;
         toplam =  toplam + 10.0 ;

         if (toplam < 20) {
             toplam= 20 ;
             System.out.println("Toplam Hesap Tutarı" + toplam );

         }
         else if  (toplam >20 ){
             System.out.println("Toplam Hesap Tutarı" + toplam);
         }

        }
    }
