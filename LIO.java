public class LIO {
    public static int lio(int arr[], int idx, int data){
        if (idx == arr.length ) {
            return -1;
        }

        int index = lio(arr, idx+1, data);

        if (arr[idx] == data && index ==-1) {
            return idx ;
        }
        else{
            return index;
        }

    }

    public static void main(String[] args) {
        // int arr[]={2,3,6,3,8,3,2,6,2,4};
        int arr1[]={2,2,2};
        System.out.println(lio(arr1, 0, 22));
    }
}
