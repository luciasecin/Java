public class TeenNumberChecker {

    public static boolean hasTeen(int person1, int person2, int person3) {

        if(isTeen(person1) || isTeen(person2) || isTeen(person3))
            return true;

        return false;
    }

    public static boolean isTeen(int person) {
        if(person < 20 && person > 12)
            return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,24));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }
    
}
