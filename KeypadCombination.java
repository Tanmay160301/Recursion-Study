import java.util.ArrayList;
import java.util.List;

public class KeypadCombination {

    static String arr[]={".;","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static List<String> letterCombinations(String digits) {

        //base case
        if (digits.length() == 0) {
            List<String> result = new ArrayList<>();
            result.add("");
            return result;                
           
        }

        char ch = digits.charAt(0);
        String remString = digits.substring(1);

        List<String> tempList = letterCombinations(remString);
        String code = arr[ch - '0'];

        List<String> result = new ArrayList<>();

        for (int i = 0; i < code.length(); i++) {
            char tempch = code.charAt(i);

            for (String str : tempList) {
                result.add(tempch + str);
            }
        }


        return result;
    }
    public static void main(String[] args) {
        List<String> res = letterCombinations("23");
        
        System.out.println(res);
    }
}
