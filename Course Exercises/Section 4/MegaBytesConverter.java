public class MegaBytesConverter {
    
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int mbToKb = 1024;
        int remainingKB = kiloBytes % mbToKb;
        int megaBytes = kiloBytes/mbToKb;

        if(kiloBytes < 0)
            System.out.println("Invalid Value");
        else
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKB + " KB");

    }

    public static void main(String[] args) {
        int kiloBytes = 5000;
        printMegaBytesAndKiloBytes(kiloBytes);
    }
    
}
