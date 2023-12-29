public class TOH {

    static int count =1;
    public static void toh(int n, String A , String B, String C){

        
        if (n == 0) {
            return;
        }
        

        
        toh(n-1, A, C, B);
        System.out.println("move the disk from "+A+ " to "+ B + count++);
        toh(n-1, C, B, A);
    }

    public static void main(String[] args) {
        toh(15,"A","B","C");
    }
}
