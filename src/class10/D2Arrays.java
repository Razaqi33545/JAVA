package class10;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {

        /* a 2D array which can hold 3 one D arrays
         each of size 3 */

        String [][] classPanthers = new String [3][4];
        String[] array0={"Muhammed","Adam","Musa","Esa",};
        String[] array1={"Nabi","Saud","Anees","Rahim"};
        String[] array2={"Safi","Mustafa","Zahra","Khadija"};

        classPanthers[0] = array0;
        classPanthers[1] = array1;
        classPanthers[2] = array2;

        // in the first [] we specify the address of 1 D ARRAY
        System.out.println(classPanthers[2][1]);
        System.out.println(Arrays.toString(classPanthers[2]));


        // Not part of the question above
        int [] arr = {10,13,20,25,45,50};
        System.out.println(Arrays.toString(arr));


         }
    }