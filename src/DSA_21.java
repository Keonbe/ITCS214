import java.util.Scanner;
import java.util.Stack;

public class DSA_21 { //add looping, check rubric
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> Stack = new Stack<>();
        System.out.print("Input size of stack:");
        int size = scanner.nextInt(), i = 0;
        while (i < size){
            System.out.print("Input elements:");
            int n = scanner.nextInt();
            i++;
            Stack.push(n); //Always test variables (i) instead of (n)
            System.out.println("Top: " + Stack.peek());
        }
        System.out.println("Current stack: " + Stack);

        System.out.print("\nDoes stack contains:");
        int srch = scanner.nextInt();
        System.out.print(Stack.search(srch));
        System.out.println("\nEnd of program");
    }
}

