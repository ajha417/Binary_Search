import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstAndLastOccurence {

    /*static int findLast(int []arr,int k)
    {
        int low = 0, high = arr.length-1;
        int ans = -1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == k)
            {
                ans = mid;
                low = mid+1;
            }
            if(arr[mid] < k)
            {
                low = mid+1;
            }
            else high = mid-1;
        }
        return ans;
    }
    static int findFirst(int []arr,int k)
    {
        int low = 0, high = arr.length-1;
        int ans = -1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == k)
            {
                ans = mid;
//                low = mid+1;
                high = mid-1;
            }

            if(arr[mid] < k)
            {
                low = mid+1;
            }
            else high = mid-1;
        }
        return ans;
    }
    static int[] firstAndLastPosition(int []arr,int k)
    {
        int ans[] = new int[2];
        ans[0] = findFirst(arr,k);
        if(ans[0] == -1)
        {
            ans[1] = -1;
            return ans;
        }
        if(findLast(arr,k) == -1)
        {
            ans[1] = ans[0];
            return ans;
        }
        ans[1] = findLast(arr,k);
        return ans;
    }*/
    static int findFirst(ArrayList<Integer> arr,int n,int k)
    {
        int left = 0, high = n-1;
        int first = -1;
        while(left <= high)
        {
            int mid = (left+high)/2;
            if(arr.get(mid)==k)
            {
                first = mid;
                high = mid-1;
            }
            else if(arr.get(mid) < k)
            {
                left=mid+1;
            }
            else high = mid-1;
        }
        return first;
    }
    static int findLast(ArrayList<Integer> arr,int n,int k)
    {
        int left = 0, high = n-1;
        int last = -1;
        while(left <= high)
        {
            int mid = (left+high)/2;
            if(arr.get(mid)==k)
            {
                last = mid;
                left = mid+1;
            }
            else if(arr.get(mid) < k)
            {
                left=mid+1;
            }
            else high = mid-1;
        }
        return last;
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.

        // int lb = lowerbound(arr,n,k);
        int ans[] = new int[2];
        ans[0] = findFirst(arr,n,k);
        if(ans[0] == -1)
        {
            ans[1] = -1;
            return ans;
        }
        if(findLast(arr,n,k)==-1) ans[1] = ans[0];
        else ans[1] = findLast(arr,n,k);
        return ans;
    }
    public static void main(String[] args) {

//        int arr[] = {1,2,3,4,4,4,4,4,5,6,8};
//        int arr[] = {0,0,1,1,2,2,2,2};
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(0,0,1,1,2,2,2,2));
        int target = 2;
        int ans[] = firstAndLastPosition(arr,arr.size(),target);
        for(int val:ans)
        {
            System.out.println(val);
        }
    }
}
