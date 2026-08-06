class Solution {
    public char kthCharacter(int k) {
        
        int  len = 1;

        while(len < k) {
            len *=2;
        }
        return  solve(k,len);
    }
    public char solve(int k,int len){

        //Base Case 
        if(len == 1) {
            return 'a';
        }

        int half = len / 2;

        //Firt  Half
        if(k<=half) {
            return  solve(k,half);
        }
        //Second Half
        char ch = solve(k-half,half);

        if(ch =='z')
        return 'a';

        return (char)(ch+1);
    }
}