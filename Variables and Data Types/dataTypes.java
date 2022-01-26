//Java tip güvenli bir dildir.
/* Primitive types:
    boolean | 1 byte
    char    | 2 bytes
    byte    | 1 byte
    short   | 2 bytes
    int     | 4 bytes
    long    | 8 bytes
    float   | 4 bytes
    double  | 8 bytes
 */

public class Main {

    public static void main(String[] args) {
        //tam sayıları tutmak için default olarak int kullanılır;
	    int number1 = 12;
        // number = "Antalya" > Incompatible types
        number1 = 13;

        //ondalıklı sayıları tutmak için default olarak double kullanılır;
        double number2 = 12.5;

        //karakter tutmak için char, tek tırnak ile birlikte kullanılır;
        char karakter = 'A'; 
    }
}
