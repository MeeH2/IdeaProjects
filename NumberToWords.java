public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(100));
        System.out.println(reverse(1298));
        numberToWords(152);
    }
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        else if (number == 0) {
            System.out.println("Zero");
        }
        else {
            int reversedNumber = reverse(number);
            int digitCount = getDigitCount(number);
            int currentDigit;
            while (reversedNumber > 0) {
                currentDigit = reversedNumber % 10;
                switch (currentDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversedNumber /= 10;
            }
            int trailingZeroes = digitCount - getDigitCount(reverse(number));
            for (int i = 0; i < trailingZeroes; i++) {
                System.out.print("Zero ");
            }
        }
    }
    public static int reverse(int number) {
        boolean isNegative = number < 0;
        int reverseNumber = 0;
        number = Math.abs(number);
        while (number > 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }
        return isNegative ? -reverseNumber : reverseNumber;
    }
    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        int counter = 1;
        while(number >= 10) {
            counter++;
            number /= 10;
        }
        return counter;
    }
}
