public class SecondClass {
    public static void main(String[] args) {
        double firstValue = 20.00;
        double secondValue = 80.00;
        double thirdValue = (firstValue + secondValue) * 100.00;
        System.out.println("My values total = " + thirdValue);
        double remainder = thirdValue % 40.00;
        System.out.println("The remainder = " + remainder);
        boolean noRemainder = remainder == 0.00 ? true : false;
        System.out.println(noRemainder);
        if (!noRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
