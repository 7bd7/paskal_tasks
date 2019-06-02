package ee.brightapps.paskaltask;

import ee.brightapps.paskaltask.algorithms.*;

public class Test {

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
    }

    private static void task1() {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0};
        System.out.println("Result for nonZeroItems(): " + Task1.nonZeroItems(array));
        System.out.println("Result for nonZeroFroTenItems(): " + Task1.nonZeroFroTenItems());
    }


    private static void task2() {
        int compareTo = 7;
        float[] array = new float[]{-5632.925f, -8, -7.1f, -7.0f, -0.3456f, 0.3456f, 2, 7, 7.1f, 7.5f, 33.4f, 33.5f, 76.9872f,
                2147483647, 3.4028235E38f};

        System.out.println("There is/are " + Task2.moreThan(compareTo, array) + " number(s) more than " + compareTo);
    }

    private static void task3() {
        int isContainNum = 7;
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Is there " + isContainNum + " in array?\nAnswer: " +
                Task3.contains(isContainNum, array));
    }

    private static void task4() {
        int[] array = new int[]{2, 1, 2, 0, 4, 5, 6, 7, 8, 9};
        System.out.println("The difference between max and min is " + Task4.minMaxSubtraction(array));
    }

    private static void task5() {
        int[] arrayA = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrayB = new int[]{0, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] result = Task5.compareArrays(arrayA, arrayB);
        System.out.println("Number of cases where arrayA[i] > " +
                "arrayB[i]: " + result[0] +
                "\nNumber of cases where arrayB[i] " +
                "> arrayA[i]: " + result[1] +
                "\nNumber of cases where arrayA[i] = " +
                "arrayB[i]: " + result[2]);
    }

    private static void task6() {
        int[] array = new int[]{0, 1, 1, 6, 4, 5, 6, 7, 8, 9}; //7 items
        System.out.println("Number of items which no less than all previous items of the array: " + Task6.maxElements(array));
    }

    private static void task7() {
        float[] array = new float[]{-56.925f, -8, -0.3456f, 0.3456f, 2, 33.4f, 33.5f, 76.9872f, 77};
        System.out.println("Number of floats higher than average is: " + Task7.moreAverage(array));
    }

    private static void task8() {
        int[] array = new int[]{5, 1, 1, 6, 4, 5, 6, 7, 8, 9};
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append("\nResult array value with index ")
                    .append(i)
                    .append(" is: ")
                    .append(Task8.getAveragesArray(array)[i]);
        }
        System.out.println(builder.toString());
    }

    private static void task9() {
        int[] array = new int[]{8, 1, 1, 9, 4, 8, 6, 9, 8, 9};
        System.out.println("Array contains max value " + Task9.maxCounter(array) + " times");
    }

    private static void task10() {
        int[][] matrix = new int[][]{
                {0, 1, -1, 6, 4},
                {-85, 1, 1, -6, 4},
                {-9, 4, -7, 5, -5},
                {-633541, -1, -7, -8, -4},
                {5, 14, 3, 2, 3}};

        int[][] oldCopy = new int[matrix.length][matrix[0].length];
        copyMatrix(matrix, oldCopy);

        Task10.reverseArray(matrix);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                builder.append("\nOld value ")
                        .append(oldCopy[i][j])
                        .append(" | ")
                        .append(matrix[i][j])
                        .append(" new value");
            }
        }
        System.out.println(builder.toString());
    }

    /**
     * Copy values from one int[][] matrix to another one int[][] matrix.
     *
     * @param src  source int[][] matrix to copy from.
     * @param dest destiny int[][] matrix to copy to.
     */
    private static void copyMatrix(int[][] src, int[][] dest) {
        for (int i = 0; i < src.length; i++) {
            System.arraycopy(src[i], 0, dest[i], 0, src[i].length);
        }
    }

}
