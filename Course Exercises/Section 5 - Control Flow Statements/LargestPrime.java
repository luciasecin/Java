public class LargestPrime {

    public static int getLargestPrime(int number) {

        if(number < 2)
            return -1;

        int largest_prime = -1;

        for (int i = 2; i <= number; i++) {

            if(number % i == 0){

                boolean isPrime = true;
                int j = 2;
                
                while (isPrime && j < i) {
                    isPrime = i % j != 0;
                    j++;
                }

                largest_prime = isPrime ? i : largest_prime;
            }
        }
        return largest_prime;    
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }
    
}
