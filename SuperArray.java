public class SuperArray {

  private String[] data;
  private int size;

  public SuperArray() {
    size = 10;
    data = new String[size];
  }

  public int size() {
    int counter = 0;
    for(int i = 0; i < data.length; i++) {
      if (data[i] != null) counter++;
    }
    return counter;
  }

  public boolean add(String element) {
    int a = -1;
    for(int i = 0; i < data.length && a == -1; i++) {
      if (data[i] == null) a = i;
    }
    if (a == -1) {
      this.resize();
      for(int i = 0; i < data.length; i++) {
        if (data[i] == null) a = i;
      }
      data[a] = element;
      return true;
    }
    else {
      data[a] = element;
      return true;
    }
  }

  public String get(int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("index is " + index + ", out of bounds [0, " + (size() - 1) + "]");
    }
    return data[index];
  }

  public String set(int index, String element) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("index is " + index + ", out of bounds [0, " + (size() - 1) + "]");
    }
    String ans = data[index];
    data[index] = element;
    return ans;
  }

  private void resize() {
    size = size * 2;
    String[] temp = new String[size];
    for(int i = 0; i < data.length; i++) {
      temp[i] = data[i];
    }
    data = temp;
  }

  public boolean isEmpty() {
    boolean empty = true;
    for(int i = 0; i < data.length && empty; i++) {
      if (data[i] != null) empty = false;
    }
    return empty;
  }

  public void clear() {
    size = 0;
    data = new String[size];
  }

  public String toString() {
    String ans = "[";
    for(int i = 0; i < data.length - 1; i++) {
      if (data[i] != null) {
        ans += data[i] + ", ";
      }
    }
    ans = ans.substring(0, ans.length() - 2);
    if (data[data.length - 1] == null) return ans += "]";
    else return ans += ", " + data[data.length - 1] + "]";
  }

  public boolean contains(String s) {
    for(int i = 0; i < data.length; i++) {
      if (data[i] == s) return true;
    }
    return false;
  }

  public SuperArray(int initialCapacity) {
    if (initialCapacity < 0) {
      throw new IllegalArgumentException("initialCapacity is " + initialCapacity + ", cannot be negative!");
    }
    size = initialCapacity;
    data = new String[size];
  }

  public void add(int index, String element) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("index is " + index + ", out of bounds [0, " + (size - 1) + "]");
    }
    size++;
    String[] temp = new String[size];
    for(int i = 0; i < index; i++) {
      temp[i] = data[i];
    }
    temp[index] = element;
    for(int i = index; i < data.length; i++) {
      temp[i + 1] = data[i];
    }
    data = temp;
  }

  public String remove(int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("index is " + index + ", out of bounds [0, " + (size() - 1) + "]");
    }
    size--;
    String ans = data[index];
    String[] temp = new String[size];
    for(int i = 0; i < index; i++) {
      temp[i] = data[i];
    }
    for(int i = index + 1; i < data.length; i++) {
      temp[i - 1] = data[i];
    }
    data = temp;
    return ans;
  }

  public int indexOf(String s) {
    for(int i = 0; i < data.length; i++) {
      if (data[i] == s) return i;
    }
    return -1;
  }

  public String[] toArray() {
    return data;
  }

  public int lastIndexOf(String s) {
    for(int i = data.length - 1; i >= 0; i--) {
      if (data[i] == s) return i;
    }
    return -1;
  }

  public boolean equals(SuperArray other) {
    String a = this.toString();
    String b = other.toString();
    return a.equals(b);
  }

}
