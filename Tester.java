public class Tester {

  public static void main(String[]args) {
    SuperArray words = new SuperArray();
    System.out.println( "words.size() -> 10: " + words.size() );
    words.add("prljavo kazaliste");
    words.add("thompson");
    words.add("bijelo dugme");
    for(int i = 0; i < words.size(); i++) {
      System.out.println( words.get(i) );
    }
    System.out.println( "words.set(1, zeljko bebek): " + words.set(1, "zeljko bebek") );
    System.out.println( "words.set(7, tutti frutti): " + words.set(7, "tutti frutti") );
    for(int i = 0; i < words.size(); i++) {
      System.out.println( words.get(i) );
    }
    SuperArray worse = new SuperArray();
    System.out.println( "words.isEmpty() -> false: " + words.isEmpty() );
    System.out.println( "worse.isEmpty() -> true: " + worse.isEmpty() );
    System.out.println( "words.toString(): " + words.toString() );
    System.out.println( "words.contains(pencil) -> false: " + words.contains("pencil") );
    System.out.println( "words.contains(tutti frutti) -> true: " + words.contains("tutti frutti") );
    worse.add("there for tomorrow");
    worse.add("search the city");
    worse.add("march to the grave");
    for(int i = 0; i < worse.size(); i++) {
      System.out.println( worse.get(i) );
    }
    System.out.println();
    words.add(5, "slavonske lole");
    worse.add(6, "freeze the atlantic");
    for(int i = 0; i < words.size(); i++) {
      System.out.println( words.get(i) );
    }
    System.out.println();
    for(int i = 0; i < worse.size(); i++) {
      System.out.println( worse.get(i) );
    }
  }

}
