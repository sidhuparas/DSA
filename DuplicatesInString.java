import java.util.Scanner;

public class DuplicatesInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine();
        
        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        
        for(int i = 0; i < 256; i++) {
            if (count[i] > 1)
            System.out.printf("%c, count = %d \n", i, count[i]);
        }

        scanner.close();
    }
    
}