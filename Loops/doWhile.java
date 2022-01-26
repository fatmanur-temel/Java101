public class Main {

    public static void main(String[] args) {

        //kullanım olarak while döngüsüne benzer.
        //While döngüsünden farkı, şart sağlanmasa bile bir kere çalışır.
        //Önce do'nun içi çalışır, daha sonra şart kontrol edilir.

        int a = 1;
        do {
            System.out.println(a);
            a++;
        }while (a<10);
    }
}
