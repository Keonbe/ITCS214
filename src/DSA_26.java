import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

/*
Problem:  Apply Queue to create a program that converts a decimal integer to binary.
You may combine queue and other data structures that you know.Concatenation of character or String value is not allowed.
If the input is 14, then display 1110.

Process: Divide the number repeatedly by the base of the new number system, in this case 2 for binary, until quotient becomes 0.  Get the remainder after every operation starting from the last operation up tp the first.
operation	quotient	remainder
14/2 	7 	0
7/2 	3 	1
3/2 	1 	1
1/2 	0 	1
14 in binary is 1110
 */

public class DSA_26{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter a Decimal Number: ");
        int decimal = scanner.nextInt();

        while(decimal != 0){ //repeats and divides
            int remainder = decimal % 2;
            queue.add(remainder); //remainder, not decimal* logic error
            decimal /= 2;
        }
        //System.out.println(decimal);
        //System.out.println(queue);
        while(!queue.isEmpty()){
            stack.push(queue.poll());//for each removed elem in queue -> push in stack
        }
        //System.out.println(stack);
        System.out.print("Decimal to binary: ");
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}

