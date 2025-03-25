import java.util.Scanner;

public class DSA_11and12 {

    /*
        1. Write a program that accepts a sentence. Assume that the sentence does not contain special characters.
        Display each word in the sentence and the number of times it appears(Do not use predefined array class).
        Input a sentence - "to be or not to be that is the question"
        Output:
        to - 2      that - 1
        be - 2      is - 1
        or - 1      the - 1
        not - 1     question - 1

        2. Write a program that accepts a word. Display TRUE if the letters used can be found on the same row of the computer keyboard
        otherwise, Display FALSE.
        Input - retire          Input - Coffee              Input - dash
        Output: TRUE            Output: False               Output: TRUE
         */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select Program:\nWord Counter - 1\nSame Row - 2\nEnter your selection[1 / 2]: ");
        int selection = scanner.nextInt();
        scanner.nextLine(); //Add this line to consume the newline character*

        if (selection == 1) { //No.1
            System.out.print("Input a sentence: ");
            String sentence = scanner.nextLine(); //either nextLine() or next(), but next() causes issues
            String[] words = sentence.split(" "); //split string into substrings by spliting " " or a space appears
            int[] count = new int[words.length]; //count of each word into the substring made(sentence splitted into words)

            for (int i = 0; i < words.length; i++) { //hardest part, traversal of data structure. substring searching
                count[i] = 1; //default count
                for (int j = i + 1; j < words.length; j++) { //parallel array traversal, count traversal
                    if (words[i].equals(words[j])) { // if "words" is the same as the next word then increment hence i++
                        count[i]++;
                    } //what goes on here there is 2 arrays & you search that through a loop(first loop) which sets the default count and another loop(second loop)
                } //searches if given word is already present beforehand, compares current to the next word. if yes then ++, if not then count 1
            }

            System.out.println("\nOutput:");
            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i] + " - " + count[i] + "\n"); //prints each words and each count stored in 2 parallel arrays
            }

        } else if (selection == 2) { //No.2
            System.out.print("\nInput a word: ");
            String input = scanner.nextLine();
            String wordFinal = input.toLowerCase();
            int strsize = wordFinal.length();
            System.out.println("Input - " + wordFinal);

            String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

            String row = null;
            for (String i : rows) { //for loop, loops through rows[]
                if (i.indexOf(wordFinal.charAt(0)) != -1) {
                    row = i;
                    break;
                }
            }

            if (row == null) {
                System.out.println("Output: FALSE");
            } else {
                boolean isSameRow = true; //always assume valid until its not, mali na false nilagay
                for (int i = 1; i < strsize; i++) { //this search algo is for checking if TRUE or FALSE - loops through the word
                    if (row.indexOf(wordFinal.charAt(i)) == -1) { //sakit sa ulo, checks if (word.charAt(i)) is in the same row
                        isSameRow = false;
                        break;
                    }
                }

                if (isSameRow) {
                    System.out.println("Output: TRUE");
                } else System.out.println("Output: FALSE");
            }

        } else { //catch error
            System.out.println("\nInvalid input, Try again\n");
            System.out.print("Select Program:\nWord Counter - 1\nSame Row - 2\nEnter your selection: ");
            selection = scanner.nextInt();
            if (selection != 1 || selection != 2){
                System.out.println("\nprogram terminated...");
            }
        }
    }
}
