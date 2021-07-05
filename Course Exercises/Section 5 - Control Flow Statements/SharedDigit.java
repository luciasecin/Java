public class SharedDigit {
    
    public static boolean hasSharedDigit(int a, int b) {
        
        if(a > 9 && a < 100 && b > 9 && b < 100){

            while(a > 0) {
                int digit_a = a % 10;
                a /= 10;
                int temp_b = b;
                while(temp_b > 0) {
                    int digit_b = temp_b%10;
                    temp_b /= 10;
                    if(digit_a == digit_b){
                        return true;
                    }    
                }    
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9, 19));
    }
}
