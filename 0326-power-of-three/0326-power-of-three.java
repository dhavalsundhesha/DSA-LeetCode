class Solution {
    public boolean isPowerOfThree(int n) {

        //Bse case
        if(n == 1) {
            return true;
        }
   if(n<=0 || n % 3 != 0) return  false;
        
        return  isPowerOfThree(n / 3);
    }
}