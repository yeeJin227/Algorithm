import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        // 1. 각 귤 크기별 개수 세기
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : tangerine){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        // 2. 개수 기준 내림차순 정렬
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        
        // 3. 반복문 돌며 k개 채우기
        int answer = 0;
        for(Map.Entry<Integer,Integer> entry : list){
            k -= entry.getValue();
            answer++;
            if(k<=0){
                break;
            }
        }
        
        // 4. 결과 반환
        return answer;
    }
}