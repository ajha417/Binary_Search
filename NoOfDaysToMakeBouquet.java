public class NoOfDaysToMakeBouquet {
    static boolean isPossible(int arr[],int day,int k,int m)
    {
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] <= day) count++;
            else {
                m -= count / k;
                count = 0;
            }
        }
        m -= count/k;
        return m <= 0;
    }
    static int roseGarden(int []arr,int k,int m,int n)
    {
        if(arr.length < k*m) return -1;
        int low = Integer.MAX_VALUE,high = Integer.MIN_VALUE;
        for(int val:arr)
        {
            low = Math.min(low,val);
            high = Math.max(high,val);
        }
        int ans = -1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(isPossible(arr,mid,k,m))
            {
                high = mid-1;
            }
            else low = mid+1;
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,7,2,2,3,1};
        int k = 3, m = 2;

        System.out.println(roseGarden(arr,k,m,arr.length));
    }
}
