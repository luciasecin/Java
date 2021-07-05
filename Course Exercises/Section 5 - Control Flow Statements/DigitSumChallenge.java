public class DigitSumChallenge {
    
    public static int sumDigits(int num) {
        if(num < 10)
            return -1;

        int sum = 0;

        while(num > 0) {
            int digit = num%10;
            num /= 10;
            sum += digit;    
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(30062021));    
    }
}
