public class SearchInRotatedArray {
    static int findElement(int []arr,int n,int k)
    {
        int low = 0, high = n-1;
        while (low <= high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == k) return mid;
            else if(arr[low] <= arr[mid])
            {
                if(arr[low] <= k && k <= arr[mid])
                    high = mid-1;
                else low = mid+1;
            }
            else if(arr[mid] <= arr[high])
            {
                if(arr[mid] <= k && k <= arr[high])
                {
                    low = mid + 1;
                }
                else high = mid-1;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
//        int arr[] = {7,8,9,1,3,5};
        int arr[] = {12,15,18,2,4};
        int target = 4;

        System.out.println(findElement(arr,arr.length,target));
    }
}
