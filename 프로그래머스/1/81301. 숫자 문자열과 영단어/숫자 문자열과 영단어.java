class Solution {
   public static int solution(String s) {
        String[] strArray  = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        int cnt = 0;
        for(String item : strArray){
            s = s.replaceAll(item,""+cnt);
            cnt++;
        }
        return Integer.parseInt(s);
    }
}