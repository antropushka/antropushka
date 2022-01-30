public class DimArray {
    public static void main (String[] args)  {

        int[][] twoDimArray = new int [2][];
        twoDimArray [0] = new int [] {-3,-1,0,0,4};
        twoDimArray [1] = new int[] {0,1,8,-9};

        int x = 0;
        int y = 0;
        int z = 0;

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (twoDimArray[i][j] > 0) {
                    x++;
                } else if (twoDimArray[i][j] < 0) {
                    y++;
                } else if (twoDimArray[i][j] == 0) {
                    z++;
                }
            }
        }

        if (x > y && x > z) {
            System.out.println("Положительных чисел больше, чем отрицательных");
        } else if (y > x && y > z ) {
            System.out.println("Отрицательных чисел больше, чем положительных");
        } else if (x == y && x!=z) {
            System.out.println("Положительных и отрицательных чисел одинаковое количество");
        } else if (x == y && x==z) {
                System.out.println("Положительных,отрицательных чисел и нулей одинаковое количество");
        } else if (z > x + y) {
            System.out.println("Нулей в заданном массиве больше, чем положительных и отрицательных чисел");
        }
    }
}


