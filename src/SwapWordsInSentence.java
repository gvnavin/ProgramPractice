public class SwapWordsInSentence {

  public static void main(String[] args) {
    final SwapWordsInSentence swapWordsInSentence = new SwapWordsInSentence();
//    swapWordsInSentence.swapWords("Hi This is java programming");
//    swapWordsInSentence.swapWords("Hi This is wonderful java programming");
    swapWordsInSentence.swapWordsV2("Hi This is java programming");
    swapWordsInSentence.swapWordsV2("Hi This is wonderful java programming");
  }

  private void swapWordsV2(String input) {
    final String[] arraysOfStringWords = input.split(" ");
    String[] outputArray = new String[arraysOfStringWords.length];
    for (int i = 0; i < arraysOfStringWords.length; i++) {
      if (i%2 == 0 ) { //even
        if (i == arraysOfStringWords.length-1) {
          outputArray[i] = arraysOfStringWords[i];
        } else {
          outputArray[i + 1] = arraysOfStringWords[i];  //assign next
        }
      } else if (i%2 == 1) { //odd
        outputArray[i-1] = arraysOfStringWords[i];  //assign to previous
      }
    }

    String output = "";
    for (int i = 0; i < outputArray.length; i++) {
      System.out.print(outputArray[i] + " ");
      output = output + outputArray[i];
      if (i == outputArray.length-1) {
        ;
      } else {
        output = output + " ";
      }
    }
    System.out.println();
    System.out.println(output);

  }

  private void swapWords(String input) {
    final String[] arraysOfStringWords = input.split(" ");
    String output = "";
    for (int i = 0; i < arraysOfStringWords.length; i = i+2) {

      String firstWord = arraysOfStringWords[i];
      String secondWord = "";
      if (i+1 < arraysOfStringWords.length) {
         secondWord = arraysOfStringWords[i + 1];
      }

      String temp = firstWord;

      if (!secondWord.equals("")) {
        arraysOfStringWords[i] = secondWord;
      }

      if (i+1 < arraysOfStringWords.length) {
        arraysOfStringWords[i + 1] = temp;
      }

      output = output + secondWord + " "+firstWord + " ";

    }

    for (int i = 0; i < arraysOfStringWords.length; i++) {
      System.out.print(arraysOfStringWords[i] + " ");
    }
    System.out.println();
    System.out.println("output = " + output);

  }

}
