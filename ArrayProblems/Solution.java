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

    void prefixSum(int[] arr, int que[][]){

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = arr[i] + prefix[i-1];
        }

        int longest = Integer.MAX_VALUE;

        for(int[] num : que){
            int right = num[1];

            longest = Math.max(prefix[right], longest);
        }

        System.out.println(Integer.MAX_VALUE);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        
        int arr[] = {1, 2, 3, 4, 5};
        int[][] que = {{0, 2},{1, 3},{2, 4}};

        obj.prefixSum(arr, que);
    }
}