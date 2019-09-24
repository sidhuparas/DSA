import java.util.Scanner;

public class ReverseStringWithSpecialCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine();

        char[] charArray = str.toCharArray();
        System.out.println(reverse(charArray));
        scanner.close();
    }
   
    private static char[] reverse(char array[]) {
        int j = array.length - 1;
        int i = 0;

        while(i < j) {
            if (!Character.isAlphabetic(array[i]))
                i++;
            else if(!Character.isAlphabetic(array[j]))
                j--;
            else {
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        return array;
    }
}