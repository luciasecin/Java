public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int a, int b) {

        if(a > 9 && b > 9){
            int min = Math.min(a, b);
            int gdc = 0;
            for (int i = 1; i <= min ; i++) {
                if(a%i == 0 && b%i == 0)
                    gdc = i;
            }
            return gdc;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
    
}
