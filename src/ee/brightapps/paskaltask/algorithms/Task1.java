package ee.brightapps.paskaltask.algorithms;

public class Task1 {


    /**
     * @param array array of integers
     * @return number of nonnull integers from given array
     */
    public static int nonZeroItems(int[] array) {
        if (array.length == 0) return 0;

        int nonZero = 0;
        for (int i : array) {
            if (i != 0) nonZero++;
        }
        return nonZero;
    }

    /**
     * @return number of nonnull integers from inner 10 items array
     */
    //Exactly like the task required
    public static int nonZeroFroTenItems() {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        return nonZeroItems(array);
    }


}
