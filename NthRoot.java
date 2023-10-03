public class NthRoot {
    static int findNthRoot(int n,int m)
    {
        int low = 1, high = n;
        int ans = -1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(Math.pow(mid,m) == n) return mid;
            if(Math.pow(mid,m) < n)
            {
                ans = mid;
                low = mid+1;
            }
            else high = mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {

        int n = 64, power = 3;
        System.out.println(findNthRoot(n,power));
    }
}
