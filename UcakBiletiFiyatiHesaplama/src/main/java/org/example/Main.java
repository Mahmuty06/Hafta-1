package org.example;
 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in) ;
        int yas , mesafe ,yolculukTipi ;
        double mesafeUcret = 0.1 ,toplam ;

        System.out.println("MESAFENİZ KAÇ KM : ");
        mesafe = input.nextInt();

        System.out.println("YAŞINIZ KAÇ :");
        yas = input.nextInt();

        System.out.println("YOLCULUK TİPİNİZ , TEK YÖN(1) YA DA ÇİFT YÖN(2)");
        yolculukTipi = input.nextInt();

        toplam = mesafe * mesafeUcret * yolculukTipi ;

        if (yas<12) {
            toplam = toplam * 0.5 ;
            System.out.println("Bilet Fiyatınız %50 İndirim Uygulandı : " + toplam );

        } else if ((yas>12) && (yas<24)) {
            toplam = toplam * 0.9 ;
            System.out.println("Bilet Fiyatınız %10 İndirim Uygulandı : "+ toplam);
            
        } else if (yas>65) {
            toplam =  toplam * 0.7 ;
            System.out.println("Bilet Fiyatınız %20 İndirim Uygulandı :"  + toplam);
            
        }
        else  {
            System.out.println("Bilet fiyatınız : " + toplam);

        }
        if( yolculukTipi == 2 ){
            toplam = toplam*0.8 ;
            System.out.println("Toplam fiyat " + toplam);
        }
    }
    
    
}