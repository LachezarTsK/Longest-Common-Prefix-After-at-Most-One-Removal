
package main

func longestCommonPrefix(source string, target string) int {
    maxPrefixLength := min(len(source), len(target))
    checkLengthSource := min(len(source), maxPrefixLength + 1)

    indexSource := 0
    indexTarget := 0
    longestCommonPrefix := 0

    for indexSource < checkLengthSource && indexTarget < maxPrefixLength {
        if source[indexSource] == target[indexTarget] {
            indexTarget++
            longestCommonPrefix++
        } else if indexSource > indexTarget {
            break
        }
        indexSource++
    }

    return longestCommonPrefix
}
