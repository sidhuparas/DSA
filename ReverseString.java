public class ReverseString {

    public static void main(String[] args) {
        String str = "Android OS";
        reverse(str.toCharArray(), str.toCharArray().length);
    }

    private static void reverse(char[] array, int size) {
        char temp;

        for (int i=0; i< size/2; i++) {
            temp = array[i];
            array[i] = array[size-i-1];
            array[size-i-1] = temp;
        }

        System.out.println(array);
    }
}