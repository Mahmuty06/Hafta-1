import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        int mat,turkce,fizik,kimya,tarih,muzik ;
        Scanner input =new Scanner(System.in);

        System.out.println("Matematik Notu: ");
        mat = input.nextInt();

        System.out.println("Türkçe Notu: ");
        turkce = input.nextInt();

        System.out.println("Fizik Notu: ");
        fizik = input.nextInt();

        System.out.println("Kimya Notu: ");
        kimya = input.nextInt();

        System.out.println("Tarih Notu: ");
        tarih = input.nextInt();

        System.out.println("Müzik Notu: ");
        muzik = input.nextInt();

        int toplam =mat+turkce+fizik+kimya+tarih+muzik ;
        double ortalama = toplam / 6 ;

        System.out.println("ortalamanız : "+ortalama);

        boolean sonuc = ortalama > 60 ;
        System.out.println(sonuc == true ? "Sınıfı geçtiniz." : "Sınıfta kaldınız.");
    }
}