package ArrayProblems;

public class Solution {

    int slidingWindow(int[] arr, int k){
        int longest = 0;
        int wincnt = 0;

        for (int j = 0; j < k; j++) {
            wincnt += arr[j];
        }

        longest = Math.max(longest, wincnt);

        for (int i = 3; i < arr.length; i++) {
            wincnt = wincnt - arr[i-k] + arr[i];
            longest = Math.max(wincnt, longest);
        }

        return longest;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        
        int[] arr = {2, 1, 5, 1, 3, 2};
        System.out.println("---> " + 
        obj.slidingWindow(arr, 3)
        );
    }
}
