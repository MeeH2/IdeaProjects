public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
    }
    public static boolean isOdd(int number) {
        if (number > 0 && number % 2 == 1) return true;
        return false;
    }

    public static int sumOdd(int start, int end) {
        if(start > end || start < 0 || end < 0) return -1;
        int sum = 0;
        if (isOdd(start) && isOdd(end)) {
            for (int i = start; i <= end; i += 2) {
                sum += i;
            }
        }
        else if (isOdd(start) && !isOdd(end)) {
            for (int i = start; i <= end; i += 2) {
                sum += i;
            }
        }
        else for (int i = start + 1; i <= end; i += 2) {
                sum += i;
            }
        return sum;
    }
}
