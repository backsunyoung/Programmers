package greedy;

import java.util.Arrays;

public class boat {

    public class Solution {
        public int solution(int[] people, int limit) {
            int answer = 0;

            for(int i = 0; i < people.length; i++){
                System.out.print(people[i]+" ");
            }

            Arrays.sort(people);
            System.out.println("소트 후 ");
            for(int i = 0; i < people.length; i++){
                System.out.print(people[i]+" ");
            }


            int left = 0;
            int right = people.length-1;

            while(left <= right){

                if(people[left]+people[right] <= limit){
                    // answer++;
                    left++;
                }
                answer++;
                right--;

            }




//            for(int i = 0; i < people.length/2; i++){
//                if ((people[i] + people[people.length-1-i]) <= limit){
//                    answer++;
//                }
//
//
//            }
            return answer;
        }
    }
}
