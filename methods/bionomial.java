public class bionomial {
    public static void main(String[] args) {
        System.out.println(bionom(5, 2));


       // System.out.println(bionom(6, 3));
    }

   
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }


    public static int bionom(int n, int r) {
       int fact_n = fact(n);
       int fact_r = fact(r);
       int fact_n_r = fact(n - r);
         return fact_n / (fact_r * fact_n_r);
    }





    //2nd method
    //  public static int bionom(int n, int r) {
    //     return fact(n) / (fact(r) * fact(n - r));
    // }

    // public static int fact(int n) {
    //     if (n == 0 || n == 1) {
    //         return 1;
    //     } else {
    //         return n * fact(n - 1);
    //     }
    // }
}
