public class SmallestDivisorGivenThreshold {

    static int ifTotal(int arr[],int divisor)
    {
        int total = 0;
        for (int val:arr)
        {
            total += Math.ceil((double) val/divisor);

        }
        return total;
    }
    static int smallestDivisor(int []arr,int limit)
    {
        int low = 1, high = Integer.MIN_VALUE;
        for (int val:arr)
        {
            high = Math.max(high,val);
        }

        int ans = high;
        while (low <= high)
        {
            int mid = low + (high-low)/2;
            if(ifTotal(arr,mid) <= limit)
            {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
//        You are given an array of integers nums and an integer K, your task is to
//        find the smallest positive integer divisor, such that upon dividing all the
//        elements of the given array by it, the sum of the division's result is less than or equal to the given integer K.


        int arr[] = {1,2,5,9};
        int threshold = 6;

        System.out.println(smallestDivisor(arr,threshold));
    }
}
