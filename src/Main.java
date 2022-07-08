import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double candies []= {1.0,5.6,-2.5,6.2,9.1,10.7,1.9,12.6,-8.2,-0.9,7.0,4.8,7.1,3.9,-8.6};
        double sum = 0;
        int num = 0;
        boolean proverka = false;
        for (double whole : candies) {
            if (whole < 0){
                proverka = true;
            }else if (whole > 0 && proverka){
                sum += whole;
                num ++;
                System.out.println(whole);
            }
        }
        System.out.println("Общее арифметиеское число " + sum / num);
    }
}