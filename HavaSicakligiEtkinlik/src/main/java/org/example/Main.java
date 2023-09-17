package org.example;
import java .util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
         int heat ;

        System.out.println("Sıcaklık giriniz : ");
        heat = input.nextInt() ;


        if (heat < 5) {
        System.out.println("Kayak Yapabilirisiniz ");

        } else if ( heat <= 25 ) {
          if (heat <= 15 ) {
              System.out.println("Sinemaya Gidebilirsiniz ");

          } if (heat >= 10 ) {
                System.out.println("Pikniğe Gidebilirisiniz ");

            }
        } else {
            System.out.println("Yüzmeye Gidebilirsiniz: ");
        }

    }

}