class Solution {
    private static final char ZERO='0';
    private static final char NINE='9';
    public int solution(String my_string) {
        char[] chars = my_string.toCharArray();
        int sum = 0;
        for(char c : chars)
            if(ZERO<=c&&c<=NINE)
                sum+=c-ZERO;
        // A는 '0'~'9'
        // char A 있다고 할때 'A'-'0'은 char 고유의 유니코드 값을 통해 문자를 숫자로 변환할 수 있다 
        // 자바에서는 문자열끼리의 계산이나 비교는 자동으로 유니코드 값으로 변환하여 비교한다
        return sum;
    }
}