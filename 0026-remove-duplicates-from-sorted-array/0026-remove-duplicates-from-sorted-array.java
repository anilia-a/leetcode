class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
            for(int i = 0; i < k - 1; i++) {
                while(i < k - 1 && nums[i] == nums[i + 1]){
                    for(int j = i + 1;j < k - 1; j++) {
                        nums[j] = nums[j + 1];
                    }
                    k--;
                }
            }
    return k;
    }
}