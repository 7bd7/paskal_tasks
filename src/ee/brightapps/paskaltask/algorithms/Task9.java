package ee.brightapps.paskaltask.algorithms;

public class Task9 {

    public static int maxCounter(int[] array) {
        if (array.length == 0) return 0;
        if (array.length == 1) return 1;

        int counter = 1;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                counter = 1;
            } else if (array[i] == max) counter++;
        }
        return counter;
    }

}
