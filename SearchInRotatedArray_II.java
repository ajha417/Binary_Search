public class SearchInRotatedArray_II {

    static int findElement(int []arr,int n,int k)
    {
        int low = 0, high = n-1;
        while (low <= high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == k) return mid;
            if(arr[low] == arr[mid] && arr[mid] == arr[high])
            {
                low = low+1;
                high = high-1;
                continue;
            }
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

//        here array may have multiple duplicate elements
        int arr[] = {3,1,2,3,3,3};
        int target = 3;
        System.out.println(findElement(arr,arr.length,target));
    }
}
