public class ArrayFibonacci {

    public static void main(String[] args) {

        int n = 19;
        int[] fibonacci = new int[n];
        int sum = 0;
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n; ++i) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            if (fibonacci[i] % 2 == 0) {
                sum += fibonacci[i];
            }
        }
        System.out.println(sum);

    }
}