class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length -1;

        while(i < j) {
            int length = Math.min(height[i], height[j]);
            int area = length * (j - i);
            maxArea = Math.max(area, maxArea);
            if(height[i] < height[j]) {
                i++;
            }
            else j--;
        }
        return maxArea;
    }
}