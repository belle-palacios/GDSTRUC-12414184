public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        numbers[0] = 25;
        numbers[1] = -3;
        numbers[2] = 5;
        numbers[3] = 10;
        numbers[4] = 38;
        numbers[5] = 62;
        numbers[6] = 20;
        numbers[7] = -8;
        numbers[8] = 173;
        numbers[9] = 65;

        System.out.println("Before Bubble Sort:");
        printArrayElements(numbers);

        bubbleSortDescending(numbers);
        System.out.println("After Bubble Sort (Descending):");
        printArrayElements(numbers);

        numbers = new int[10];
        numbers[0] = 42;
        numbers[1] = -17;
        numbers[2] = 8;
        numbers[3] = 99;
        numbers[4] = 24;
        numbers[5] = -33;
        numbers[6] = 67;
        numbers[7] = 5;
        numbers[8] = 143;
        numbers[9] = 61;

        System.out.println("\nBefore Selection Sort:");
        printArrayElements(numbers);

        selectionSortDescending(numbers);
        System.out.println("After Selection Sort (Descending):");
        printArrayElements(numbers);
    }
    private static void bubbleSortDescending(int[] arr) {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            for (int i = 0; i < lastSortedIndex; i++) {
                if (arr[i] < arr[i + 1]) { // flip condition for descending
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
    private static void selectionSortDescending(int[] arr) {
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int smallest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (arr[i] < arr[smallest]) {
                    smallest = i;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[lastUnsortedIndex];
            arr[lastUnsortedIndex] = temp;
        }
    }
    private static void printArrayElements(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
