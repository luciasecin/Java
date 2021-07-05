public class FactorPrinter {
    
    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            String factors = "";
            for (int i = 1; i < number; i++) {
                if(number % i == 0)
                    factors += i + " ";
            }
            factors += number;
            System.out.println(factors);
        }
       
    }

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
}
