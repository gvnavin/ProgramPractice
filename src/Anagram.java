import java.util.HashMap;

public class Anagram {

  public static void main(String[] args) {
    final Anagram main = new Anagram();
    final boolean anagramOrNot = main.isAnagramOrNotV1("parachute", "raphtueac");
    System.out.println("anagramOrNot = " + anagramOrNot);

  }

  private boolean isAnagramOrNotV1(String firstString, String secondString) {
    HashMap<Character, Integer> firstStringVisitedCount = new HashMap<>();
    for (int i = 0; i < secondString.length(); i++) {
      Character characterFromString = firstString.charAt(i);
      final Integer count = firstStringVisitedCount.getOrDefault(characterFromString, 0);
      firstStringVisitedCount.put(characterFromString, count+1);
    }


    HashMap<Character, Integer> secondStringVisitedCount = new HashMap<>();
    for (int i = 0; i < secondString.length(); i++) {
      Character characterFromString = secondString.charAt(i);
      final Integer count = secondStringVisitedCount.getOrDefault(characterFromString, 0);
      secondStringVisitedCount.put(characterFromString, count+1);
    }

    boolean isAnagram = true;
    for (int i = 0; i < firstString.length(); i++) {
      Character characterFromString = firstString.charAt(i);
      final Integer count1 = firstStringVisitedCount.getOrDefault(characterFromString, 0);
      final Integer count2 = secondStringVisitedCount.getOrDefault(characterFromString, 0);
      if (count1 == count2) {
        isAnagram = true;
      } else {
        isAnagram = false;
      }

    }
    return isAnagram;
  }

  private boolean isAnagramOrNotV2(String firstString, String secondString) {
    HashMap<Character, Integer> firstStringVisitedCount = new HashMap<>();
    for (int i = 0; i < firstString.length(); i++) {
      Character characterFromString = firstString.charAt(i);
      final Integer count = firstStringVisitedCount.getOrDefault(characterFromString, 0);
      firstStringVisitedCount.put(characterFromString, count+1);
    }

    HashMap<Character, Integer> secondStringVisitedCount = new HashMap<>();
    for (int i = 0; i < secondString.length(); i++) {
      Character characterFromString = secondString.charAt(i);
      final Integer count = secondStringVisitedCount.getOrDefault(characterFromString, 0);
      secondStringVisitedCount.put(characterFromString, count+1);
    }

    boolean isAnagram = true;
    for (int i = 0; i < firstString.length(); i++) {
      Character characterFromString = firstString.charAt(i);
      final Integer count1 = firstStringVisitedCount.getOrDefault(characterFromString, 0);
      final Integer count2 = secondStringVisitedCount.getOrDefault(characterFromString, 0);
      if (count1 == count2) {
        isAnagram = true;
      } else {
//                first time different just break, don't continue;
//                isAnagram = false;
//                break;
        return false;
      }

    }
    return isAnagram;
  }

  private boolean isAnagramOrNotV3(String firstString, String secondString) {
    HashMap<Character, Integer> firstStringVisitedCount = new HashMap<>();
    for (int i = 0; i < firstString.length(); i++) {
      Character characterFromString = firstString.charAt(i);
      final Integer count = firstStringVisitedCount.getOrDefault(characterFromString, 0);
      firstStringVisitedCount.put(characterFromString, count+1);
    }

    HashMap<Character, Integer> secondStringVisitedCount = new HashMap<>();
    for (int i = 0; i < secondString.length(); i++) {
      Character characterFromString = secondString.charAt(i);
      final Integer count = secondStringVisitedCount.getOrDefault(characterFromString, 0);
      secondStringVisitedCount.put(characterFromString, count+1);
    }

    for (int i = 0; i < firstString.length(); i++) {
      Character characterFromString = firstString.charAt(i);
      final Integer count1 = firstStringVisitedCount.getOrDefault(characterFromString, 0);
      final Integer count2 = secondStringVisitedCount.getOrDefault(characterFromString, 0);
      if (count1 != count2) {
        return false;
      }

    }
    return true;
  }

  private boolean isAnagramOrNotV4(String firstString, String secondString) {
    HashMap<Character, Integer> firstStringVisitedCount = getCharactersCountHashMap(
        firstString);

    HashMap<Character, Integer> secondStringVisitedCount = getCharactersCountHashMap(
        secondString);

    for (int i = 0; i < firstString.length(); i++) {
      Character characterFromString = firstString.charAt(i);
      final Integer count1 = firstStringVisitedCount.getOrDefault(characterFromString, 0);
      final Integer count2 = secondStringVisitedCount.getOrDefault(characterFromString, 0);
      if (count1 != count2) {
        return false;
      }

    }
    return true;
  }

  private HashMap<Character, Integer> getCharactersCountHashMap(String firstString) {
    HashMap<Character, Integer> firstStringVisitedCount = new HashMap<>();
    for (int i = 0; i < firstString.length(); i++) {
      Character characterFromString = firstString.charAt(i);
      final Integer count = firstStringVisitedCount.getOrDefault(characterFromString, 0);
      firstStringVisitedCount.put(characterFromString, count + 1);
    }
    return firstStringVisitedCount;
  }

}
