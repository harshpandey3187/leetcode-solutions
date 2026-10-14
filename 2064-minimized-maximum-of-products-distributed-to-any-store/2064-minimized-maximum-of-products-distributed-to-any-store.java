
class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int start = 1;
        int end = 0;

        for (int q : quantities) {
            end = Math.max(end, q);
        }

        int ans = end;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(n, quantities, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    private boolean isPossible(int n, int[] quantities, int max) {
        int stores = 0;

        for (int q : quantities) {
            stores += (q + max - 1) / max;

            if (stores > n) {
                return false;
            }
        }

        return true;
    }
}