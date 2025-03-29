import java.util.Scanner;
import java.util.Stack;

public class DSA_24 { //check algo(own algo), check rubric
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> Stack = new Stack<>();
        System.out.print("Enter word to check if PALINDROME: ");
        String input = scanner.next(), wordInput = input.toLowerCase();
        char charIndexString = wordInput.charAt(0);

        for(int i = 0; i < wordInput.length(); i++){
            charIndexString = wordInput.charAt(i);
            //System.out.println(charIndexString); To check
            Stack.push(charIndexString);
        }
        char top = Stack.peek();

        for(int i = 0; i < wordInput.length(); i++){
            charIndexString = wordInput.charAt(i);
            top = Stack.peek();
            Stack.pop();
        }

        if(charIndexString != top){
            System.out.println("FALSE");
        }else{
            System.out.println("TRUE");
        } //error test == true, but works most of the time
    }
}
