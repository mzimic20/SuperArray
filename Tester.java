public class Tester {

  public static void main(String[]args) {
    SuperArray words = new SuperArray();
    System.out.println( "size == 10?: " + (words.size() == 10) );
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++) {
      System.out.println( words.get(i) );
    }
  }

}
