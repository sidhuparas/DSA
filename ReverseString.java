import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");

        String str = scanner.nextLine();
        scanner.close();

        reverseBySwapping(str.toCharArray());
        reverseByTempArray(str.toCharArray());
    }

    private static void reverseBySwapping(char[] array) {
        char temp;

        int size = array.length;

        for (int i=0; i< size/2; i++) {
            temp = array[i];
            array[i] = array[size-i-1];
            array[size-i-1] = temp;
        }

        System.out.println(array);
    }

    private static void reverseByTempArray(char[] array) {
        int size = array.length;

        char[] temp = new char[size];
        int j = array.length;
        //"Paras"
        for (int i = 0; i < size; i++) {
            temp[j - 1] = array[i];
            j--;
        }

        System.out.println(temp);
    }
}