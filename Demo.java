public class Demo{

  public static void removeDuplicates(SuperArray s) {
    for(int i = 0; i < s.size(); i++) {
      for(int j = i + 1; j < s.size(); j++) {
        if (s.get(i) == s.get(j)) {
          s.remove(j);
          j--;
        }
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    removeDuplicates(a);
    removeDuplicates(b);
    SuperArray ans = new SuperArray();
    for(int i = 0; i < a.size(); i++) {
      if (b.contains( a.get(i) )) ans.add( a.get(i) );
    }
    return ans;
  }

  public static void main(String[]args) {
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add("una");
    words.add("una");
    words.add("ebi");
    words.add("kani");
    words.add("una");
    words.add("una");
    words.add("ebi");
    words.add("toro");
    SuperArray phrases = new SuperArray();
    phrases.add("nope");
    phrases.add("toro");
    phrases.add("hello");
    phrases.add("goodbye");
    phrases.add("toro");
    phrases.add("una");
    phrases.add("kani");
    phrases.add("ebi");
    System.out.println("TESTER removeDuplicates");
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
    System.out.println("\nTESTER findOverlap");
    System.out.println(words + "\t" + phrases);
    System.out.println( findOverlap(words, phrases) );
  }

}
