class Solution {
    public String solution(String my_string) {
        String[] my_String = my_string.split("");
        int myStringLastIndex = my_String.length-1;
        
        String answer = "";
        
        for(int i=0; i<my_String.length; i++){
            answer += my_String[myStringLastIndex--];
        }
        
        return answer;
    }
}