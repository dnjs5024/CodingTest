import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public  String[] solution(String[] strings, int n) {
        List<String> answerList = Arrays.stream(strings)
                .sorted(Comparator.comparing(String::toString))
                .sorted((o1, o2) -> String.valueOf(o1.charAt(n)).compareTo(String.valueOf(o2.charAt(n))))
                .collect(Collectors.toList());
        String[] answer = new String[answerList.size()];
        int cnt = 0;
        for(String item : answerList){
            answer[cnt] = item;
            cnt++;
        }
        return answer;
    }
}