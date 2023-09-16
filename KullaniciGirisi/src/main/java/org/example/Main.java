package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String password, userName, answer, newPassword;

        System.out.print("Kullanıcı Adını Giriniz : ");
        userName = input.nextLine();

        System.out.print("Şifrenizi Giriniz : ");
        password = input.nextLine();

        if (userName.equals("Mahmut") && password.equals("123")) {
            System.out.println("Tebrikler Basardınız");

        } else {
            System.out.println("Şifrenizi Yanlış Girdiniz.Şifrenizi Sıfırlıyor musunuz? Sıfırlamak istiyorsanız EVET ,istemiyorsanız HAYIR yazın  ");
            answer = input.nextLine();
            if (answer.equals("EVET")) {
                System.out.println("YENİ ŞİFRENİZ GİRİNİZ : ");
                newPassword = input.nextLine();
                if (newPassword.equals("123") && newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

                } else {
                    System.out.println("ŞİFRE OLUSTURULDU");
                }
            } else if (answer.equals("HAYIR")) {
                 System.out.println("TEKRAR DENEYİNİZ");

            }
        }
    }}