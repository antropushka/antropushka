public class TaskMaxSum {

    public static void main(String[] args) {
        int[] array = {1,0,4,8,9,1};
        int incl = array [0];
        int excl = 0;
        int newExl = 0;
        int MaxSum = 0;

        for (int i = 1; i < array.length; i++) {
            if (incl > excl) {
                newExl = incl;
            } else {
                newExl = excl;
            }

            incl = excl + array[i];
            excl = newExl;
        }
        if (incl > excl) {
            MaxSum = incl;
        } else {
            MaxSum = excl;
        }
        System.out.println(MaxSum);


    }
}

