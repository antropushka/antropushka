public class StudentScholarship {
    public static void main(String[] args) {
        int[] rating = {1, 2, 3, 4, 5, 3, 2, 1, 2, 6, 5, 4, 3, 3, 2, 1, 1, 3, 3, 3, 4, 2};
        int[] rub = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int minSunOfRub = 0;

        for(int i=1; i < rating.length-1; i++) {
            if (rating[i] > rating[i - 1]) {
                rub[i] = rub[i - 1] + 1;
            } else if (rub[i - 1] == 1){
                rub[i] = 1;
                for (int j = rating.length - 2; j == 0; j--) {
                    if (rating[j] > rating[j + 1]) {
                        if ((rub[i + 1] + 1) > rub[i]) {
                            rub[i] = rub[i + 1] + 1;
                        } else {
                            rub[i] = rub[i];
                        }
                    }
                }
            } else {
                rub[i] = 1;
            }
        }

        for(int i=0; i < rub.length; i++){
        minSunOfRub += rub[i];
        System.out.println(rub[minSunOfRub]);
        }


    }

}





