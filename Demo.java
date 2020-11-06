public class Demo{

  public static void main(String[]args) {
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
    words.add("kani");
    SuperArray words2 = new SuperArray();
    words2.add("kani");   words2.add("uni");     words2.add("ebi");
    System.out.println(findOverlap(words, words2));

    SuperArray arr = new SuperArray();
    arr.add("9");   arr.add("1");   arr.add("2");   arr.add("2");   arr.add("3");   arr.add("4");
    SuperArray arr2 = new SuperArray();
    arr2.add("0");  arr2.add("4");  arr2.add("2");  arr2.add("2");  arr2.add("9");

    System.out.println(findOverlap(arr, arr2));

    SuperArray arr3 = new SuperArray();
    arr3.add("a"); arr3.add("b"); arr3.add("c"); arr3.add("d"); arr3.add("e"); arr3.add("f");
    SuperArray letters = new SuperArray();
    letters.add("0"); letters.add("1"); letters.add("2"); letters.add("3"); letters.add("3");
    System.out.println(zip(arr3, letters));
  }

    public static void removeDuplicates(SuperArray s){
      for (int i = 0; i < s.size()-1; i++) {
        if (i != s.indexOf(s.get(i))) {
          s.remove(i);
          i--;
        }
      }
    }

    public static SuperArray findOverlap(SuperArray a, SuperArray b) {
      int size = 0;
      if (a.size() > b.size()) {
        size = b.size();
      }else{
        size = a.size();
      }
      SuperArray temp = new SuperArray(size);
      for (int i = 0; i < size + 1; i++) {
        if (b.contains(a.get(i))) {
          temp.add(a.get(i));
        }
      }
      removeDuplicates(temp);
      return temp;
    }

    public static SuperArray zip(SuperArray a, SuperArray b){
      SuperArray c = new SuperArray();
      int size = 0;
      boolean aSmaller = false;
      int bigger = 0;
      if (a.size() > b.size()){
        size = b.size();
        bigger = a.size();
      }else{
        size = a.size();
        aSmaller = true;
        bigger = b.size();
      }
      for (int i = 0; i < size; i++) {
        c.add(a.get(i));
        c.add(b.get(i));
      }
      for (int i = size; i < bigger; i++) {
        if (aSmaller){
          c.add(b.get(i));
        }else{
          c.add(a.get(i));
        }
      }
      removeDuplicates(c);
      return c;
    }

}
