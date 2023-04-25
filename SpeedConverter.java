public class SpeedConverter {

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(25.42));
        printConversion(90.75);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        double miles = kilometersPerHour / 1.609;
        long miles1 = (long) Math.round(miles);
        if (kilometersPerHour < 0) {
            return -1;
        }
        else return miles1;
    }
    public static void printConversion(double kilometersPerHour) {
        double miles = kilometersPerHour / 1.609;
        long miles1 = (long) Math.round(miles);
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else System.out.println(kilometersPerHour + " km/h = " + miles1 + " mi/h");
    }
}
