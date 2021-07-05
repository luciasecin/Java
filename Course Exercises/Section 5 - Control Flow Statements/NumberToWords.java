public class NumberToWords {
    
    public static int getDigitCount(int number) {

        if(number == 0)
            return 1;

        if(number < 0)
            return -1;

        int digits = 0;
        while (number > 0){
            digits++;
            number /= 10;
        }
        return digits;
    }

    public static int reverse(int number) {

        String reverse_num = "";

        if(number < 0)
            reverse_num += "-";
    
        int num = Math.abs(number);

        while(num > 0) {
            int digit = num%10;
            num /= 10;
            reverse_num += digit;    
        }

        return (number == 0) ? 0 : Integer.parseInt(reverse_num);
    }

    public static void numberToWords(int number) {

        if(number >= 0){

            int num = reverse(number);
            int digits = getDigitCount(number);
        
            String num_string = "";

            for (int i = 0; i < digits; i++) {
                
                String digit = "";
                switch (num % 10) {
                    case 1:
                        digit = "One";                   
                        break;
                    case 2:
                        digit = "Two";                   
                        break;
                    case 3:
                        digit = "Three";                   
                        break;
                    case 4:
                        digit = "Four";                  
                        break;
                    case 5:
                        digit = "Five";                   
                        break;
                    case 6:
                        digit = "Six";                   
                        break;
                    case 7:
                        digit = "Seven";                   
                        break;
                    case 8:
                        digit = "Eight";                   
                        break;
                    case 9:
                        digit = "Nine";                   
                        break;
                    default:
                        digit = "Zero";
                        break;
                }

                if(i == digits - 1){
                    num_string += digit;
                } else {
                    num_string += digit + " ";
                }
                
                num /= 10;
            }
            System.out.println(num_string);
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }
}
