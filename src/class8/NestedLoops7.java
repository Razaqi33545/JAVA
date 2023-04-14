package class8;

public class NestedLoops7 {
    public static void main(String[] args) {


        /*  0 1 2 3 4 5
            1 2 3 4 5
            2 3 4 5
         */


        for (int i = 0; i <= 2 ; i++) {
            for (int j = i; j <= 5; j++) { // as j = i, the value of j will start from where i starts in each iteration.
                System.out.print(j+ " ");
            }
            System.out.println();
        }



    }
}
