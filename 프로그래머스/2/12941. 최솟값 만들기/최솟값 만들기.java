import java.util.*;

class Solution{
    public int solution(int []A, int []B){
        int sum = 0;
        
        // 1. 최소합을 만들기 위해 배열 A와 배열 B를 오름차순으로 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        
        // 2. 가장 큰 수 * 가장 작은 수로 매칭
        for(int i=0; i<A.length; i++){
            sum += A[i] * B[B.length-1-i];
        }
        
        // 3. 최솟값 반환
        return sum;
    }
}