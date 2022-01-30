public class Inversion {

    public static void main(String[] args) {
        int [] days = {1,2,3,4,5,6,7,8};
        int n = days.length;
        int newDays;

        for (int i = 0; i < n/2; i++) {
            newDays = days[n - i - 1];
            days[n - i - 1] = days[i];
            days[i] = newDays;
        }
        for (int i = 0; i < days.length; i++) {
                System.out.print( days [i]);
        }
    }
}
