public class SecondsMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-70, 35));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0)
            return "Invalid data for seconds(" + seconds + "), must be positive";
        //int minutes = seconds / 60;
        return getDurationString(seconds/60, seconds%60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0)
            return "Invalid data for minutes(" + minutes + "), must be positive";
        if (seconds < 0 || seconds > 59)
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
        int hours = minutes / 60;
        int remainingM = minutes % 60;
        int remainingS = seconds % 60;
        return (hours + "h " + remainingM + "m " + remainingS + "s");
    }
}
