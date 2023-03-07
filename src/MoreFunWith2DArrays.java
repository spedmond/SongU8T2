import java.util.Arrays;

public class MoreFunWith2DArrays
{
    public static void main(String[] args)
    {
        // TEST CODE FOR METHOD 1: average
        int[][] testArr1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(average(testArr1));
        int[][] testArr2 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(average(testArr2));
        int[][] testArr3 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(average(testArr3));
        int[][] testArr4 = {{4}, {7}, {8}, {2}};
        System.out.println(average(testArr4));
        int[][] testArr5 = {{4}};
        System.out.println(average(testArr5));

        System.out.println();

        // TEST CODE FOR METHOD 2: indexOf
        String[][] words = {{"hi", "bye", "stuff", "go"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        System.out.println(Arrays.toString(indexFound(words, "stuff")));
        System.out.println(Arrays.toString(indexFound(words, "good")));
        System.out.println(Arrays.toString(indexFound(words, "map")));
        System.out.println(Arrays.toString(indexFound(words, "cat")));
        System.out.println("--------------");

        String[][] words2 = {{"time", "up", "bye"}, {"hi", "hit", "up"}, {"map", "bam", "low"}, {"bow", "mom", "joy"}};
        System.out.println(Arrays.toString(indexFound(words2, "time")));
        System.out.println(Arrays.toString(indexFound(words2, "joy")));
        System.out.println(Arrays.toString(indexFound(words2, "bam")));
        System.out.println(Arrays.toString(indexFound(words2, "cat")));
    }

    // Write the average method below to return the average
    // (as a double) of all elements in numArray
    public static double average(int[][] numArray)
    {
        /* IMPLEMENT ME! */
        int sum = 0;
        int count = 0;
        for (int[] arr : numArray) {
            for (int a : arr) {
                sum+=a;
                count++;
            }
        }
        return (double)sum/count;
    }

    // Write the indexFound method below to return an array
    // containing two elements indicating the row and column where
    // the target is found in the 2D strArray
    //
    // for example, if strArray = {{"a", "b", "c"}, {"d", "e", "f"}} and
    // target is "f", then this method should return [1, 2], since
    // "f" is found in row 1, column 2 (0-indexed)
    //
    // if the target is not found, return [-1, -1]
    //
    // PRECONDITION: target is only in strArray at most once
    public static int[] indexFound(String[][] strArray, String target)
    {
        /* IMPLEMENT ME! */
        for (int row = 0; row < strArray.length; row++) {
            for (int col = 0; col < strArray[row].length; col++) {
                if (strArray[row][col].equals(target)) {
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}