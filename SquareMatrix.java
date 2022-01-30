public class SquareMatrix { // направте внужное русло, что-то я с ней совсем запуталась(((((

    public static void main(String[] args) {
        int[][] matrix = {{7, 5, 4}, {3, 8, 1}, {5, 6, 1}};
        int row = matrix.length;
        int col = matrix[0].length;

        if (row != col) {
            System.out.println("Матрица не является квадратной!");
        } else {
            for (int i = 0; i < row - 1; i++) {
                for (int j = i + 1; j < col; j++) {
                    if (matrix[i][j] == 0) {
                        continue;
                    }
                System.out.println( "матрица является нижней треугольной");
                    if (matrix[i][j] != 0) {
                        break;
                    }
                    System.out.println( "матрица НЕ является нижней треугольной");
                }
            }
        }
    }
}
