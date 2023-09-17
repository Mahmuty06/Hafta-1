package org.example;
import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mat, fizik, kimya, turkce, muzik;

        System.out.println("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.println("Türkçe Notunuz : ");
        turkce = input.nextInt();

        System.out.println("Müzik Notunuz : ");
        muzik = input.nextInt();

        // Notların 0 ile 100 arasında olduğunu kontrol et
        if (mat >= 0 && mat <= 100 &&
                fizik >= 0 && fizik <= 100 &&
                turkce >= 0 && turkce <= 100 &&
                kimya >= 0 && kimya <= 100 &&
                muzik >= 0 && muzik <= 100) {

            double average = (mat + fizik + turkce + kimya + muzik) / 5;

            if (average <= 54) {
                System.out.println("Kaldın!");
            } else {
                System.out.println("Tebrikler!");
            }
            System.out.println("Ortalaman : " + average);

        } else {
            System.out.println("Notlar 0 ile 100 arasında olmalıdır.");
        }
    }
}