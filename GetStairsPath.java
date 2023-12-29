import java.util.ArrayList;

public class GetStairsPath {
    public static ArrayList<String>  climbStairs(int n) {
        //base case 2 prakare handle karu shaktoy
        if (n == 0) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add("");
            return arr;
        }

        if (n<0) {
            //ithe paths add nahi honar 
            ArrayList<String> arr = new ArrayList<>();
            return arr;
        }

        ArrayList<String> path1 = climbStairs(n-1);
        ArrayList<String> path2 = climbStairs(n-2);
        ArrayList<String> path3 = climbStairs(n-3);
        ArrayList<String> paths = new ArrayList<>();

        for (String path : path1) {
            paths.add(1+path);
        }
        for (String path : path2) {
            paths.add(2+path);
        }
        for (String path : path3) {
            paths.add(3+path);
        }

        return paths;
    }
    public static void main(String[] args) {
        ArrayList<String> result = climbStairs(10);
        System.out.println(result.size());
    }
}
