import java.util.*;

public class Anagram {
  static Boolean anagram(String s1, String s2) {
    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    if (Arrays.equals(c1, c2)) {
      return true;
    }
    return false;

  }

  static Boolean anagrams(String s1, String s2) {
    int[] count = new int[26];

    for (char ch : s1.toCharArray()) {
      count[ch - 'a']++;
    }
    for (char ch : s2.toCharArray()) {
      count[ch - 'a']--;
    }
    for (int i = 0; i < s1.length(); i++) {
      if (count[i] == 0) {
        return true;
      }

    }

    return false;

  }

  public static void main(String[] args) {
    String s1 = "cat";
    String s2 = "taca";
    System.out.println(anagram(s1, s2));
    System.out.println(anagrams(s1, s2));

  }

}
