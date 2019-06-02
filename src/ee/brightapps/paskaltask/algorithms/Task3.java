package ee.brightapps.paskaltask.algorithms;

public class Task3 {

    /**
     * @param param integer to compare with
     * @param array array of integers
     * @return <i>true</i> or <i>false</i> depends on if array contains <i>param</i>
     */
    public static boolean contains(int param, int[] array) {
        if (array.length == 0) return false;

        for (int integer : array) {
            if (integer == param) return true;
        }
        return false;
    }


}
