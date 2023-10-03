public class KokoEatingBanana {

    static int koko(int []arr,int val)
    {
        int total = 0;
        for(int value:arr)
        {
            total += Math.ceil((double)value/val);
        }
        return total;
    }
    static int findMinSpeed(int []arr,int h,int n)
    {
        int low = 1, high = Integer.MIN_VALUE;
        int ans = -1;
        for(int val:arr)
        {
            high = Math.max(high,val);
        }
        while (low <= high)
        {
            int mid = (low + high)/2;
            if(koko(arr,mid) > h)
            {
//                ans = h;
//                high = mid-1;
                low = mid+1;
            }
//            else low = mid+1;
            else high = mid-1;
        }
        return low;
    }
    public static void main(String[] args) {

        int arr[] = {3,6,7,11};
        int h = 8;
        System.out.println(findMinSpeed(arr,h,arr.length));
    }
}
