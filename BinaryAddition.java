import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first binary string: ");
        String a = scanner.nextLine();
        System.out.print("Enter the second binary string: ");
        String b = scanner.nextLine();

        String result = "";
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int total = carry;
            if (i >= 0) {
                total += Character.getNumericValue(a.charAt(i));
                i--;
            }
            if (j >= 0) {
                total += Character.getNumericValue(b.charAt(j));
                j--;
            }
            result = total % 2 + result;
            carry = total / 2;
        }

        System.out.println("Binary sum: " + result);
    }
}
