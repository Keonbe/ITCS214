import java.util.Scanner;
import java.util.Stack;

//add looping method or method the logic

public class DSA_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> Stack = new Stack<>();
        int loop = 1;
        do {
            System.out.print("Enter an expression: ");
            String input = scanner.next();
            char charString = input.charAt(0);

            for (int i = 0; i < input.length(); i++) {
                charString = input.charAt(i);
                if (charString == '(') {
                    Stack.push(charString);
                } else if (charString == ')' && Stack.empty()) {
                    //System.out.print("Unbalanced");
                    break;
                }

                if (charString == ')') {
                    char pop = Stack.peek(); //error if ()(()))
                    Stack.pop();
                    if (pop != '(') {
                        //System.out.print("Unbalanced");
                        break;
                    }
                }
            }

            if (Stack.empty()) { //error if ")()(()"
                System.out.print("Balanced");
            } else {
                System.out.print("Unbalanced");
            }

            System.out.println("\nContinue? 1-Yes 2-NO");
            loop = scanner.nextInt();
            while(loop!=1 && loop!=2){
                System.out.println("\nERROR: CHOOSE ONLY 1-Yes or 2-No");
                loop = scanner.nextInt();
            }
        }while(loop == 1);

        System.out.print("\nProcess Completed");
    }
} //user code, bad logic


