public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr={2, 3, 5, 6, 8, 9, 13, 15, 19};
        int target = 1;
        int ans = floor( arr ,target);
        System.out.println(ans);
    }
    static int floor(int[] arr , int target){

        int start = 0;
        int end = arr.length - 1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if(arr[mid]==target)
                return target;
            else if (arr[mid] < target)
                start = mid + 1;
            else if (arr[mid] > target)
                end = mid - 1;
        }
        if (target<arr[0]) {
            return -1;
        }
        return arr[end];

    }
}
