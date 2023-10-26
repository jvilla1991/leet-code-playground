package LeetCode75;

public class ArrayString {

    /** <a href="https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75">...</a>
     *You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
     * starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
     * Returns Merged String
     *
     * @param word1 First String
     * @param word2 Second String
     * @return Single, merged String
     */
    public String mergeStrings(String word1, String word2) {
        StringBuilder sbOutput = new StringBuilder();
        final int maxLength = Math.max(word1.length(), word2.length());
        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                sbOutput.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sbOutput.append(word2.charAt(i));
            }
        }
        return sbOutput.toString();
    }

    /** <a href="https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75">...</a>
     * For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
     * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
     * @param str1 String1
     * @param str2 String2
     * @return Greatest Common Divisor of Strings
     */
    public String gcdOfStrings(String str1, String str2) {
        String shortString;
        String longString;
        if (str1.length() > str2.length()) {
            shortString = str2;
            longString = str1;
        }
        else {
            longString = str2;
            shortString = str1;
        }
        StringBuilder sbOutput = new StringBuilder();

        for (char c : shortString.toCharArray()) {
            sbOutput.append(c);
            for (int i = 0; i < sbOutput.length() && i < longString.length() - 1; i++) {
                if (longString.charAt(i + 1) == sbOutput.charAt(0)) {
                    return sbOutput.toString();
                }

            }
        }
        return "";
    }
}
