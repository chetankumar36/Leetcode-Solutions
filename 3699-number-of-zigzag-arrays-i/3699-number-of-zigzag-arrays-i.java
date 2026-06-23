class Solution {
    static final int MOD = 1_000_000_007;

    public int zigZagArrays(int n, int l, int r) {

        int m = r - l + 1;

        long[] up = new long[m];
        long[] down = new long[m];

        // Base: length = 1
        // up[i]   = ways ending at value i, next move should be UP
        // down[i] = ways ending at value i, next move should be DOWN
        for (int i = 0; i < m; i++) {
            up[i] = 1;
            down[i] = 1;
        }

        // Build arrays from length 2 to n
        for (int len = 2; len <= n; len++) {

            long[] newUp = new long[m];
            long[] newDown = new long[m];

            // Prefix sum of up
            long[] preUp = new long[m];
            preUp[0] = up[0];
            for (int i = 1; i < m; i++) {
                preUp[i] = (preUp[i - 1] + up[i]) % MOD;
            }

            // Suffix sum of down
            long[] sufDown = new long[m];
            sufDown[m - 1] = down[m - 1];
            for (int i = m - 2; i >= 0; i--) {
                sufDown[i] = (sufDown[i + 1] + down[i]) % MOD;
            }

            for (int i = 0; i < m; i++) {

                // Next comparison should be UP
                if (i > 0)
                    newDown[i] = preUp[i - 1];

                // Next comparison should be DOWN
                if (i < m - 1)
                    newUp[i] = sufDown[i + 1];
            }

            up = newUp;
            down = newDown;
        }

        long ans = 0;
        for (int i = 0; i < m; i++) {
            ans = (ans + up[i] + down[i]) % MOD;
        }

        return (int) ans;
    }
}