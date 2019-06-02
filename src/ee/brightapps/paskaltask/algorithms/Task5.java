package ee.brightapps.paskaltask.algorithms;

public class Task5 {

    /**
     * Compares two integer arrays for equal of greater than in other elements
     * @param arrayA first integer array to compare
     * @param arrayB second integer array to compare
     * @return Integer array where: <br>first integer - number of cases where <i>arrayA[i]</i>
     * greater than <i>arrayB[i]</i>;<br>second integer - number of cases where <i>arrayB[i]</i>
     * greater than <i>arrayA</i>; <br>third integer - number of cases where <i>arrayA[i]</i> and
     * <i>arrayB[i]</i> are equals.
     */
    public static int[] compareArrays(int[] arrayA, int[] arrayB) {
        if (arrayA.length == 0 || arrayB.length == 0) return new int[]{0, 0, 0};

        int aItemGreater = 0;
        int bItemGreater = 0;
        int itemsEqual = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] > arrayB[i]) aItemGreater++;
            else if (arrayB[i] > arrayA[i]) bItemGreater++;
            else itemsEqual++;
        }
        return new int[]{aItemGreater, bItemGreater, itemsEqual};
    }

}
