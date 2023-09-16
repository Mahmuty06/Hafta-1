package org.example;
import  java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in) ;
    int deger , kalan ;
    System.out.println("Doğum Yılınız ");
    deger = input.nextInt() ;

    kalan = deger % 12 ;
    switch (kalan) {
        case 0 :
            System.out.println("Siz Maymunsunuz");
            break ;
        case 1 :
            System.out.println("Siz Horozsunuz");
            break ;
        case 2:
            System.out.println("Siz Köpeksiniz");
            break ;
        case 3 :
            System.out.println("Siz Domuzsunuz");
            break ;
        case 4 :
            System.out.println("Siz Faresiniz");
            break ;
        case 5 :
            System.out.println("Siz Öküzsünüz");
            break ;
        case 6 :
            System.out.println("Siz Kaplansınız");
            break ;
        case 7 :
            System.out.println("Siz Tavşansınız");
            break ;
        case 8 :
            System.out.println("Siz Ejderhasınız");
            break ;
        case 9 :
            System.out.println("Siz Yılansınız");
            break ;
        case 10 :
            System.out.println("Siz Atsınız");
            break ;
        case 11 :
            System.out.println("Siz Koyunsunuz");
            break ;
    }

    }
}