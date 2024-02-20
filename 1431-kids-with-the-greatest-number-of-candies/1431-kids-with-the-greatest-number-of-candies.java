class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> result = new ArrayList <Boolean>();

        for(int i = 0; i < candies.length; i++) {
            if(candies[i] > max) max = candies[i];
        }

        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max) {
                result.add(Boolean.TRUE);
            } else result.add(Boolean.FALSE);
        }

        return result;
        
    }
}