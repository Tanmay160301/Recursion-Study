import java.util.ArrayList;

public class StringSubsequence {

    public static ArrayList<String> subsequence(String str){

        if (str.length() == 0) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }

        char ch = str.charAt(0);
        String remString= str.substring(1);
        ArrayList<String> list = subsequence(remString); 
        ArrayList<String> result = new ArrayList<>();
        

        for (String listelement : list) {
            result.add(""+listelement);//0
            result.add(ch+listelement);//1
        }

        return result;
    }
    public static void main(String[] args) {
        ArrayList<String> res = subsequence("Yash");
        System.out.println(res);
    }
}
