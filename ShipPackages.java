public class ShipPackages {

    static int noOfD(int arr[],int capacity)
    {
        int day = 1, load = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] + load > capacity)
            {
                day++;
                load = arr[i];
            }
            else load+=arr[i];
        }
        return day;
    }
    static int leastWeightCapacity(int []arr,int n,int d)
    {
        int low = -1,high = 0;
        for(int val:arr)
        {
            low = Math.max(low,val);
            high += val;
        }
        int ans = 0;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(noOfD(arr,mid) <= d)
            {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        /*Given an array arr[] of N weights. Find the least weight capacity of a boat to ship all weights within D days.
                The ith weight has a weight of arr[i]. Each day, we load the boat with weights given by arr[i].We may not load more weight than the maximum weight capacity of the ship.*/
        int arr[] = {9, 8, 10};
        int D = 3;
        System.out.println(leastWeightCapacity(arr,arr.length,D));
    }
}
