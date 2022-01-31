public class Main {

    public static void main(String[] args) {

        int number = 23;
        boolean isPrime = true;

        if (number<1) {
            System.out.println("Geçersiz sayı!");
            return;
        }

        for(int i =2; i<number; i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime == false || number == 1){
            System.out.println(number + " asal değildir.");
        }
        else{
            System.out.println(number + " asaldır.");
        }
    }
}
