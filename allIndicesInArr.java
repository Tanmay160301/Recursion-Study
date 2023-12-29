/* 
 * Que is data kevdya indices varti milel tyache indices eka array cha format madhe in sorted order
 * return karyche ahet
 * 
 * Basic approach for this code:
 * Stack madhe varti jatana foundSoFar cha count thevaycha 
 * base case varti foundSoFar cha size cha array declare karycha 
 * stack madhun khalti yetana index cha array bharycha 
 * 
 * Important point here : We are making use of idx and fsf to fill up the array
 * 
 * 
*/

public class allIndicesInArr {

    public static int[] f(int arr[], int data, int idx, int fsf){
        // fsf stands for found so far
        if (idx == arr.length) {
            //base case varti aapn ek array create kelay
            return new int[fsf];
        }

        if (arr[idx] == data) {
            int res[] = f(arr, data, idx+1, fsf+1); // incrementing foundSoFar and making the next call
            res[fsf] = idx;
            return res;  
        } 
        else {
            int res[] = f(arr, data, idx+1, fsf);
            return res; 
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,3,8,3,2,6,2,4,3};
        // int arr1[]={2,2,2};
        int res[] = f(arr, 3, 0, 0);
        for (int i : res) {
            System.out.println(i);
        }
        
        
    }
}
