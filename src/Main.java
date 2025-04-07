import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        String numberString = String.valueOf(num);
        double sum = 0;
        for (int i = 0; i < numberString.length(); i++) {
            sum += Integer.parseInt(String.valueOf(numberString.charAt(i)));
        }
        return sum / numberString.length();
    }
}
