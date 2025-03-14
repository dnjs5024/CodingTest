import java.util.*;


class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> best = new ArrayList<>();
        int min = 2001;
        int last = 0;
        for (int i = 0; i < score.length; i++) {
            if (i >= k) {
                if (min < score[i]) {
                    best.remove(best.indexOf(min));
                    best.add(score[i]);
                    min = best.stream().min(Integer::compareTo).orElse(0);
                    answer[i] = min;
                } else {
                    answer[i] = min;
                }
            } else {
                best.add(score[i]);
                min = Math.min(min, score[i]);
                answer[i] = min;
            }
        }
        return answer;
    }

}