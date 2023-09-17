package org.example;
import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in) ;
    int rakam , toplam1 ,i ,toplam2 ,toplam3 ;
     System.out.println("Kaç eleman gösterelim: ");
    rakam = input.nextInt() ;
      toplam1 = 0 ;
      toplam2 = 1 ;
    for ( i = 2 ; i < rakam ; i++ ) {
        toplam3 = toplam2 + toplam1;
        System.out.print(toplam3+ " ");
        toplam1 = toplam2 ;
        toplam2 = toplam3 ;
    }
    }

}