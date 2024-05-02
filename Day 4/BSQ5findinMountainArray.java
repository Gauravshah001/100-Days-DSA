
//Leetcode 1095

//first approach
public class BSQ5findinMountainArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,3,1};
        int target = 3;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }


    //first approach by me
     static int orderAgnosticBS(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        // find whether the array is sorted in ascending or descending
//        boolean isAsc = arr[start] < arr[end];
//
//        while(start <= end) {
//            // find the middle element
////            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//            int mid = start + (end - start) / 2;
//
//            if (arr[mid] == target) {
//                return mid;
//            }
//
//            if (isAsc) {
//                if (target < arr[mid]) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            } else {
//                if (target > arr[mid]) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            }
//        }
//        return -1;
//    }
//}


//second aproach by me
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        for(int i=0;i<mid;i++){
            if(arr[i]==target){
                return i;
            }
            else{
                for(int j=mid+1;j<arr.length;j++){
                    if(arr[i]==target){
                        return j;
                    }
                }
            }
        }
        return -1;
    }
}