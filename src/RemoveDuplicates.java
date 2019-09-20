import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {

    public static void main(String[] args) {
        final RemoveDuplicates main = new RemoveDuplicates();
        final String removeDuplicates = main.removeDuplicatesFromString("banana");
        System.out.println("removeDuplicates = " + removeDuplicates);

        int[] numbers = {1, 2, 3, 4, 1, 1, 3, 5};
        final ArrayList<Integer> removeDuplicatesFromIntArray = main.removeDuplicatesFromIntArray(numbers);
        System.out.println("removeDuplicatesFromIntArray = " + removeDuplicatesFromIntArray);

    }

    public String removeDuplicatesFromString(String inp) {

        HashMap<Character, Integer> visitedCount = new HashMap<>();
        String output = "";
        for (int i = 0; i < inp.length(); i++) {
            Character characterFromString = inp.charAt(i);
            final Integer count = visitedCount.getOrDefault(characterFromString, 0);
            if (count == 0) {
                output = output + characterFromString;
            }
            visitedCount.put(characterFromString, count+1);

        }
        return output;
    }

    public ArrayList<Integer> removeDuplicatesFromIntArray(int[] inp) {
        HashMap<Integer, Integer> visitedCount = new HashMap<>();

        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < inp.length; i++) {
            int intFromArray = inp[i];
            final Integer count = visitedCount.getOrDefault(intFromArray, 0);
            if (count == 0) {
                output.add(intFromArray);
            }
            visitedCount.put(intFromArray, count+1);

        }
        return output;
    }
}
