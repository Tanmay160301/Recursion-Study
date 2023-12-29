public class printArrayReverseElements {

    public static void print(int arr[], int idx){
        if (idx == arr.length) {
            return;
        }

        print(arr, idx+1);
        System.out.println(arr[idx]);
    }

    public static void main(String[] args) {
        int arr[] = {10, 20 , 30};
        print(arr,1);
    }
}
