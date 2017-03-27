/*
Lets break down the solution step wise.
1) Integer.highestOneBit(num) will give you the value of MSB i.e if given number is 5, 101, we will get 100 which is 4. 
2) So subracting 1 from the value obtained from Integer.highestOneBit(num) will give us all one's. Eg 4 will give us 3, i.e 11.
3) (Integer.highestOneBit(num)-1)<< is simply multiplying the number by 2.
4) Adding one to above number will set the LSB to 1.
5) Now XOR the num and res to get the answer.
*/


public class Solution {
    public int findComplement(int num) {
        int res = ((Integer.highestOneBit(num)-1)<<1)+1;
        return res^num;
    }
}
