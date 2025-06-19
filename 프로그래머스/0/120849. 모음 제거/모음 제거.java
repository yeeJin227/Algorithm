class Solution {
    public String solution(String my_string) {
        String result = "";
        String[] answer = my_string.split("");
        for(int i=0; i<answer.length; i++){
            if(!answer[i].equals("a") && 
               !answer[i].equals("e") && 
               !answer[i].equals("i") && 
               !answer[i].equals("o") && 
               !answer[i].equals("u")){
                result += answer[i];
            }
        }
        return result;
        
        // 그냥 return my_string.replaceAll("[a,e,i,o,u]","");
        // 이라고 해도 성공. .replaceAll("","") 
    }
}