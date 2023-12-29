public class factorial {
    public static int fib(int n){
        if (n == 1) {
            return 1;
        }

        int fm1 = fib(n-1);
        int val = n * fm1;
        return val;
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
