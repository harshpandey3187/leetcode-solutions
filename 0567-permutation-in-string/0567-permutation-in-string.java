
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m) {
            return false;
        }

        int[] count = new int[26];

        // Count characters in s1
        for (int i = 0; i < n; i++) {
            count[s1.charAt(i) - 'a']++;
        }

        // Sliding window over s2
        for (int i = 0; i < m; i++) {
            // Add current character
            count[s2.charAt(i) - 'a']--;

            // Remove character outside the window
            if (i >= n) {
                count[s2.charAt(i - n) - 'a']++;
            }

            // Check if all character frequencies match
            if (i >= n - 1 && allZero(count)) {
                return true;
            }
        }

        return false;
    }

    private boolean allZero(int[] count) {
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }
}