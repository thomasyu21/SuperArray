public class SuperArray {

  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity) {
    if (initialCapacity < 0) {
      throw new IllegalArgumentException("Specified initial capacity "+initialCapacity+" is negative.");
    }
    data = new String[initialCapacity];
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
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("The index "+index+" is out of range. The range is 0 to "+(size-1)+" inclusive.");
    }
    return data[index];
  }

  public String set(int index, String element) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("The index "+index+" is out of range. The range is 0 to "+(size-1)+" inclusive.");
    }
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
    String arr = "[";
    for (int i = 0; i < size-1; i++) {
      arr+= data[i] + ", ";
    }
    if (size >= 1) {
      arr+= data[size-1] + "]";
    }else{
      arr+= "]";
    }
    return arr;
  }

  public boolean contains(String s) {
    if (s == null && size < data.length){
      return false;
    }
    for (int i = 0; i < size; i++) {
      if (s.equals(data[i])) {
        return true;
      }
    }
    return false;
  }

  public void add (int index, String element) {
    if (index < 0 || index > size){
      throw new IndexOutOfBoundsException("The index "+index+" is out of range. The range is 0 to "+size+" inclusive.");
    }
    if (size >= data.length) {
      resize();
    }
    for (int i = size; i > index; i--) {
      data[i] = data[i-1];
    }
    data[index] = element;
    size++;
  }

  public String remove(int index) {
    if (index < 0 || index >= size){
      throw new IndexOutOfBoundsException("The index "+index+" is out of range. The range is 0 to "+(size-1)+" inclusive.");
    }
    String temp = data[index];
    for (int i = index; i < size; i++) {
      data[i] = data[i+1];
    }
    size--;
    return temp;
  }

  public int indexOf(String s) {
    if (s == null){
    }else{
      for (int i = 0; i < size; i++) {
        if (s.equals(data[i])) {
          return i;
        }
      }
    }
    return -1;
  }

  public String[] toArray() {
    String[] temp = new String[size];
    for (int i = 0; i < size; i++) {
      temp[i] = data[i];
    }
    return temp;
  }

  public int lastIndexOf(String value) {
    if (value == null) {
      return -1;
    }
    for (int i = size-1; i >= 0; i--) {
      if (data[i].equals(value)) {
        return i;
      }
    }
    return -1;
  }

  public boolean equals(SuperArray other) {
    int smallerSize = 0;
    if (this.size > other.size){
      smallerSize = other.size;
    }else{
      smallerSize = this.size;
    }
    for (int i = 0; i < smallerSize; i++) {
      if (!this.data[i].equals(other.data[i])) {
        return false;
      }
    }
    return true;
  }

}
