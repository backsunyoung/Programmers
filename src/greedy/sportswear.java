package greedy;

public class sportswear {

    public class Solution {
        public int solution(int n, int[] lost, int[] reserve) {



            int answer = 0;

            boolean[] used = new boolean[reserve.length];
            boolean[] recovered = new boolean[lost.length];

            for(int i = 0; i < lost.length; i++){

                for(int j = 0; j < reserve.length; j++){

                    if (used[j]) continue;

                    if(lost[i] == reserve[j]){
                        recovered[i] = true;
                        used[j] = true;
                        break;

                    } else if((lost[i]+1 == reserve[j] || lost[i]-1 == reserve[j]) && !recovered[i]){

                        recovered[i] = true;
                        used[j] = true;
                        break;


                    }

                }


            }

            for(int i = 0; i<recovered.length; i++){
                if(recovered[i]){
                    answer++;
                }
            }

            answer = n - (lost.length - answer);


//
            return answer;
        }
    }
}
