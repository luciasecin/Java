public class NumberPalindrome {
    
    public static boolean isPalindrome(int num) {
        
        String number_string = Integer.toString(num);
        String reverse_num = "";

        if(num < 0)
            reverse_num += "-";
        
        num = Math.abs(num);
        while(num > 0) {
            int digit = num%10;
            num /= 10;
            reverse_num += digit;    
        }

        return number_string.equals(reverse_num);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1121211));
    }
}
