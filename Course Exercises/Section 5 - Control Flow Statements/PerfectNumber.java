public class PerfectNumber {
    
    public static boolean isPerfectNumber(int number) {
        
        if(number > 1){
            int sum = 0;
            for (int i = 1; i < number; i++) {
                sum += (number % i == 0) ? i : 0;
            }
            return number == sum;
        } else if (number == 1){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
}
