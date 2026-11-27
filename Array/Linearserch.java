package Array;

public class Linearserch {
    public static void main(String[] args) {
        int[] number = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;
        int index = linearSearch(number, key);
      if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        
      }
    }

    public static int linearSearch(int[] number, int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
               return i;
    }
    }
    return -1;
    }
}
