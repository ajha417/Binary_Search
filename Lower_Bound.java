public class Lower_Bound {


//    find the smallest index such that element at that index is not smaller than x
    static int findLowerBound(int arr[],int x)
    {
        int low = 0, high = arr.length-1;
        int ans = high;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(arr[mid] >= x)
            {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3};
        int x = 2;
        int result = findLowerBound(arr,x);
        System.out.println(result);
    }
}
