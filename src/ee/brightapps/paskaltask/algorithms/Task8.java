package ee.brightapps.paskaltask.algorithms;

public class Task8 {

    public static float[] getAveragesArray(int[] array) {
        if (array.length == 0) throw new RuntimeException("Can't get average from EMPTY array.");
        if (array.length == 1) return new float[]{array[0]};

        float[] result = new float[array.length];
        result[0] = array[0];
        float sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
            result[i] = sum / (i + 1);
        }
        return result;
    }


}
