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
    if (a == -1) return false;
    else {
      data[a] = element;
      return true;
    }
  }

  public String get(int index) {
    return data[index];
  }

}
