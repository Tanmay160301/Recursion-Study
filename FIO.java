public class FIO {
    public static int fio(int arr[], int idx, int data){
        if (idx == arr.length ) {
            return -1;
        }


        if (arr[idx] == data) {
            return idx ;
        }
        else{
            int index = fio(arr, idx+1, data);
            return index;
        }


    }

    public static void main(String[] args) {
        int arr[]={2,3,6,33,8,33,2,6,2,4};
        System.out.println(fio(arr, 0, 33));
    }
}
