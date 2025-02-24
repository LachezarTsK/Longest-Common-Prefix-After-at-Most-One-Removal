
using System;

public class Solution
{
    public int LongestCommonPrefix(string source, string target)
    {
        int maxPrefixLength = Math.Min(source.Length, target.Length);
        int checkLengthSource = Math.Min(source.Length, maxPrefixLength + 1);

        int indexSource = 0;
        int indexTarget = 0;
        int longestCommonPrefix = 0;

        while (indexSource < checkLengthSource && indexTarget < maxPrefixLength)
        {
            if (source[indexSource] == target[indexTarget])
            {
                ++indexTarget;
                ++longestCommonPrefix;
            }
            else if (indexSource > indexTarget)
            {
                break;
            }
            ++indexSource;
        }

        return longestCommonPrefix;
    }
}
