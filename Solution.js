
/**
 * @param {string} source
 * @param {string} target
 * @return {number}
 */
var longestCommonPrefix = function (source, target) {
    const maxPrefixLength = Math.min(source.length, target.length);
    const checkLengthSource = Math.min(source.length, maxPrefixLength + 1);

    let indexSource = 0;
    let indexTarget = 0;
    let longestCommonPrefix = 0;

    while (indexSource < checkLengthSource && indexTarget < maxPrefixLength) {
        if (source[indexSource] === target[indexTarget]) {
            ++indexTarget;
            ++longestCommonPrefix;
        } else if (indexSource > indexTarget) {
            break;
        }
        ++indexSource;
    }

    return longestCommonPrefix;
};
