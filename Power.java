public class Power {
    public static int power(int n,int pow){
        
        if (pow == 1) {
            return n;
        }

        int pm1 = power(n, pow-1);
        int val = n * pm1;
        return val;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
