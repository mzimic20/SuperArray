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
    
  }

}
