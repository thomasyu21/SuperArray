public class Tester {
  public static void main(String[] args) {
  SuperArray a = new SuperArray();

  System.out.println(a.size());
  System.out.println(a.add("test"));
  System.out.println(a.add("test2"));
  System.out.println(a.add("test3"));
  System.out.println(a.set(0, "test4"));
  System.out.println(a.get(0));

  SuperArray words = new SuperArray();
  System.out.println(words.add("kani"));
  System.out.println(words.add("uni"));
  System.out.println(words.add("ebi"));
  for(int i = 0; i < words.size(); i++){
    System.out.println( words.get(i) );
  }

  }

}
