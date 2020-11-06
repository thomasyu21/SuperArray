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
  System.out.println(a.size());
  System.out.println(a);
  System.out.println(a.get(23));
  System.out.println(a.lastIndexOf("test"));
  System.out.println(a.lastIndexOf("test6"));
  System.out.println(a.lastIndexOf(null));
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

  SuperArray c = new SuperArray();
  c.add("test");  c.add("test1");  c.add("test2");  c.add("test3");
  SuperArray d = new SuperArray();
  d.add("test");  d.add("test1");  d.add("test2");
  SuperArray e = new SuperArray();
  e.add("test");  e.add("test1");  e.add("test2");  e.add("test3");  e.add("test4");
  SuperArray f = new SuperArray();
  f.add("test"); f.add("test1");  f.add("test2");   f.add("test3");
  SuperArray g = new SuperArray();
  g.add("test0"); g.add("test1"); g.add("test2"); g.add("test3");

  System.out.println(c.equals(d));
  System.out.println(c.equals(e));
  System.out.println(c.equals(f));
  System.out.println(c.equals(g));
  }

}
