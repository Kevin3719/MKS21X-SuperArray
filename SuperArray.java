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



}
