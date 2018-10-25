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

  // 3 Question 3 - add;
  // returns true if the thing is added
  public boolean add(String ele) {
    if (size < data.length) {
      data[size] = ele;
      size += 1;
      return true;
    }
    //resize required here;
    return false;
  }

  // 4 Question 4 - toString;
  // prints it so it looks like an array;
  public String toString() {
    String output = "[";
    for (int x = 0; x < size; x += 1 ) {
      output += data[x];
      if (x < size - 1) {
        output += ",";
      }
    }
    output += "]";
    return output;
  }

  // 4.5 Question 4.5 - toString Debug;
  // returns string but with the nulls at the end
  public String toStringDebug() {
    String output = "[";
    for (int x = 0; x < size - 1; x += 1 ) {
      output += data[x];
      if (x < size - 1) {
        output += ",";
    }
  }
    for (int x = size; x < data.length; x += 1) {
      output += "null";
      if (x < data.length - 1) {
        output += ",";
    }
  }
    return output + "]";
  }

  // 5 Question 5 - get(index);
  // returns the value at index; if there is no value return error.
  public String get(int index) {
    if (index < 0 || index >= size() ) {
      return "null" + " ---- ERROR ----";
    }
    return "" + data[index];
  }

  // 6 Question 6 - set(index, string);
  // modifies the array at a given point;
  public String set(int index, String value) {
    if (index < 0 || index >= size ) {
      return "null" + "---- ERROR ----";
    }
    data[index] = value;
    return "no error";
  }


}
