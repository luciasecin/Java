public class SumOddRange {

    public static boolean isOdd(int number) {
        return number > 0 && number % 2 == 1;
    }

    public static int sumOdd(int start, int end) {

        if(end < start || end < 1 || start < 1)
            return -1;
        
        int sum = 0;
        start = isOdd(start) ? start : start + 1;
        for (int i = start; i <= end; i = i+2) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }
    
}
