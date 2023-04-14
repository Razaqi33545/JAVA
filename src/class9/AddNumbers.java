package class9;

public class AddNumbers {
    public static void main(String[] args) {

        // add all the numbers from below loop
        int sum = 0;
        for (int i = 0; i <= 3; i++) {
            sum=sum+i; // 0+0=0, 0+1=1, 1+2=3, 3+3=6
        }
        System.out.println(sum);


        // add all numbers 1-100
        int sum0 = 0;
        for (int i = 1; i <= 100; i++){
            sum0 = sum0+i;
        }
        System.out.println(sum0);
    }
}

