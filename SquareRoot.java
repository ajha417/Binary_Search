public class SquareRoot {
    static int findSquareRoot(long n)
    {
        long low = 1, high = n;
        int ans = -1;
        while (low <= high)
        {
            long mid = (low + high)/2;
            if(mid*mid == n) return (int)mid;
            if(mid * mid < n)
            {
                ans = (int)mid;
                low = mid+1;
            }
            else high = mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
//        find the square root of given number or close to square root

//        for example for 7 the answer will be 2 as 2*2 = 4 but 3*3 = 9 which exceeds the number
        long number = 9;
        System.out.println(findSquareRoot(7));
    }
}
