class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1Length = word1.length();
        int word2Length = word2.length();
        StringBuilder output = new StringBuilder();
        int i = 0;
        switch (Integer.compare(word1Length, word2Length)) {
            case 0:
                for (i = 0; i < word1Length; i++) {
                    output.append(word1.charAt(i)).append(word2.charAt(i));
                }
                break;
            case 1:
                for (i = 0; i < word1Length; i++) {
                    if (i < word2Length) {
                        output.append(word1.charAt(i)).append(word2.charAt(i));
                    } else {
                        output.append(word1.charAt(i));
                    }
                }
                break;
            case -1:
                for (i = 0; i < word2Length; i++) {
                    if (i < word1Length) {
                        output.append(word1.charAt(i)).append(word2.charAt(i));
                    } else {
                        output.append(word2.charAt(i));
                    }
                }
                break;
        }
        return output.toString();
    }
}