package programmers.level2;

import java.util.Arrays;

public class HINDEX {
        public int solution(int[] citations) {
            int answer = 0;
            Arrays.sort(citations);
            int length = citations.length;
            for(int i=0; i<length; i++){
                if (citations[i] >= length-i) {
                    answer = length-i;
                    break;
                }
            }
            return answer;
        }
}
