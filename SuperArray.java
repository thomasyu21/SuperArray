public class SuperArray {

  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    if (size >= data.length) {
      resize();
    }
    data[size] = element;
    size++;
    return true;
  }

  public String get(int index) {
    return data[index];
  }

  public String set(int index, String element) {
    String temp = data[index];
    data[index] = element;
    return temp;
  }

  private void resize() {
    String[] temp = new String[(size*2)+1];
    for (int i = 0; i < size; i++) {
      temp[i] = data[i];
    }
    data = temp;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void clear() {
    data = new String[10];
    size = 0;
  }

  public String toString() {
    String arr = "[" + data[0];
    for (int i = 1; i < size; i++) {
      arr+=", " + data[i];
    }
    arr+="]";
    return arr;
  }

  public boolean contains(String s) {
    for (int i = 0; i < size; i++) {
      if (s.equals(data[i])) {
        return true;
      }
    }
    return false;
  }

}
