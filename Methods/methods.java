public class Main {

    public static void main(String[] args) {
	    //fonksiyonlar kod tekrarını önler.
        //javada fonksiyonlar camel case ile yazılır.

        System.out.println(topla(1,7));
    }

    //bir eylem yapması istenilen methodlara 'void' fonksiyonlar denir
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }

    //geriye bir değer döndürmesi istenilen fonksiyonlarda, fonksiyon tipini belirtiriz.
    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }
}
