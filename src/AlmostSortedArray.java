public class AlmostSortedArray {

  public static void main(String[] args) {
    int arr[] = {10, 30, 20, 40, 50, 60, 70};
    final AlmostSortedArray almostSortedArray = new AlmostSortedArray();
    almostSortedArray.sortByOneSwap(arr);
  }

  public void sortByOneSwap(int input[]) {

    for (int i = 0; i < input.length-1; i++) {

      if (input[i] <= input[i+1]) {
        ;
      } else {
        for (int j = i;  input[j] > input[j+1] && j >= 0; j--){
          int first = input[j];
          int second = input[j + 1];
          int temp = first;
          input[j] = second;
          input[j + 1] = temp;
        }

      }

    }

    for (int i = 0; i < input.length; i++) {
      System.out.println("input[i] = " + input[i]);
    }

  }
}
