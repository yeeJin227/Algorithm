class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int startCount = 0;
        int endCount = 0;
        int count = 0;

        // 1. 쪼개진 문자 배열을 순회하며 조건 검사
        for(char c : s.toCharArray()){
            if(c == '('){
                startCount += 1;
                count++;
            } else{
                endCount += 1;
                count--;
            }
            
            if(count<0){
                answer=false;
            }
        }
        
        // 2. (와 )의 개수가 다르면 false 반환
        if(startCount != endCount){
            answer=false;
        }
        
        // 3. 최종 결과 반환
        return answer;
    }
}