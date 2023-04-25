public class ForLoopMiniChallenge {
    public static void main(String[] args) {

        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double calc = calculateInterest(100, rate);
            System.out.println("$100 at " + rate + "% interest = $" + calc);
        }
    }
    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}
