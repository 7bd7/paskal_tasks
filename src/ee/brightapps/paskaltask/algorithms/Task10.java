package ee.brightapps.paskaltask.algorithms;

public class Task10 {

    public static void reverseArray(int[][] outMatrix) {
        for (int array[] : outMatrix) {
            for (int i = 0; i < array.length; i++) array[i] = -array[i];
        }
    }

}