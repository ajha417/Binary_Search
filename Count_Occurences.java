import java.util.ArrayList;
import java.util.Arrays;

public class Count_Occurences {
    static int findFirst(int arr[],int n,int k)
    {
        int left = 0, high = n-1;
        int first = -1;
        while(left <= high)
        {
            int mid = (left+high)/2;
            if(arr[mid]==k)
            {
                first = mid;
                high = mid-1;
            }
            else if(arr[mid] < k)
            {
                left=mid+1;
            }
            else high = mid-1;
        }
        return first;
    }
    static int findLast(int arr[],int n,int k)
    {
        int left = 0, high = n-1;
        int last = -1;
        while(left <= high)
        {
            int mid = (left+high)/2;
            if(arr[mid]==k)
            {
                last = mid;
                left = mid+1;
            }
            else if(arr[mid] < k)
            {
                left=mid+1;
            }
            else high = mid-1;
        }
        return last;
    }
    public static int count(int arr[], int n, int x) {
        //Your code goes here
        int ans[] = new int[2];
        ans[0] = findFirst(arr,n,x);
        if(ans[0] == -1)
        {
            // ans[1] = -1;
            return 0;
        }
        ans[1] = findLast(arr, n, x);

        int result = ans[1]-ans[0]+1;
        return result;
    }
    public static void main(String[] args) {
//        here in sorted array, count the number of occurences of given target
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.addAll(Arrays.asList(0,0,1,1,2,2,2,2));
        int arr[] = {0,0,1,1,2,2,2,2};
        int target = 2;
        System.out.println(count(arr,arr.length,target));

    }
}
