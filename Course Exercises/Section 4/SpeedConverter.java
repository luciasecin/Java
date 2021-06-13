public class SpeedConverter{

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            int i = -1;
            return Long.valueOf(i);
        }

        double mileToKm = 1.609;
        double result = kilometersPerHour/mileToKm;

        return Math.round(result);
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour >= 0)
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h" );
        else  
            System.out.println("Invalid Value");
    }

    public static void main(String[] args) {
        double kilometersPerHour = 6.745;
        printConversion(kilometersPerHour);
    }
}