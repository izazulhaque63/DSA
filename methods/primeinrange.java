public class primeinrange {
    public static void main(String[] args) {
        primeInrange(15);
    }

    public static void primeInrange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime");
            }
        }
}
}