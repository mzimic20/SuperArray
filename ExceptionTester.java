public class ExceptionTester {

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
    try {
      SuperArray phrases = new SuperArray(-3);
      System.out.println( words.get(-5) );
      System.out.println( words.set(50, "no thank you") );
      words.add(24, "yes please");
      System.out.println( words.remove(30) );
    }
    catch (IllegalArgumentException e) {
      System.out.println(e);
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println(e);
    }
  }

}
