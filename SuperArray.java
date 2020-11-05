public class SuperArray {

  private String[] data;
  private int size;

  public SuperArray() {
    size = 10;
    data = new String[size];
  }

  public int size() {
    return size;
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
    return data[index];
  }

  public String set(int index, String element) {
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
    for(int i = 0; i < data.length; i++) {
      if (data[i] != null) {
        ans += data[i] + ", ";
      }
    }
    ans = ans.substring(0, ans.length() - 2);
    if (data[data.length - 1] == null) return ans += "]";
    else return ans += data[data.length - 1] + "]";
  }

  public boolean contains(String s) {
    for(int i = 0; i < data.length; i++) {
      if (data[i] == s) return true;
    }
    return false;
  }

  public SuperArray(int initialCapacity) {
    size = initialCapacity;
    data = new String[size];
  }

  public void add(int index, String element) {
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

}
