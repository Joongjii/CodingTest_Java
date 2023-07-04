class Solution {
    public int solution(int n) {
        int comb = n-1;
        for(int a=n-2;a>0;--a)
            if(comb%a==0)
                return comb/a;
        return 0;
    }
}