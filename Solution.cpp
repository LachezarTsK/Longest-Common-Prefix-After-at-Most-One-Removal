
#include <string>
#include <algorithm>
using namespace std;


class Solution {

public:
    int longestCommonPrefix(const string& source, const string& target) const {
        int maxPrefixLength = min(source.length(), target.length());
        int checkLengthSource = min(static_cast<int>(source.length()), maxPrefixLength + 1);

        int indexSource = 0;
        int indexTarget = 0;
        int longestCommonPrefix = 0;

        while (indexSource < checkLengthSource && indexTarget < maxPrefixLength) {
            if (source[indexSource] == target[indexTarget]) {
                ++indexTarget;
                ++longestCommonPrefix;
            }
            else if (indexSource > indexTarget) {
                break;
            }
            ++indexSource;
        }

        return longestCommonPrefix;
    }
};
