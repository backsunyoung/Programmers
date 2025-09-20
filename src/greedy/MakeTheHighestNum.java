package greedy;

public class MakeTheHighestNum {

    public class Solution {
        public String solution(String number, int k) {

            String answer = "";


            StringBuilder s = new StringBuilder();

            for(int i = 0; i < number.length(); i++){

                char c = number.charAt(i);

                while (k > 0 && s.length() > 0 && s.charAt(s.length()-1) < c){
                    s.deleteCharAt(s.length() -1);
                    k--;

                    System.out.println(s);
                }
                s.append(c);







//                if(n.charAt(i) >= n.charAt(i+1)){
//                    s.append(n.charAt(i));
//                }
//
//                if(s.length() > number.length() - k){
//                    break;
//                }






            }
            System.out.println("--------");

            if (k > 0){
                System.out.println(s);
                s.setLength(s.length() - k);
            }

            answer = s.toString();

            return answer;
        }
    }


}
