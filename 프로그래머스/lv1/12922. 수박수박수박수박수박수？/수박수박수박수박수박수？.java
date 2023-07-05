class Solution {
    private static int ODD=1;
    private static final char SU = '수';  
    private static final char BAK = '박';
    //수박을 어떻게 다룰 것인가 '수박'과 '수'로 다룰 것인가 '수'와 '박'으로 다룰 것인가
    public String solution(int n) {
        char[] chars = new char[n]; 
        for(int i=0;i<n;++i) //초기화법에 대한 관점 -- 다양하게
            if((i&ODD)==ODD)
                chars[i]=BAK;
            else
                chars[i]=SU;
        
        return new String(chars);
    }
}