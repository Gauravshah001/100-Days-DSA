
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
//leetcode :852


public class BSQ4Mountainarray {
    public static void main(String args[]) {

}

    public int peakIndexInMountainArray(int[] arr) {
    int start=0;
    int end=arr.length-1;
    while(start<end){
        int mid=start+(end-start)/2;
        if(arr[mid]>arr[mid+1]){
            //dec part of array look at left
            // this may be the ans, but look at left
            // this is why end != mid - 1
            end =mid;

        }
        else {

            start=mid+1; //we know mid+1 element>mid element
        }
    }
    //in the end start==end and pointing to the largest no bcoz of 2 checks above
    //start and end are trying to find max element int the above 2 checks
        //hence they are pointing to just one element that is the max one that what the check says
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both

    }

}
