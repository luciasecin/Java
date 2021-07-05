public class NumberOfDaysInMonth {
    
    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999)
            return false;
        
        if(((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0)
            return true;

        return false;
    }

    public static int getDaysInMonth(int month, int year) {

        if(year < 0 || year > 9999)
            return -1;

        switch(month){
            case 1:
                return 31;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;
        }
        
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }
}
