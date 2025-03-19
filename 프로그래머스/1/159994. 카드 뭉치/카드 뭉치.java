class Solution {
    public  String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int cards1Num = 0;
        int cards2Num = 0;
        for (String item : goal) {
            if (checkStr(cards1, item, cards1Num)) {
                cards1Num++;
                continue;
            }
            if (checkStr(cards2, item, cards2Num)) {
                cards2Num++;
                continue;
            }
            answer = "No";
            break;
        }
        return answer;
    }

    public  boolean checkStr(String[] items, String item, int num) {
        if (num < items.length) {
            if (items[num].equals(item)) {
                return true;
            }
        }
        return false;
    }
}