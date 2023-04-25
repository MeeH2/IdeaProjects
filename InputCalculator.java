import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while (sc.hasNextInt()) {
            int number = sc.nextInt();
            sum += number;
            counter++;
        }
        sc.close();

        long avg = 0;
        if (counter > 0) {
            avg = Math.round((double) sum / counter);
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
