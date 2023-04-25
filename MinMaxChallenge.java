import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double min = 0;
        double max = 0;
        int loopCounter = 0;

        while (true) {
            System.out.println("Enter a number or any character to exit:");
            String nextValue = sc.nextLine();

            try {
                double num = Double.parseDouble(nextValue);
                if (loopCounter == 0 || num < min) {
                    min = num;
                }
                if (loopCounter == 0 || num > max) {
                    max = num;
                }
                loopCounter++;

            } catch (NumberFormatException nfe) {
                break;
            }
        }
        if (loopCounter > 0) {
            System.out.println("min = " + min + ", max = " + max);
        } else {
            System.out.println("There were no valid data");
        }
    }
}
