public class EqualSumChecker {
    
    public static boolean hasEqualSum(int int1, int int2, int int3) {

        if((int1 + int2) == int3)
            return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(3, 4, 7));
    }
}
