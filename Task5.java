public class Task5 {

    public static void main(String[] args) {
        int[][] matrix = {{1,0,0,0,4}, {6,2,0,0,0}, {7,10,3,0,0}, {8,11,13,4,0}, {9,12,11,14,15,5}};
        int row = matrix.length;
        int col = matrix[0].length;
        int count = 0;


        if (row != col) {
            System.out.println("Матрица не является квадратной!");
        } else {
            for (int i = 0; i < row-1; i++) {
                for (int j = i+1; j < col; j++) {
                    if (matrix[i][j] != 0) {
                        System.out.println( "матрица НЕ является нижней треугольной");
                        break;
                    } else if (matrix[i][j] == 0){
                       count ++;
                       int x = ((row*col) - row)/2;
                       if (count == x) {
                           System.out.println("Матрица является нижней треугольной");
                       }
                    }
                }
            }

        }

    }
}
