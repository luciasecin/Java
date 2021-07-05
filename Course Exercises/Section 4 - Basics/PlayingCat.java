public class PlayingCat {
    
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(!summer && temperature >=25 && temperature <= 35)
            return true;
        if(summer  && temperature >=25 && temperature <=45)
            return true;
        
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 31));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(true, 47));
    }
}
