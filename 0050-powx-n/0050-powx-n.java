class Solution {
    public double myPow(double x, int n) {
        if (n == 0)
            return 1.0;
        if (n == 1)
            return x;
        if (x == 1)
            return 1.0;
        if (x == -1 && n % 2 == 0)
            return 1.0;
        if (x == -1 && n % 2 != 0)
            return -1.0;


        long binaryform = n;
        if (binaryform < 0) {
            x = 1 / x;
            binaryform = -binaryform;
        }
        double ans = 1;
        while (binaryform > 0) {
            if (binaryform % 2 == 1) {
                ans = ans * x;
            }
            x = x * x;
            binaryform /= 2;
        }
        return ans;
    }
}