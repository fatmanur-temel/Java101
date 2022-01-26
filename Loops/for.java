public class Main {

    public static void main(String[] args) {

        //ilk kısımda sayaç tanımlaması yapıyoruz.
        //ikinci kısım, döngünün devam etme şartı
        //üçüncü kısım, sayacın artış miktarı

        //1-10 arası sayıların ekrana yazdırılması
        /*for (int i=1; i<=10;i++){
            System.out.println("i= "+i);
        }*/

        //1-10 arasındaki tek sayıların ekrana yazdırılması
        for (int i=1; i<=10; i+=2) {
            System.out.println(i);
        }
    }
}
