public class Main {

    public static void main(String[] args) {

        double[] arrayList = {1.2,1.3,6.3,5.6};
        double total = 0;
        double max = arrayList[0];

        for(double number:arrayList){
            if (max<number){
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }

        System.out.println("Toplam: " +total);
        System.out.println("En büyük sayı: "+max);
    }
}
