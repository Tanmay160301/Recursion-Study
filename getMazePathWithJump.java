import java.util.ArrayList;

public class getMazePathWithJump {

    public static ArrayList<String> getPaths(int srcHor, int srcVer , int desHor, int desVer){

        //base case
        if(srcHor == desHor && srcVer == desVer){
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }

        // if (srcHor>desHor || srcVer>desVer) {
        //     ArrayList<String> temp = new ArrayList<>();
        //     return temp;
        // }

        ArrayList<String> result =  new ArrayList<>();        


        //Finding all the horizontal paths right  of me and then adding my horizontal ways
        for (int currhor = 1; currhor <= desVer - srcVer; currhor++) {
            //desVer - srcHor:: hya specific function call madhe kiti jumps allowed ahet in horizontal direction
            ArrayList<String> hPaths =getPaths(srcHor, srcVer+currhor, desHor, desVer);
            for (String hpath : hPaths) {
                result.add("h"+currhor+hpath);
            }
        }

        //Finding all the vertical paths below  of me and then adding my vertical ways
        for (int currver = 1; currver <= desHor - srcHor; currver++) {
            //desHor -  srcVer :: hya specific function call madhe kiti jumps allowed ahet in vertical direction
            ArrayList<String> vPaths =getPaths(srcHor+currver, srcVer, desHor, desVer);
            for (String vpath : vPaths) {
                result.add("v"+currver+vpath);
            }
        }

        for (int currDiag = 1; currDiag <= desVer - srcVer && currDiag<= desHor-srcHor; currDiag++) {
            ArrayList<String> dPaths =getPaths(srcHor+currDiag, srcVer+currDiag, desHor, desVer);
            for (String dpath : dPaths) {
                result.add("d"+currDiag+dpath);
            }
        }


        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> res = getPaths(1,1,3,3);
        System.out.println(res);
    }
}
