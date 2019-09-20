public class PairSum {

  public static void main(String[] args) {
    final PairSum pairSum = new PairSum();
    pairSum.pairSumV1(new int[]{4, 1, 3, 5, 2, 6, 8, 7}, 8);
  }

  private  void pairSumV1(int[] inputs, int targetSum) {

    for (int i = 0; i < inputs.length; i++) {
      int number1 = inputs[i];

      for (int j = i+1; j < inputs.length; j++) {
        int number2 = inputs[j];

        if (number1 + number2 == targetSum) {
          System.out.println("number1 = "+ number1 +", number2 = " + number2 + " targetSum = " + targetSum);
        }
      }
    }

  }

}
