class Solution {
    private static final char ZERO = '0';
    public int[] solution(long n) {
        char[] chars = String.valueOf(n).toCharArray(); // 문자열 쪼개기
        int index = chars.length;
        int[] result = new int[index]; //새로운 배열 생성
        for(char c : chars) 
            //for (int i = 0; i < chars.length; i++) {
            //      char c = chars[i];
            result[--index]=c-ZERO; // 계산된 정수 값은 거꾸로 배열에 들어간다
        return result;
    }
}