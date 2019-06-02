package ee.brightapps.paskaltask.algorithms;

public class Task4 {

    public static int minMaxSubtraction(int[] array) {
        if (array.length == 0)
            throw new RuntimeException("Subtraction of max and min value of array can NOT be calculated in EMPTY array");
        if (array.length == 1) return 0;

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            else if (array[i] > max) max = array[i];
        }
        return max - min;
    }

}
