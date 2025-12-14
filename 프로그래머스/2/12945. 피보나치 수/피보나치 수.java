class Solution {
    public int solution(int n) {
        int first = 0;
        int second = 1;
        
        int count = 2;
        while(count <= n){
            int c = (first+second) % 1234567;
            first = second;
            second = c;
            count++;
        }
        return second;
    }
}