package LeetCode75;

import java.util.ArrayList;
import java.util.List;

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

    /**<a href="https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75">...</a>
     * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
     * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
     * Note that multiple kids can have the greatest number of candies.
     * @param candies Integer Array of how many candies each kid has, where each element is a kid
     * @param extraCandies how many extra candies are available
     * @return A list of booleans that indicate weather a kid, when given the extra candies,
     * would exceed the kids with the highest amount of candies prior to run time.
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatestNumber = 0;
        for (int candy:   candies) {
            if (candy > greatestNumber) {
                greatestNumber = candy;
            }
        }
        List<Boolean> boolList = new ArrayList<>();
        for (int candy : candies) {
            boolList.add(candy + extraCandies >= greatestNumber);
        }
        return boolList;
    }
}
