import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i : score) {
            list.add(i);
        }
        list.sort(Comparator.reverseOrder());
        for (int i = 0; i < list.size() / m; i++) {
            answer += list.get((m * (i + 1) - 1)) * m;
        }
        return answer;
    }
}