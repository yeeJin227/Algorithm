class Solution {
    public String solution(String s) {
        // 문자열을 공백으로 나누어 배열로 변환
        String[] parts = s.split(" ");
        
        // 첫 번째 값을 초기 최소/최대값으로 설정
        int min = Integer.parseInt(parts[0]);
        int max = Integer.parseInt(parts[0]);
        
        // 나머지 숫자들을 확인하며 최소/최대 업데이트
        for (String part : parts) {
            int num = Integer.parseInt(part);
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        // 결과 문자열 반환
        return min + " " + max;
    }
}
