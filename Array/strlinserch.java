package Array;

public class strlinserch {
    public static void main(String[] args) {
        String[] str = { "apple", "banana", "cherry", "date", "fig", "grape" };
        String key = "mango";
        int index = linearSearch(str, key);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
 public static int linearSearch(String[] str, String key) {
        for (int i = 0; i < str.length; i++) {
            if (str[i]== (key)) {
                return i;
            }
        }
        return -1;
    }
}