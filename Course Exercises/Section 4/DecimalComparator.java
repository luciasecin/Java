public class DecimalComparator {
    
    public static boolean areEqualByThreeDecimalPlaces(double first_decimal, double second_decimal) {
        long int_first_decimal = (long)(first_decimal*1000);
        long int_second_decimal = (long)(second_decimal*1000);

        if(int_first_decimal == int_second_decimal)
            return true;

        return false;
    }

    public static void main(String[] args) {
        double first_decimal = 3.1756;
        double second_decimal = 3.175;
        System.out.println(areEqualByThreeDecimalPlaces(first_decimal, second_decimal));
    }
}
