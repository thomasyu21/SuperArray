public class Tester {
  public static void main(String[] args) {
  SuperArray a = new SuperArray();
 
  System.out.println(a.size());
  System.out.println(a.add("test"));

  SuperArray words = new SuperArray();
  System.out.println(words.add("kani"));
  System.out.println(words.add("uni"));
  System.out.println(words.add("ebi"));
  for(int i = 0; i < words.size(); i++){
    System.out.println( words.get(i) );
  }

  }

}
