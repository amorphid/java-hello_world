public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int[] row: grid) {
            for (int col: row) {
                System.out.print(col + "\t");
            }

            System.out.println();
        }
    }
}
