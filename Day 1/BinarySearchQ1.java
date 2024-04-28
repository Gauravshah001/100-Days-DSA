public class BinarySearchQ1 {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5,56,67,87};
    int target=6;
    int ans=Question1(arr,target);
    System.out.println(ans);
    }

    static int Question1(int[] arr, int target) {
        //but what if the target is greater than the greatest number in the array
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target >arr[mid]) {
                start = mid + 1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }

            return start;
    }
}
