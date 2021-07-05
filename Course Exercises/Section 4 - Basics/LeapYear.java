public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999)
            return false;
        
        if (year%4 == 0){
            if (year%100 == 0){
                if (year%400 == 0){
                    return true;
                } else {
                    return false;
                }
            }
            return true; 
        }     
        return false;
    }

    public static void main(String[] args) {
        int year = 2017;
        System.out.println(isLeapYear(year));
    }
}
