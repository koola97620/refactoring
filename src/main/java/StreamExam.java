import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @author choijaeyong on 21/06/2019.
 * @project refactoring
 * @description
 */
public class StreamExam {

  public static void main(String[] args) {
    int[] arr = {5,9,7,10};
    int divisor = 5;

    int[] answer = solution(arr,divisor);
    System.out.println(Arrays.toString(answer));

  }

  public static int[] solution(int[] arr, int divisor) {
    int[] answer = Arrays.stream(arr)
        .filter(num -> num % divisor ==0)
        .sorted()
        .toArray();

    return answer;
  }

}
