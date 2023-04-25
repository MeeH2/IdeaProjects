public class SwitchChallenge {
    public static void main(String[] args) {
//        char alphabet = 'r';
//        switch (alphabet) {
//            case 'A':
//                System.out.println("A is able");
//                break;
//            case 'B':
//                System.out.println("B is Baker");
//                break;
//            case 'C':
//                System.out.println("C is Charlie");
//                break;
//            case 'D':
//                System.out.println("D is Dog");
//                break;
//            case 'E':
//                System.out.println("E is Easy");
//                break;
//            default:
//                System.out.println("Letter " + alphabet + " was not found");
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
    }
    public static void printDayOfWeek(int day) {
        String dayOfTheWeek = switch (day) {
            case 0 -> { yield "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "invalid day";
        };
        System.out.println(day + " stands for " + dayOfTheWeek);
    }

    public static void printWeekDay(int day) {

        String dayOfWeek = "Invalid Day";
        if (day == 0) {
            dayOfWeek = "Sunday";
        } else if (day == 1) {
            dayOfWeek = "Monday";
        } else if (day == 2) {
            dayOfWeek = "Tuesday";
        } else if (day == 3) {
            dayOfWeek = "Wednesday";
        } else if (day == 4) {
            dayOfWeek = "Thursday";
        } else if (day == 5) {
            dayOfWeek = "Friday";
        } else if (day == 6) {
            dayOfWeek = "Saturday";
        }

        System.out.println(day + " stands for " + dayOfWeek);
    }
}

