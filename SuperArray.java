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
    size += 10;
    String[] temp = new String[size];
    for(int i = 0; i < data.length; i++) {
      temp[i] = data[i];
    }
    data = temp;
  }

}
