import java.util.ArrayList;

public class getMazePath {

    public static ArrayList<String> getPaths(int srcHor, int srcVer , int desHor, int desVer){

        //base case
        if(srcHor == desHor && srcVer == desVer){
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }

        if (srcHor>desHor || srcVer>desVer) {
            ArrayList<String> temp = new ArrayList<>();
            // temp.add("");
            return temp;
        }

        ArrayList<String> horiList = getPaths(srcHor, srcVer+1, desHor, desVer);
        ArrayList<String> verList = getPaths(srcHor+1, srcVer, desHor, desVer);
        ArrayList<String> result =  new ArrayList<>();

        for (String hPath : horiList) {
            result.add("h" + hPath);
        }

        for (String hPath : verList) {
            result.add("v" + hPath);
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> res = getPaths(1,1,5,5);
        System.out.println(res);
    }
}
