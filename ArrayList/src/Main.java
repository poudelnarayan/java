import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myInteger = getIntegers(5);
        int[] sorted = sortIntegers(myInteger);
        printArray(sorted);

    }

    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integers:\r");
        for (int i = 0 ; i < array.length ; i ++ ){
            array[i] = scanner.nextInt();

        }
        return array;
    }

    public static void printArray(int @NotNull [] array ){
        for(int i  = 0 ; i < array.length; i++){
            System.out.println("Element [" +i + "] is "+ array[i]  );
        }
    }

    public static  int[] sortIntegers(int [] array){
        int[] sortedArray = new int[array.length];
           /* for(int i = 0 ; i < array.length ; i++){
                 sortedArray[i] = array[i];
            }
            */


        System.arraycopy(array,0,sortedArray,0,array.length);


        boolean flag = true;
        while(flag){
            flag = false;

            for (int i = 0 ; i<sortedArray.length-1 ; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }

        }
        return sortedArray;
    }

}
