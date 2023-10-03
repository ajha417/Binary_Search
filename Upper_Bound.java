public class Upper_Bound {
    static int findUpperBound(int []arr,int x)
    {
        int low = 0, high = arr.length-1;
        int ans = arr.length-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(arr[mid] > x)
            {
                ans = mid;
                high = mid-1;
            }
            low = mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,6,8,9};
//        int arr[] = {2,4,6,6};
        int x = 4;

//        we here need to find the lowest index such that the element is just greater than x
        int result = findUpperBound(arr,x);
        System.out.println(result);
    }
}
