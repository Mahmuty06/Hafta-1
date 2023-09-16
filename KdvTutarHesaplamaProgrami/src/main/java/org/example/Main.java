package org.example;
import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
      double kdvOran1 , kdvOran2, tutar, kdvliTutar ;
      kdvOran1 = 0.18;
      kdvOran2 = 0.08 ;

      Scanner input = new Scanner(System.in) ;
      System.out.println("Lütfen tutar giriniz.");

      tutar = input.nextDouble();
        System.out.println("Girdiğiniz Tutar: " +tutar);
      if((tutar < 1000) && (tutar >0)){
          kdvliTutar = tutar * kdvOran1 + tutar;
          System.out.println("Kdv oranınız: " + kdvOran1);
          System.out.println("Kdvli tutar sonucunuz " + kdvliTutar);
      }
       else if(tutar>1000){
           kdvliTutar=tutar * kdvOran2 + tutar;
          System.out.println("Kdv oranınız: " + kdvOran2);
          System.out.println("Kdvli tutar sonucunuz " + kdvliTutar);
        }
    }
    }
