import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DSA_25 { //class/file name reflects on whole program
    private final Queue<Integer> queue = new LinkedList<>(); //for methods or objects/classes outside of MainProgram
    private final Scanner scanner = new Scanner(System.in); //allows for queue&scanner to be accessed securely w/o affecting main program

    //add items 1
    public void addItem() {
        System.out.print("Enter an item you want to add: ");
        int item = scanner.nextInt();
        queue.add(item);
    }

    //delete items 2
    public void deleteItem() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            int removedItem = queue.poll();
            System.out.println("Removed item: " + removedItem);
        }
    }

    //show num of items 3
    public void showNumberOfItems() {
        System.out.println("Number of items in the queue: " + queue.size());
    }

    //show min max 4
    public void showMinMaxItems() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (Integer item : queue) {
                if (item < min) {
                    min = item;
                }
                if (item > max) {
                    max = item;
                }
            }
            System.out.println("Maximum item in queue: " + max);
            System.out.println("Minimum item in queue: " + min);
        }

    }

    //find an item 5
    public void findItem() {
        System.out.print("Enter item to find: ");
        int itemToFind = scanner.nextInt();
        if (queue.contains(itemToFind)) {
            System.out.println("Item found!");
        } else {
            System.out.println("Item NOT found!");
        }
    }


    //print all 6
    public void printAllItems() {
        System.out.println("Items in queue: \n" + queue);
    }


    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        DSA_25 queueOperations = new DSA_25(); //makes methods accessible

        int select = 0;

        while (select != 7) {
            System.out.println("========================= \nOPERATIONS ON QUEUE \n=========================");
            System.out.print("[1] - Add items\n[2] - Delete items\n[3] - Show number of items\n[4] - Show min and max items\n[5] - Find an item\n[6] - Print all items\n[7] - Exit\nEnter your choice: ");
            select = scanner.nextInt();


            switch (select) {
                case 1:
                    queueOperations.addItem();
                    break;
                case 2:
                    queueOperations.deleteItem();
                    break;
                case 3:
                    queueOperations.showNumberOfItems();
                    break;
                case 4:
                    queueOperations.showMinMaxItems();
                    break;
                case 5:
                    queueOperations.findItem();
                    break;
                case 6:
                    queueOperations.printAllItems();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        }
        System.out.print("\n\nProcess Completed");
    }
}

