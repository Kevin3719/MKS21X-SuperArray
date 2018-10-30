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
    boolean output = true;
    if (size >= data.length) {
      output = false;
       this.resize();}
       data[size] = ele;
       size += 1;
       return output;
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
    for (int x = 0; x < size; x += 1 ) {
      output += data[x];
      if (x < size - 1) {
        output += ",";
    }
  }
    for (int x = size; x < data.length; x += 1) {
      if (x == size && x > 0) {
        output += ",";
      }
      output += "null";
      if (x < data.length - 1) {
        output += ",";
    }
  }
    return output + "]" ;
  }

  // 5 Question 5 - get(index);
  // returns the value at index; if there is no value return error.
  public String get(int index) {
    if (index < 0 || index >= size() ) {
        throw new IllegalArgumentException("index cannot be negative or bigger than the size");
    }
    return "" + data[index];
  }

  // 6 Question 6 - set(index, string);
  // modifies the array at a given point;
  public String set(int index, String value) {
    if (index < 0 || index >= size ) {
      throw new IllegalArgumentException("index cannot be negative or bigger than the size");
    }
    data[index] = value;
    return "no error";
  }

  // 7 Question 7 - reszie();
  // doubles the current size;
  private void resize() {
    int dd = data.length * 2 + 1;
    String[] output = new String[dd];
    for (int i = 0; i < data.length; i += 1) {
      output[i] = data[i];
    }
    data = output;
  }

  // 8 Question 8 - contains(x)
  // returns true if item is found; otherwise return false;
  public boolean contains(String target) {
    for (int x = 0; x < size; x += 1 ) {
      if (target.equals(data[x])) {
        return true;
      }
    }
      return false;
  }

  // 9 Question 9 - indexOf ()
  // returns the first instance of a value;
  public int indexOf(String target) {
    for (int x = 0; x < size; x += 1) {
      if (target.equals(data[x])) {
        return x;
      }
    }
      return -1;
  }

  // 9.5 Question 9.5 - lastIndexOf ()
  // returns the last instance of a value;
  public int lastIndexOf(String target) {
    for (int x = size; x >= 0; x -= 1) {
      if (target.equals(data[x])) {
        return x;
      }
    }
    return -1;
  }

  // 10 Question 10 - add with voids and ints and strings;
  // add in a location based on int value, and returns void;
  public void add(int index, String value) {
    if (index < 0 || index > size) {
      throw new IllegalArgumentException("index cannot be negative or bigger than the size");
    }
     else {
       if (size >= data.length) {this.resize();}
    String[] output = new String[data.length];
    for (int x = 0; x < size; x += 1) {
      output[x] = data[x];
    }
    output[index] = value;
    for (int x = index; x < size; x += 1) {
      output[x + 1] = data[x];
    }
    size += 1;
    data = output;
  }
}

  // 11 Question 11 - remove(int)
  // removes a value at a certain index
  public String remove(int index) {
    if (index > size) {
      throw new IllegalArgumentException("index cannot be bigger than the size");
    } else {
    String[] output = new String[data.length];
    for (int x = 0; x < index; x += 1) {
      output[x] = data[x];
    }
    for (int x = index + 1; x < data.length; x += 1) {
      output[x - 1] = data[x];
    }
    String saved = data[index];
    data = output;
    size -= 1;
      return saved;
  }
  }

  // 12 Question 12 - remove(element)
  // testing if index and remove work at the same time; Looks a bit ugly but it is a quick way to write it and it checks if everything works.
  public boolean remove(String element) {
    if (this.indexOf(element) == -1) {
      return false;
    } else {
      return this.remove(this.indexOf(element)).equals(element);
    }
  }

  //  PART 2 ///////
  // Adding Exceptions

  // 2.0 Nondefault SuperArray //
  //non-default SuperArray starts with any number of given values;
    public SuperArray(int n) {
      size = 0;
      data = new String[n];
    }

  // 2.1 Question 2.1 - Index out of Bounds
  // Adding Error Message //
}
