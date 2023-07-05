class Solution {
    private static final int ODD = 1; 
    public String solution(String s) { 
        // 필요한 것 s 가 몇 글자인지? 그 글자가 짝수인지 홀수인지 어떻게 구별할건지
        // 짝수라면 두 글자를 어떻게 반환할건지?
     
        int length = s.length();
        int index = length/2; 
        if((length&ODD)==ODD) // & 연산자를 이용해 비트 값을 비교
            return s.substring(index, index+1);  // 표현법 substring(a,b) --- a이상 b미만
        return s.substring(index-1, index+1); 
    }
}


