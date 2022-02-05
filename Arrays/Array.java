public class Main {

    public static void main(String[] args) {

        //Diziler referans tiptir!!!

        //değişken tipinin hemen sağ tarafına [] koyulur.
        //atamanın sağ tarafına dizinin boyutu belirtilir.
        //indeksler 0'dan başlar.

        String[] ogrenciler = new String[4];
        ogrenciler[0]="Fatmanur";
        ogrenciler[1]="Kerim";
        ogrenciler[2]="Engin";
        ogrenciler[3]="Derin";

        /*for(int i=0; i<ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }*/

        //for döngüsü ile yapılan işlemin aynısını for each döngüsü ile daha kolay yapabilriz.
        for (String ogreci:ogrenciler) {
            System.out.println(ogreci);
        }
    }
}
