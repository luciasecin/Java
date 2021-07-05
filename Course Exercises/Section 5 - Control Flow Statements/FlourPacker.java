public class FlourPacker {
    
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (goal < 0 || bigCount < 0 || smallCount < 0)         
            return false;

        for (int i = 0; i <= bigCount; i++) {
            for (int j = 0; j <= smallCount; j++) {
                if(5*i + smallCount - j == goal)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canPack(4, 1, 16));
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }
}
