public class Main {

    public static void main(String[] args) {
        //fonksiyonlar kod tekrarını önler.
        //javada fonksiyonlar camel case ile yazılır.
        //method içerisinde gönderilen değerlere parametre/argüman denir.

        System.out.println(topla(1,7));
        System.out.println(topla2(1,2,3,4,5,6));
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

    //methoda gönderilecek parametre sayısı belli değilse '...' kullanılır.
    //Java gönderilen sayıları arka planda diziye çevirir.
    public static int topla2(int... sayilar){
        int toplam = 0;
        for (int sayi:sayilar){
            toplam += sayi;
        }
        return toplam;
    }
}
