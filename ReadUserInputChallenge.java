import java.util.Scanner;

public class ReadUserInputChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = 1;
        double sum = 0;

        while (counter <= 5) {
            System.out.println("Enter a number #" + counter + ":");
            String nextNumber = sc.nextLine();
            try {
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number");
            }
        }
        System.out.println("The sum of all 5 numbers are " + sum);
    }
}
