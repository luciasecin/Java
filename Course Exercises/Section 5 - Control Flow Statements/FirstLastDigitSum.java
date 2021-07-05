public class FirstLastDigitSum {
    
    public static int sumFirstAndLastDigit(int number) {

        if (number < 0)
            return -1;

        int last_digit = number%10;
        int first_digit = 0;

        while(number > 0) {
            first_digit = number%10;
            number /= 10;   
        }

        return last_digit + first_digit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-10));
    }
}
