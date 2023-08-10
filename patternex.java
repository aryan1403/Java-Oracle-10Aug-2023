public class patternex {
    public static void main(String[] args) {
        /* for (int i = 0; i < 10; i++) { // outer loop // 0 - 9
            for (int j = 0; j < i; j++) { // inner loop 0 - 8
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 234763247836
        // 2 3 4 6 7 8  */
        int[] arr = {-9, -8, 8, 9, 0, 79, 67};
        // -9 -8 0 8 9 67 79

        // Bubble Sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
