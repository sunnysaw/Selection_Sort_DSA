/*
Question : Take an array as input and using selection sort, sort that array.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sizeOfArray, start, swapValue, temporaryIndex, secondStart;
        System.out.println("Enter the length of array :");
        sizeOfArray = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[sizeOfArray];
        for (start = 0; start < array.length; start++) {
            array[start] = input.nextInt();
        }
        System.out.println("Printing the result using selection sort :");
        for (start = 0; start < array.length - 1; start++) {
            temporaryIndex = start;
            for (secondStart = start + 1; secondStart < array.length; secondStart++) {
                if (array[temporaryIndex] > array[secondStart]) {
//               temporaryIndex = start + 1;
                    temporaryIndex = secondStart;
                }
            }
            swapValue = array[temporaryIndex];
            array[temporaryIndex] = array[start];
            array[start] = swapValue;
        }
        for (start = 0; start < array.length; start++) {
            System.out.print(array[start] + " ");
        }
    }
}