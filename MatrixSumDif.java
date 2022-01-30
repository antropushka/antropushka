public class MatrixSumDif {

    public static void main(String[] args) {

    int [][] matrix =
            {{1,2,3},
             {4,5,6},
             {7,8,9}};
    int [][] matrix2 =
            {{4,5,8},
             {1,0,0},
             {8,4,1}};

    int m = matrix.length;
    int n = matrix2[0].length;
    int [][] sum = new int [m][n];
    int [][] dif = new int [m][n];

    for (int i=0; i<m; i++) {
        for (int j=0; j<n; j++){
            sum[i][j] = matrix[i][j] + matrix2[i][j];
            System.out.print(sum[i][j] + " ");
        }

        System.out.println();

        }
    for (int i=0; i<m; i++) {
        for (int j=0; j<n; j++){
            dif[i][j] = matrix[i][j] - matrix2[i][j];
            System.out.print(dif[i][j] + " ");
            }

            System.out.println();

        }
    }
}
