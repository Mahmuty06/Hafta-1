package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner deger =new Scanner(System.in) ;

        double armut ,elma , domates , muz , patlican ,toplam ,armutKilo , elmaKilo,muzKilo,
        domatesKilo , patlicanKilo ;

        armutKilo = 2.14;
        elmaKilo = 3.67 ;
        domatesKilo = 1.11;
        muzKilo = 0.95 ;
        patlicanKilo = 5.00 ;

        System.out.println("Armut kaç kilo aldınız ");
        armut = deger.nextDouble();

        System.out.println("Elma kaç kilo aldınız ");
        elma =deger.nextDouble() ;

        System.out.println("Domates kaç kilo aldınız ");
        domates = deger.nextDouble();

        System.out.println("Muz kaç kilo aldınız ");
        muz =deger.nextDouble() ;

        System.out.println("Patlıcan kaç kilo aldınız ");
        patlican = deger.nextDouble();

        toplam = (armutKilo * armut) + (elmaKilo *  elma) +
                (domates * domatesKilo) + (muz * muzKilo) + (patlicanKilo* patlican) ;
        System.out.println("TOPLAM BORÇ : " + toplam );

    }

}