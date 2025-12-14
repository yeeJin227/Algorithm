class Solution {
    public int solution(int n) {
        int nCount = 0;
        int answer = 0;
        
        // 1. n 2진수 변환 후 1의 개수 구하기
        String nToBinary = Integer.toBinaryString(n); 
        for(char c : nToBinary.toCharArray()){
            if(c=='1'){
                nCount++;
            }
        }
        
        // 2. n보다 큰 자연수를 차례로 2진수로 변환
        for(int i=n+1; i<1000000; i++){
            int biggerThanNCount = 0;
        
            String biggerThanNToBinary = Integer.toBinaryString(i);
            for(char ch : biggerThanNToBinary.toCharArray()){
                if(ch == '1'){
                    biggerThanNCount++;
                } 
            }
            if(biggerThanNCount == nCount){
                answer = i;
                break;
            }
        }

        // 3. 정답 출력
        return answer;
    }
}