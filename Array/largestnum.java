package Array;

public class largestnum {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 7, 3, 15};
        int largest = findLargest(numbers);
        System.out.println("The largest number is: " + largest);
    }

    public static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }   
}
