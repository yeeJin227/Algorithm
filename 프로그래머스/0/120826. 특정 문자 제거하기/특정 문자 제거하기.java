class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        String[] my_String = my_string.split("");
        for(int i=0; i<my_String.length; i++){
            if(!my_String[i].equals(letter)){
                answer += my_String[i];
            }
        }
        return answer;
    }
}