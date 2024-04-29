//Find Position of an element in a sorted array of infinite arrays
//with the help of binary search
//brute force not recommended
//cant use arr.length

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class BinarySearchQ3 {
    public static void main (String args[]){
        int[] arr = {2, 7, 8, 9, 10, 90,
                100, 130, 150, 180, 190};
        int target=10;
    System.out.println(ans(arr,target));
    }
    static int ans(int[]arr,int target){
        //first find the range
        //first start with bx of size 2
        int start=0;
        int end=1;

        //condition for the target to lie in the range
        while(target>arr[end]){
            int temp=end-1;
            //double the box value
            //end=previous end+sizeofbox*2
            end=end+(end-start+1)*2;
            start=temp;
        }
        return InfiniteArray(arr,target,start,end);
    }
    static int InfiniteArray(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
