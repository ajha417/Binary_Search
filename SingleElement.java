public class SingleElement {

    static int findSingleElement(int arr[],int n)
    {
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];
        int low = 1, high = n-2;
        while (low <= high)
        {
            int mid = (low + high)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1])
            {
                return arr[mid];
            }
            if((mid % 2 == 1 && arr[mid] == arr[mid-1]) || (mid % 2 == 0 && arr[mid] == arr[mid+1]))
            {
                low = mid+1;
            }
            else high = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {

//        there are elements which repeats twice but there is only one element which is present once
//        find that element which is present once in array

        int arr[] = {1,1,2,3,3,4,4,5,5,6,6};
//        here we can observe the pattern that before target element duplicates lies at even and odd
//        in right half it lies at odd and even position

        System.out.println(findSingleElement(arr,arr.length));
    }
}
