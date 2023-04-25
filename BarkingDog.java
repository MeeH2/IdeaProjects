public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(true, 8));

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wakeUp = (hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <= 24);
        return barking == true && wakeUp;
    }
}
