
public class Solution {

    public int longestCommonPrefix(String source, String target) {
        int maxPrefixLength = Math.min(source.length(), target.length());
        int checkLengthSource = Math.min(source.length(), maxPrefixLength + 1);

        int indexSource = 0;
        int indexTarget = 0;
        int longestCommonPrefix = 0;

        while (indexSource < checkLengthSource && indexTarget < maxPrefixLength) {
            if (source.charAt(indexSource) == target.charAt(indexTarget)) {
                ++indexTarget;
                ++longestCommonPrefix;
            } else if (indexSource > indexTarget) {
                break;
            }
            ++indexSource;
        }

        return longestCommonPrefix;
    }
}
