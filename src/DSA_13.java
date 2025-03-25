import java.util.Scanner;

public class DSA_13 {

    /*
    A program containing the following user-defined methods. You are not allowed to use  built-in methods in Java.
    1. Method that returns the length of an n-digit parameter.   If the value submitted to the  method is 85263 then your program should return 5 because 85263 is a 5-digit number.
    2. Method that returns the power of a given base and exponent.  If the value submitted to the method is 3 for base and 4 for exponent then the method should return 64 because 3
    raised to 4 ( 34) is 64.
    3. Method that determines whether a given parameter n is an Armstrong number or not.  This method will call the methods created in 1 and 2.A number (n) is said to be an
    Armstrong number if the sum of the nth powers of each of its digits is equal to the number (n).

     Example 1:  370 is an Armstrong number because the 33 + 73 + 03 = 370.  370 == 370
      therefore, 370 is an Armstrong number.
      Each digit of 370 is raised to 3 since 370 is a 3-digit number.

    Example 2:  25 is NOT an Armstrong number because the 22 + 52 = 29.    25 != 29
     therefore, 25 is not an Armstrong number.
     Each digit of 25 is raised to 2  since 25 is a 2-digit number.


    EXPECTED OUTPUT:
    Sample Run 1:
        Enter n:   8208
        8128 is an Armstrong number
    Sample Run 2:
        Enter n:   523
        8128 is NOT an Armstrong number
    */

    //mistake: forgetting and not using placeholder number, read your code carefully lalo na sa solutions/logic
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        int ndigit = Integer.parseInt(input);
        int length = ndigitLength(input);

        System.out.println(length + " is the number of digits.");

        if (isArmstrongNumber(input)) {
            System.out.println(ndigit + " is an Armstrong number.");
        } else {
            System.out.println(ndigit + " is NOT an Armstrong number.");
        }

        scanner.close();
    }

    public static int ndigitLength(String input) {
        return input.length();
    }

    public static int baseExponent(int base, int exponent) {
        int power = 1;
        for (int i = 0; i < exponent; i++) {
            power *= base;
        }
        return power;
    }

    public static boolean isArmstrongNumber(String n) {
        int numOrig = Integer.parseInt(n);
        int length = ndigitLength(n);
        int sum = 0;
        int num = numOrig;

        while (num > 0) {
            int digit = num % 10;
            sum += baseExponent(digit, length);
            num /= 10;
        }

        return sum == numOrig;
    }
}
