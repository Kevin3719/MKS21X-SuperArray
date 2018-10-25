public class SuperArray{

  // the length of the array inside.
  private int size;

  // the data inside the SuperArray.
  private String[] data;

  // 0 Question 0 - constuctors
  // starts with 10 null by default.
  public SuperArray() {
    size = 0;
    data = new String[10];
  }

  //non-default SuperArray starts with any number of given values;
  public SuperArray(int n) {
    size = 0;
    data = new String[n];
  }

  // 1 Question 1 - clear
  // sets size to 0; returns void
  public void clear() {
    size = 0;
  }

  // 2 Question 2 - size
  // return the size; returns int
  public int size() {
    return size;
  }

  // 2.5 Question 2.5 - isEmpty;
  //returns true if the value of size is 0
  public boolean isEmpty() {
    return size == 0;
  }


}
