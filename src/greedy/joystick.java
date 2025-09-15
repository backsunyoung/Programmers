package greedy;

public class joystick {

    public class Solution {
        public int solution(String name) {

            int sum = 0;

            char names[] = new char[name.length()];

            for(int i = 0; i < name.length(); i++){

                names[i] = name.charAt(i);

//
            }

            for(int i = 0; i < name.length(); i++){

                int ascii = (int)names[i];
                System.out.print(ascii);

                if(ascii <= ('A'+12)){ // 78

                    System.out.println(ascii + "는 전");
                    sum += (ascii - 'A');
                    System.out.println(sum);
                }else if (ascii >= ('A'+13)){ // 79
                    System.out.println(ascii + "는 후");
                    sum += ('Z' - ascii+1);
                    System.out.println(sum);
                }// 9 4 8 11 4 13 / 9 13 21 32 36 49



            }

            sum = sum + name.length()-1;


            int answer = sum;
            return answer;
        }
    }
}
