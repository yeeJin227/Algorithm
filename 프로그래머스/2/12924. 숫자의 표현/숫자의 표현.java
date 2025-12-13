class Solution {
    public int solution(int n) {
        int count = 0;
        
        // 1. 시작 자연수
        for(int start =1; start<= n; start++){
            int sum = 0;
            
            // 2. start부터 연속된 자연수들의 합 구하기
            for(int i=start; i<=n; i++){
                sum += i;
                
                if(sum>n) break;
                
                if(sum == n){
                    count++;
                    break;
                }
            }
        }
        
        // 3. 결과 반환하기
        return count;
    }
}