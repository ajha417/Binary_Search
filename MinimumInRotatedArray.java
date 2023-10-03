public class MinimumInRotatedArray {
    static int findMinimum(int []arr,int n)
    {
        int low = 0, high = n-1,ans = Integer.MAX_VALUE;
        while (low <= high)
        {
            int mid = (low+high)/2;
            if(arr[low] <= arr[high])
            {
                ans = Math.min(ans,arr[low]);
                break;
            }
            else if(arr[low] <= arr[mid])
            {
                ans = Math.min(arr[low],ans );
                low = mid+1;
            }
            else
            {
                ans = Math.min(arr[mid],ans );
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        int arr[] = {4,5,6,1,2,3};
        System.out.println(findMinimum(arr,arr.length));
    }
}
