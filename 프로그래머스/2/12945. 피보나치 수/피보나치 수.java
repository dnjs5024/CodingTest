import java.math.BigInteger;

class Solution {
    public int solution(int n) {
        BigInteger[] sumArray = new BigInteger[n+1];
        sumArray[0] = BigInteger.valueOf(0);
        sumArray[1] = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            sumArray[i] = sumArray[i-2].add(sumArray[i-1]);
        }
        return  sumArray[n].remainder(BigInteger.valueOf(1234567)).intValue();
    }
}