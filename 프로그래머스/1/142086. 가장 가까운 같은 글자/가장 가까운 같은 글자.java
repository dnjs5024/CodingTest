import java.util.*;

class Solution {
    public static int[] solution(String s) {
        List<Integer> answerList = new ArrayList<>();
        Map<String,Integer>map =new HashMap<>();
        char[] charArray = s.toCharArray();
        int[] answer = new int[charArray.length];
        int cnt = 0;
        for(char item : charArray){
            String str = String.valueOf(item);
            if(!map.containsKey(str)){
                map.put(str,cnt);
                answerList.add(-1);
            }else{
                answerList.add(cnt-map.get(str));
                map.put(str,cnt);
            }
            cnt++;
        }
        cnt = 0;
        for(int item : answerList){
            answer[cnt] = item;
            cnt++;
        }
        return answer;
    }
}