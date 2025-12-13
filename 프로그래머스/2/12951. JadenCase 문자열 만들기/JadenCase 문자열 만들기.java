class Solution {
    public String solution(String s) {
        
        StringBuilder newString = new StringBuilder();
        
        boolean isStart = true; // 단어의 시작 여부
        
        // 1. 문자열을 한 문자씩 순회하면서, 공백 뒤에 나오는 첫 문자는 대문자로 변경
        for(char c : s.toCharArray()){
            if(c == ' '){
                newString.append(c);
                isStart = true;
            } else{
                if(isStart){
                    c = Character.toUpperCase(c);
                    newString.append(c);
                    isStart=false;
                }else{
                    c = Character.toLowerCase(c);
                    newString.append(c);
                }
            }
        }
        // 2. 새로 만들어진 StringBuilder를 String으로 변환 후 출력
        return newString.toString();
    }
}