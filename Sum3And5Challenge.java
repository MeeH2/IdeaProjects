public class Sum3And5Challenge {
    public static void main(String[] args) {

        int matchCount = 0;
        int matchSum = 0;

        for (int loop = 1; loop <= 1000; loop++) {
            if ((loop % 3 == 0) && (loop % 5 == 0)) {
                matchCount++;
                matchSum += loop;
                System.out.println("Found a match = " + loop);
            }
            if (matchCount == 5) break;
        }
        System.out.println("Sum = " + matchSum);
    }
}
