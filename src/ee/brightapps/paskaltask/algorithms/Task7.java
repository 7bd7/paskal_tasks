package ee.brightapps.paskaltask.algorithms;

public class Task7 {

    /**
     * Calculate number of float higher than average of given array.
     *
     * @param array array of floats.
     * @return Number of float higher than average of given array.
     */
    public static int moreAverage(float[] array) {
        if (array.length == 0 || array.length ==  1) return 0;

        int result = 0;
        float average = getAverage(array);
        for (float i : array) {
            if (i > average) result++;
        }
        return result;
    }

    /**
     * Calculates average from array.
     *
     * @param array array of floats to calculate average from.
     * @return Average from all floats from given array.
     */
    private static float getAverage(float[] array) {
        float sum = 0;
        for (float i : array) sum += i;
        return sum / array.length;
    }

}
