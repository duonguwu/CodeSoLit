import java.lang.Math;

class Solution {
    public boolean judgeSquareSum(int c) {
        long i = 0;
        long j = (int) Math.sqrt(c);

        while(i<=j){
            long sum = i*i + j*j;
            if (sum == c)
                return true;
            else if (sum > c) 
                j--;
            else
                i++;

        }
        return false;
    }
}