public class Main {

    public static void main(String[] args) {
	    // kendisinden başka tüm pozitif bölenlerinin sayısının toplamı kendisine eşit olan sayı.
        //6 --> 1+2+3=6

        int number = 5;
        int total = 0;

        for (int i = 1; i<number; i++){
            if (number % i == 0){
                total += i;
            }
        }

        if (number == total)
            System.out.println(number + " mükemmel sayıdır.");
        else
            System.out.println(number + " mükemmel sayı değildir.");
    }
}
