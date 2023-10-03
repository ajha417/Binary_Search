public class PeakElement {
    static int findPeakElement(int arr[],int n)
    {
        if(arr[0] > arr[1]) return arr[0];
        if(arr[n-1] > arr[n-2]) return arr[n-1];
        int low = 1, high = n-2;

        while(low <= high)
        {
            int mid = (low+high)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
            {
                return arr[mid];
            }
            if(arr[mid] > arr[mid-1]) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {

        int arr[] = {1,15,25,45,42,21,17,12,11};

//        the array may be rotated several times so in such case we can find any of the peak element

//        peak element is the element which greater than its neighbour
        System.out.println(findPeakElement(arr,arr.length));

    }
}
