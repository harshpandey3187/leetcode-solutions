
class Solution {
    boolean isalphanumeric(char c) {
        c = Character.toLowerCase(c);

        if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
            return true;
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        int n = s.length();
        int start = 0, end = n - 1;

        while (start < end) {
            if (!isalphanumeric(s.charAt(start))) {
                start++;
                continue;
            }

            if (!isalphanumeric(s.charAt(end))) {
                end--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}