import java.util.LinkedList;
import java.util.Scanner;
 /*
    Given a sorted linked list, write a method which takes an element and returns the list with that element inserted such that the list is still sorted.
    Use methods of the LinkedList class.
    Do not apply built-in methods to sort elements.
    Provide your own algorithm to determined the proper location of the element to be inserted in the linked list.
*/

public class DSA_17 {

 /*
       NOTE!!!!!
       //To receive linked list as parameter:
       public static void methodName(LinkedList<DataType> linkListName){
       }

       //To pass linked list object as parameter:
       methodName(linkListName);

       //ADD
    add(int i, E e) -the specified element at specified position in linked list.
       //ACCESS
    get(int i) – is used to access an element from the LinkedList at a given position
       //CHANGE ELEMENTS
    set(int i, E e) - method changes the element at a given index
       //REMOVE
    remove(int i) - removes the element specified by the index number.

    for(int i = 0; i < ll.size(); i++){ //WITHIN THE RANGE
            for(int j = 0; j < ll.size(); j++){
                if(ll.get(i) >= ll.get(insert)){
                ll.set(insert, i);
                break;
                }
            }
        }
        return ll;
       */

    public static LinkedList<Integer> LLSort(LinkedList<Integer> ll, int insert) {
        int index = 0;
        while (index < ll.size() && ll.get(index) < insert) { //if index is less than size & index is less than insert
            index++; //Traverses
            //ll.add(index, insert);
        }
        ll.add(index, insert); //CHANGED MY CODE "WAG ILAGAY ANG INSERT/ADD SA LOOP
        return ll;
    }

    public static void main(String[] args) { //MAIN DRIVER PROGRAM
        LinkedList<Integer> ll = new LinkedList(); //LL constructor
        Scanner scanner = new Scanner(System.in); //Scanner Contructor

        //LL data, sorted
        ll.add(5);
        ll.add(15);
        ll.add(20);
        ll.add(25);
        //System.out.println(ll.get(2));
        System.out.print("Current elements of Linked List: " + ll);
        System.out.print("\nEnter value to insert: ");
        int insert = scanner.nextInt();
        String selection = " ";


        while (!"n".equals(selection)) { //|| !"Y".equals(selection)
                   /*if temp > prev && temp < next{
                   place index such that prev data node is >(prev) temp && next data node <(prev) temp
                   NOTE: FOR DOUBLY LL*/
                   /*
                   if temp(insert) > current(index){
                   then next
                   }
                   */
            //logic here
            //LLSort(ll, insert);
            LinkedList<Integer> lls = new LinkedList();
            //llsorted = LLSort(ll, insert);
            //eng logic here
            System.out.print("Current elements of Linked List: ");
            lls = LLSort(ll, insert);
            System.out.print(lls);

            System.out.print("\nContinue? [y]|[n]: ");
            selection = scanner.next();

            if ("n".equals(selection)) {
                break;
            }

            System.out.print("\nEnter value to insert: ");
            insert = scanner.nextInt();
        }
    }
}
