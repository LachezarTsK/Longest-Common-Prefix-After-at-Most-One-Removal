
import kotlin.math.min

class Solution {
    
    fun longestCommonPrefix(source: String, target: String): Int {
        val maxPrefixLength = min(source.length, target.length)
        val checkLengthSource = min(source.length, maxPrefixLength + 1)

        var indexSource = 0
        var indexTarget = 0
        var longestCommonPrefix = 0

        while (indexSource < checkLengthSource && indexTarget < maxPrefixLength) {
            if (source[indexSource] == target[indexTarget]) {
                ++indexTarget
                ++longestCommonPrefix
            } else if (indexSource > indexTarget) {
                break
            }
            ++indexSource
        }

        return longestCommonPrefix
    }
}
