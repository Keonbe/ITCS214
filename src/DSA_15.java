import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

/*
Write a program that contains a USERDEFINED METHOD that merges the contents of two arrays, given as parameter public static returnType methodName ( parameter list ) {<<
The elements of each arays should be unique with random elements from 1 upto desired size
NOTE: When 2 arrays are merged, there may be duplicates

Forex:
Arrays 1 [3,8,15,17,30]
array 2 [3,7,10,12,15,23,25,40]
after merging - array 3 [3,3,7,8,10,12,15,15,17,20,23,25,30]

example OUTPUT:
ENTER SIZE OF FIRST ARRAY: 8
ENTER SIZE OF SECOND ARRAY: 5
1st arr
2nd arr
Merged arr

algo
1.array declare
2.random num(generate random numbers)(double to int)       //allowed use of predefined
        2.1 must be unique in each array(no duplicate values in say a isolated array like arr1)
3.sort arr1&2 (array.sorts)      //allowed use of predefined
4.merge array (own algorithm/solution, own sorting on how to merge)      //no use of predefined
>>if current element is less than the element of 2nd array then inserted to 3rd array, else 2nd array LOGICDESCRIPTION
*/

public class DSA_15 {
    public static int[] mergeArray(int[] arr1, int[] arr2){

        int[] mergeArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        //LOGICSTART
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                mergeArr[k++] = arr1[i];
                i++;
            } else{
                mergeArr[k++] = arr2[j];
                j++;
            }

            while(i < arr1.length){
                mergeArr[k++] = arr1[i++];
            }

            while(j < arr2.length){
                mergeArr[k++] = arr2[j++];
            }

        }
        return mergeArr;
    }


    public static void main(String[] args) { //MAIN DRIVER PROGRAM
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE OF FIRST ARRAY:");
        int arr1sz = scanner.nextInt();
        System.out.print("ENTER SIZE OF SECOND ARRAY:");
        int arr2sz = scanner.nextInt();

        //input to size
        int[] arr1 = new int[arr1sz];
        int[] arr2 = new int[arr2sz];
        //working


        //random = works + arraysort
        for(int i=0; i < arr1.length; i++){
            int rand = (int)Math.floor(Math.random()*20);
            arr1[i] = rand;
            for(int j=0; j < arr1.length; j++){ //through arrays, unique random num
                if (arr1[j] == arr1[i]){
                    arr1[j] = rand;
                }
            }
        }
        Arrays.sort(arr1);

            /*
            int rand = (int)Math.floor(Math.random()*100);
            arr1[i] = rand;
          old code, flaws: NO bound if not unique num
            */
        for(int i=0; i < arr2.length; i++){ //through arrays, adds random num
            int rand = (int)Math.floor(Math.random()*20);
            arr2[i] = rand;
            for(int j=0; j < arr2.length; j++){ //through arrays, unique random num
                if (arr2[j] == arr2[i]){
                    arr2[j] = rand;
                }
            }
        }
        Arrays.sort(arr2);


        //MergingArray
        //int arr3sz = arr1sz + arr2sz;
        //int[] arr3 = new int[arr3sz];
        int[] arr3 = mergeArray(arr1, arr2);

        //printing test = working
        System.out.print("\nFirst Array: ["); //arr1
        for(int i=0; i < arr1.length; i++){
            int elem = arr1[i];
            System.out.print(elem + ",");
        }
        System.out.print("]");

        System.out.print("\nSecond Array: ["); //arr2
        for(int i=0; i < arr2.length; i++){
            int elem = arr2[i];
            System.out.print(elem + ",");
        }
        System.out.print("]");

        System.out.print("\nMERGED Array(UNSORTED): ["); //arrMERGED
        for(int i=0; i < arr3.length; i++){
            int elem = arr3[i];
            System.out.print(elem + ",");
        }
        System.out.print("]");

    }
}

