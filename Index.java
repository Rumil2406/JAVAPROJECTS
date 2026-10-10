package Practic_5;

public class Index {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(find(arr,6));
    }

    public static int find(int[] array, int x) {
        int ind = -1;

        for (int j = 0; j < array.length; j++) {
            if (array[j]==x) {
                ind = j;
                return ind;
            }
        }

        return ind;
    }
}
