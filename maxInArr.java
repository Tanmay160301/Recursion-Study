public class maxInArr {

    public static int maxi(int arr[], int idx){
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        return (arr[idx]>maxi(arr,idx+1))?  arr[idx] : maxi(arr,idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {22,33,4,197,7};// should print 197
        System.out.println(maxi(arr, 0));
    }
}
