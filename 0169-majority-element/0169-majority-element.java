class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        
        int maxOccurences = 0;
        int majority = 0;
        for(int i = 0; i < n; i++) {
            int occurencesOfCurrent = 1;
            for(int j = i + 1; j < n; j++){
                if(nums[j] == nums[i]){
                    occurencesOfCurrent++;
                }
            }
            if(occurencesOfCurrent > maxOccurences) {
                maxOccurences = occurencesOfCurrent;
                majority = nums[i];
            }
        }
        return majority;
    }
}