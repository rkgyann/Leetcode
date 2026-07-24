class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: if array is empty or null, return empty string
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Initialize prefix with the first string
        String prefix = strs[0];
        
        // Compare the prefix with all other strings in the array
        for (int i = 1; i < strs.length; i++) {
            // Keep shortening the prefix until it is found at index 0 of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}
