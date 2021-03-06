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
    worse.add("there for tomorrow");
    worse.add("search the city");
    worse.add("march to the grave");
    System.out.println( "words.isEmpty() -> false: " + words.isEmpty() );
    System.out.println( "worse.isEmpty() -> true: " + worse.isEmpty() );
    System.out.println( "words.toString(): " + words.toString() );
    System.out.println( "worse.toString(): " + worse.toString() );
    System.out.println( "words.contains(pencil) -> false: " + words.contains("pencil") );
    System.out.println( "words.contains(tutti frutti) -> true: " + words.contains("tutti frutti") );
    for(int i = 0; i < worse.size(); i++) {
      System.out.println( worse.get(i) );
    }
    words.add(5, "slavonske lole");
    worse.add(6, "freeze the atlantic");
    System.out.println();
    System.out.println( "words.add(5, slavonske lole): " );
    for(int i = 0; i < words.size(); i++) {
      System.out.println( words.get(i) );
    }
    System.out.println();
    System.out.println( "worse.add(6, freeze the atlantic): " );
    for(int i = 0; i < worse.size(); i++) {
      System.out.println( worse.get(i) );
    }
    System.out.println();
    System.out.println( "words.remove(2): " + words.remove(2) );
    for(int i = 0; i < words.size(); i++) {
      System.out.println( words.get(i) );
    }
    System.out.println();
    System.out.println( "words.remove(7): " + worse.remove(7) );
    for(int i = 0; i < worse.size(); i++) {
      System.out.println( worse.get(i) );
    }
    System.out.println();
    System.out.println( "words.indexOf(tutti frutti) -> 7: " + words.indexOf("tutti frutti") );
    System.out.println( "words.indexOf(mladen grdovic) -> -1: " + words.indexOf("mladen grdovic") );
    System.out.println( "worse.indexOf(search the city) -> 1: " + worse.indexOf("search the city") );
    System.out.println( "words.indexOf(yellowcard) -> -1: " + words.indexOf("yellowcard") );
    System.out.println();
  }

}
