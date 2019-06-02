package ee.brightapps.paskaltask.algorithms;

public class Task6 {

    /**
     * Calculate number of array items which are no less than all previous items of the array.
     *
     * @param array array of integers
     * @return Number of items which are no less than all previous items of the array
     */
    public static int maxElements(int[] array) {
        if (array.length == 0 || array.length == 1) return 0;

        int result = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                result++;
            }
        }
        return result;
    }

}
