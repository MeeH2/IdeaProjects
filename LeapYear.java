public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1200));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(-1, 2018));
        System.out.println(getDaysInMonth(2, 2020));
    }
    public static boolean isLeapYear(int year) {
        boolean isYear = (year >= 1 && year <= 9999);
        if (year % 4 == 0 && isYear == true) {
            if (year % 100 == 0 && isYear == true) {
                if (year % 400 == 0 && isYear == true) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) return -1;
        switch(month){
            case 1,3,5,7,8,10,12:
                return 31;
            case 2:
                if (isLeapYear(year) == true) return 29;
                return 28;
            case 4,6,9,11:
                return 30;
            default:
                return -1;

        }
    }
}
