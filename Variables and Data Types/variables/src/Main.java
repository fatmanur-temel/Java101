//Java is a case sensitive language.
//reusabilitiy = tekrar tekrar kullanılabilirlik.
//Bellek kullanımını optime etmek için de değişken tanımlamak önemli.

public class Main {

    public static void main(String[] args) {
        int ogrenciSayisi = 12; //int > integer
        String metin = "Öğrenci sayısı: ";

        //System.out.println("Öğrenci sayisi: 10");
        //System.out.println("Öğrenci sayisi: 10");
        //System.out.println("Öğrenci sayisi: 10");

        System.out.println(metin + ogrenciSayisi);
        System.out.println(metin + ogrenciSayisi);
        System.out.println(metin + ogrenciSayisi);
        System.out.println(metin + ogrenciSayisi);
    }
}
