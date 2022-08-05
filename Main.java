package maxOfList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myArray[] = {16, 17, 6, 2, 5, 3};
        int output[];

        output = replace(myArray);
        System.out.println("The sorted array:");
        System.out.println(Arrays.toString(output));
    }
    public static int[] replace(int[] array) {

        int max = array[array.length-1];
        array[array.length-1] = -1;
        for(int i=array.length-2;i>=0;i--){
            int value = array[i];
            array[i]=max;
            max = Math.max(max,value);

        }
        return array;
    }
}
