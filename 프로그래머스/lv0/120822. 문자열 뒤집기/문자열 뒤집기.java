class Solution {
    public String solution(String my_string) {
        String reverse = "";
        StringBuffer sb = new StringBuffer(my_string);
        reverse = sb.reverse().toString();
        return reverse;
    }
}