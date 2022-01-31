import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        //Stringler karakter dizileridir.
	    String mesaj = "Bugün hava çok güzel.";

        System.out.println(mesaj);

        //Bir stringin eleman sayısını bulma;
        System.out.println("Eleman sayısı: "+mesaj.length());

        //Bir stringin belirli bir karakterini bulma;
        System.out.println("5. eleman: "+mesaj.charAt(4));

        //iki metni birleştirmek (concatenation);
        //Birleştirme kalıcı olmaz. Kalıcı olması için bunu bir değişkene atamak gerekir.
        System.out.println(mesaj.concat(" Yaşasın!"));

        //bir karakterin, stringde kaçıncı elemanda olduğunu bulma;
        //ilk bulduğu noktada aramayı bitirir.
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.indexOf("av"));

        //metindeki belirli karakterlerin değiştirilmesi;
        //değişim kalıcı değildir.
        System.out.println(mesaj.replace(' ','-'));

        //bir stringin içinden parça almak;
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,5)); //5'e kadar alır, 5'ü almaz.

        //stringi parçalama;
        for(String kelime: mesaj.split(" ")) {
            System.out.println(kelime);
        }

        //metinin tamamını küçük harf yapma;
        System.out.println(mesaj.toLowerCase());

        //metinin tamamını büyük harf yapma;
        System.out.println(mesaj.toUpperCase());
    }
}
