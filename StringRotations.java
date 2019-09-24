import java.util.Scanner;

public class StringRotations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String 1: ");
        String s1 = scanner.nextLine();

        System.out.println("Enter String 2: ");
        String s2 = scanner.nextLine();    

        System.out.println(areRotations(s1, s2));
        scanner.close();
    }

    private static String areRotations(String s1, String s2) {
        String temp = s1.concat(s1);

        if (s1.length() == s2.length() && temp.contains(s2)) {
            return "Yes, they are rotations of each other";
        } else {
            return "No, they are not rotations of each other";
        }
    }
}