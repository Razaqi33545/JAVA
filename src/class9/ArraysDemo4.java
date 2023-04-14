package class9;

public class ArraysDemo4 {
    public static void main(String[] args) {

        char [] characters = {'A','B','c','d','e','F'};
        characters[0] = 'a'; // We can update the elements of an array
        characters[1] = 'b';
        characters[5] = 'f';
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }


    }
}
