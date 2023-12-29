public class LogarithmicPow {

    public static int logpow(int x , int n){

        if (n == 0) {
            return 1;
        }

        return (n%2 == 0) ? logpow(x, n/2) * logpow(x, n/2) : logpow(x, n/2) * logpow(x, n/2) * x;
        
    }

    public static void main(String[] args) {
        System.out.println(logpow(2,0));
    }
}
