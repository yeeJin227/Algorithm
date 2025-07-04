class Solution {
    public int solution(int[] sides) {
        int answer = 1;
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];
        
        if(a >= b+c){
            answer = 2;
        }
        if(b >= a+c){
            answer = 2;
        }
        if(c>= a+b){
            answer = 2;
        }

        return answer;
    }
}