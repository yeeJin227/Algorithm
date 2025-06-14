class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        answer += 12000 * n; // 이게 양꼬치 값
        answer += 2000 * (k - (n / 10)); // 2000 * (음료수 개수 - 무료로 받을 수 있는 음료수 개수) -> 음료수 값
        return answer;
    }
}