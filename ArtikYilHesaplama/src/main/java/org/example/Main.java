package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in) ;
       int yil ;

       System.out.println("HESAPLANACAK YILI GİRİNİZ");
       yil = input.nextInt();

       if (( yil % 4 == 0) || (yil % 100 == 0 && yil % 400 == 0 )) {
           System.out.println(yil + " yılı bir artık yıldır");
       }
       else {
           System.out.println(yil + " yılı bir artık yıl değildir" );
       }


    }
}