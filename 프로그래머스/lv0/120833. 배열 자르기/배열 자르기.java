class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        int length = num2-num1;
        int[] answer = new int[length+1]; //인덱스 0번째 값을 생각해야하기 때문에 length+1이다
        
        for(int i=0; i<=length; i++){ // 0~length까지 0부터 들어가기 때문에 length+1개가 들어간다
            answer[i] = numbers[num1+i]; // answer의 0번째 인덱스에 잘라진 첫 위치의 값이 들어간다
        }
        return answer;
    }
}