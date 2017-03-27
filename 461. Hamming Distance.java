/*A simple XOR operation will tell us what we needed for the solution.
XOR will set the same bits to 0 and different bits to 1, which is what we need to find out.*/

public class Solution {
    public int hammingDistance(int x, int y) {
        
        int count = 0;
        
        int z = x^y;
        
        while(z!=0){
            if((z&1) == 1){
                count++;
            }
            z = z>>1;
        }
        
        return count;
    }
}
