import java.util.*;

class Solution {
  public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int cnt = 0;
        for(int[] items : commands){
            int[] tempArray = Arrays.stream(array, items[0] - 1, items[1])
                    .sorted()
                    .toArray();
            answer[cnt] = tempArray[items[2] - 1];
            cnt++;
        }
        for(int a:answer){
            System.out.println(a);
        }
        return answer;
    }
}