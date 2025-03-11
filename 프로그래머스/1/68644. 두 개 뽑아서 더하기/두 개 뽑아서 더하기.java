import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer>list = new ArrayList<>();
        for(int i=0;i< numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                int sum = numbers[i]+numbers[j];
                 if(!list.contains(sum)){
                    list.add(sum);
                }
            }
        }
        list.sort(Integer::compare);
        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int item : list){
            answer[cnt] = item;
            cnt++;
            System.out.println(item);
        }
        return answer;
    }
}