public class SecondsAndMinutes {

    public static String invalidValue = "Invalid Value";
    
    public static String getDurationString(long minutes, long seconds) {
        if(minutes < 0 || seconds < 0 || seconds >59)
            return invalidValue;

        long hours = minutes/60;
        minutes = minutes %60;
        return hours + "h " + minutes + "m " + seconds + "s";
    }

    public static String getDurationString(long seconds) {
        if(seconds < 0)
            return invalidValue;

        long minutes = seconds/60;
        seconds = seconds%60;
        return getDurationString(minutes, seconds);        
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(65, -45));
        System.out.println(getDurationString(3945L));
    }
}
