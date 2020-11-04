public class Tester {
  public static void main(String[] args) {
  SuperArray a = new SuperArray();

  System.out.println(a.size());
  System.out.println(a.add("test"));
  System.out.println(a.add("test2"));
  System.out.println(a.add("test3"));
  System.out.println(a.set(0, "test4"));
  System.out.println(a.get(0));
  for (int i = 0; i < 20; i++) {
    a.add("test");
  }
  System.out.println(a.get(17));
  System.out.println(a.contains("test5"));
  System.out.println(a.contains("test4"));
  System.out.println(a.contains("test 4"));
  System.out.println(a.indexOf("test"));
  System.out.println(a.indexOf("test2"));
  System.out.println(a.indexOf("test5"));
  a.clear();
  System.out.println(a.isEmpty());

  SuperArray words = new SuperArray();
  System.out.println(words.add("kani"));
  System.out.println(words.add("uni"));
  System.out.println(words.add("ebi"));
  for(int i = 0; i < words.size(); i++){
    System.out.println( words.get(i) );
  }
  System.out.println(words);
  words.add(1, "yes");
  System.out.println(words);
  words.remove(0);
  System.out.println(words);
  System.out.println(words.toArray());

  SuperArray b = new SuperArray(0);
  System.out.println(b.isEmpty());


  }

}
