package org.example;
import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
 Scanner deger = new Scanner(System.in) ;

 int sayi1 , sayi2 ,select ,sonuc ;

 System.out.println("Lütfen İlk Degeri Giriniz");
 sayi1 = deger.nextInt();

 System.out.println("Lütfen ikinci Degeri Giriniz");
 sayi2 = deger.nextInt();

    System.out.println("Lütfen Yapacağınız İşlemi Seçiniz ");
        System.out.println("Toplama İşlemi İçin : 1 ");
        System.out.println("Cıkarma İşlemi İçin : 2 ");
        System.out.println("Çarpma İşlemi İçin : 3 ");
        System.out.println("Bölme İşlemi İçin : 4 ");

    select = deger.nextInt();

    switch (select) {
        case 1 :
            sonuc = sayi1 + sayi2 ;
            System.out.println("Sonuc :" + sonuc) ;
            break;
        case 2 :
            sonuc = sayi1 - sayi2 ;
            System.out.println("Sonuc :" + sonuc) ;
            break;
        case 3 :
            sonuc = sayi1 * sayi2 ;
            System.out.println("Sonuc :" + sonuc) ;
            break;
        case 4 :
            if (sayi2 == 0)
            {
                System.out.println("Bölme işlemi için ikinci sayı 0 seçilemez");
            }
            else{
                sonuc = sayi1 / sayi2 ;
                System.out.println("Sonuc :" + sonuc) ;
            }
            
            break;
        default :
            System.out.println("Hatalı Seçim Yaptınız");
            break;

    }
    }
}