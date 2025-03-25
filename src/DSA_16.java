import java.util.Scanner;
/*
Arrays Module 3
write a program that will multiply two 3X3 arrays.
hint:
(2*1)+(4*9)+(6*6) = 74
(1*1)+(4*9)+(7*6) = 78
(8*1)+(5*9)+(6*6) = 89
 */
public class DSA_16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr1 = new int [3][3];
        int[][] arr2 = new int [3][3];

        //can be column or row print/input since equal sides x&y
        System.out.println("Enter array 1 Values:"); //printing 1
        for(int i=0; i<3; i++){
            for(int j=0; j<3;j++){
                arr1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter array 2 Values:"); //printing 2
        for(int i=0; i<3; i++){
            for(int j=0; j<3;j++){
                arr2[i][j] = scanner.nextInt();
            }
        }

        //logic, multiply
        int[][] arr3 = new int [3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3;j++){
                for(int k=0; k<3;k++){ //switch around yung [rows] & [columns] variables
                    arr3[i][j] += arr1[i][k] * arr2[k][j]; //arr3[i][j] += arr1[i][j] * arr2[i][k] mali pero ito unang code
                }
            }
        }

        System.out.println("Product of array 1 & array 2:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3;j++){
                System.out.print(arr3[j][i] + " "); //mali is arr3[i][j]
            }
            System.out.println(); //logic: after printing row NEXT LINE then NEXT ROW
        }
        //time estimated: 31 minutes
        //note*:watched module video sa sb before gawin ito so may idea ako
    }

}
