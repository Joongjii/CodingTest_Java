class Solution {
    public long[] solution(int x, int n) {
        
        long[] answer = new long[n]; // 길이가 n인 배열 answer 생성
        long element=x;
        for(int i=0; i<n; ++i){ 
            answer[i]=element; // 0번째 index에 x부터 시작
            element+=x; // 다음 index부터는 x만큼 증가한 x가 대입
        }
        return answer;
    }
}