class Solution {
    public int[] solution(String s) {
        // 0. 변수 선언
        int binaryCount = 0;
        int totalZeroCount = 0;
        
        // 1. s가 1이 될 때까지 무한 반복문
        while(!s.equals("1")){
            int zeroCount = 0;
            
            // 2. 0 제거
            for(char c : s.toCharArray()){
                if(c=='0'){
                    zeroCount++;
                }
            }
            
            totalZeroCount += zeroCount; 
            
            // 3. 0 제거된 s 길이 재정의
            int sLength = s.length() - zeroCount;
            
            // 4. 이진 변환된 문자열로 s 교체
            s = Integer.toBinaryString(sLength);
            
            // 5. 이진변환 횟수 증가
            binaryCount++;
        }
        
        // 6. 결과 반환
        return new int[]{binaryCount, totalZeroCount};
    }
}