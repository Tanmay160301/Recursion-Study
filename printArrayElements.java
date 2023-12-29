public class printArrayElements {
    public static void print(int arr[], int idx){
        if (idx == arr.length) {
            return;
        }

        System.out.println(arr[idx]);
        print(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30};
        print(arr, 0);
    }
}
