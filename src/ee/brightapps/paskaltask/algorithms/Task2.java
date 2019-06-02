package ee.brightapps.paskaltask.algorithms;

public class Task2 {

    /**
     * @param toCompare the integer with which every float from given <i>array</i> will be compared
     * @param array     the array of float to compare
     * @return number of floats greater than <i>toCompare</i> from the given <i>array</i>
     */
    public static int moreThan(float toCompare, float[] array) {
        if (array.length == 0) return 0;

        int result = 0;
        for (float f : array) {
            if (Math.abs(f) > toCompare)
                result++;
        }
        return result;
    }

    //If there weren't Math class I would use the following method
    /**
     * @param f float to get absolute value of
     * @return absolute value of the given float
     */
    private static float abs(float f) {
        return f > 0 ? f : -f;
    }

}
