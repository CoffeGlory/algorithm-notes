import java.util.HashSet;

public class Test {
    public static void main(String[] args){
        String x = new String("I hate");
        String x2 = new String("java");
        x = x + " " + x2;
        System.out.println(x);

        char x3 = x.charAt(1);
        System.out.println(x3);




        // int ans = lengthOfLongestSubstring(s);
        // System.out.println(ans);


        int[] num = new int[] {1, 1, 1, 2, 2, 3};
        int ans = lengthOfLongestSubstring2(num);
        System.out.println(ans);
        System.out.println(java.util.Arrays.toString(num));
    }

    // leetcode 3: Longest Substring Without Repeating Characters
    // Strategy: Brute Force
    // Time Complexity: O(n^2)

    // Approach:
    // Delcare one loop to iterate each index
    // Delcare another loop to move to right until a duplicater character is met
    // Use a hashset to store the characters and check if the character is already in the hashset
    // added maxlength variable and update it after each iteration of the first loop

    // Update the max length after each iteration of the first loop
    public static int lengthOfLongestSubstring(String s) {
        // declare a variable to store the max length
        int maxLength = 0;

        // iterate each index
        for(int i =0; i< s.length(); i++){
            // in each iteration move to right

            java.util.HashSet<Character> set = new java.util.HashSet<>();
            // move to right until we find a duplicate character
            for(int j =i; j < s.length(); j++){
                
                // Guild 1 see if it's in the hashset
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
            }

            // Guild 2 update the max length
            int currentLength = set.size();
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }


    // Strategy: Two Pointers
    // Time Complexity: O(n)

    // Approach:
    // Declare a k pointer, and only update it 
    public static int lengthOfLongestSubstring2(int[] nums) {
        int k = 0;

        // iterate each index
        for(int i = 0; i < nums.length; i++){
            if(k < 2 || nums[i] != nums[k-2] ){
                // the k++ in nums[k++] pointer will first assign the value of nums[i] to nums[k], then increment k by 1
                nums[k++] = nums[i];
            }
            
        }
        return k;
    }

        private int p1=0, p2 =0;



    // Find the minimum of the two arrays, and move the pointer of the array that has the smaller value
    private int getMin(int[] nums1, int[] nums2){
        if (p1 < nums1.length && p2<nums2.length){
            return nums1[p1] < nums2[p2] ? nums1[p1++] : nums2[p2++];
        } else if (p1 < nums1.length){
            return nums1[p1++];
        } else if (p2 < nums2.length){
            return nums2[p2++];
        }
        return -1;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if((m+n)%2 == 0){
            for(int i = 0; i < (m+n)/2-1; ++i){
                int tmp = getMin(nums1, nums2);
            }
            return (double) (getMin(nums1,nums2)+getMin(nums1, nums2))/2;

        }else{
            for(int i =0; i <(m+n)/2; ++i){
                int tmp = getMin(nums1,nums2);
            }
            return getMin(nums1, nums2);
        }
    }


}
