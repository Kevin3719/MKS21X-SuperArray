public class Driver{
	public static void main(String[] args){
		SuperArray a = new SuperArray();
		/*Phase 1 testing*/
		System.out.println("-----Testing Phase 1-----");

		//Testing SuperArray initializing
		System.out.println("\n---Initializing SuperArray---");
		System.out.println("Testing toString(): should return []");
		System.out.println(a);
		System.out.println("\nTesting toStringDebug(): should return [null (x10)]");
		System.out.println(a.toStringDebug());

		//testing size()
		System.out.println("\n\n---Testing size()---");
		System.out.println("Testing size(): should return 0");
		System.out.println(a.size());

		//testing add()
		System.out.println("\n\n---Testing add()---");
		System.out.println("Testing add() while empty: should return true");
		System.out.println(a.add("apple"));
		System.out.println("\nChecking add() and toString(): should return [apple]");
		System.out.println(a);
		a.add("banana");
		System.out.println("\nChecking add() and toString(): should return [apple, banana]");
		System.out.println(a);
		for (int x = 0; x < 9; x++){
			a.add("blank");
		}
		System.out.println("\n---Testing toStringDebug() again: should print [apple, banana, blank (x8)]---");
		System.out.println(a.toStringDebug());
		System.out.println("\n\n---Testing add() while full: should return false---");
		System.out.println(a.add("full"));

		//testing clear()
		System.out.println("\n\n---Testing clear()---");
		System.out.println("Testing clear(): should return []");
		a.clear();
		System.out.println(a);
		System.out.println("\n\n---Testing clear(): Should print [apple, banana, null (x8)]---");
		System.out.println(a.toStringDebug());
		System.out.println("\n---Testing clear() and size(): should return 0---");
		System.out.println(a.size());
		System.out.println("\n---Testing add(\"boop\") after clear(): should return true---");
		System.out.println(a.add("boop"));
		System.out.println("\n---Should print [boop]---");
		System.out.println(a);
		a.clear();

		//testing get()
		System.out.println("\n\n-----Testing get()-----");
		System.out.println("---Testing get() while empty: should return null---");
		System.out.println(a.get(0));
		a.add("burp");
		a.add("ahem");
		a.add("coughdrop");
		System.out.println("\n---Testing get() with indices 0-2 filled: should return values burp, ahem, coughdrop---");
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println("\n---Testing get() for out of bounds: should return null---");
		System.out.println(a.get(-1));
		System.out.println(a.get(10));

		//testing set()
		System.out.println("\n\n-----Testing set()-----");
		System.out.println("---Using SuperArray from testing get()---");
		System.out.println(a);
		System.out.println("\n---Testing set(0, \"blue\"): should return burp---");
		System.out.println(a.set(0, "blue"));
		System.out.println("-Should print [blue, ahem, coughdrop]-");
		System.out.println(a);
		System.out.println("\n---Testing set(1, \"fish\"): should return ahem---");
		System.out.println(a.set(1, "fish"));
		System.out.println("-Should print [blue, fish, coughdrop]-");
		System.out.println(a);
		System.out.println("\n---Testing set(2, \"syrup\"): should return syrup---");
		System.out.println(a.set(2, "syrup"));
		System.out.println("-Should print [blue, fish, syrup]-");
		System.out.println(a);
		System.out.println("\n\n---Testing the error: using indices that are outside of the domain. Both should return null and print an error message---");
		System.out.println(a.set(-2, "I'm not to be seen"));
		System.out.println(a.set(100, "I'm not supposed to be here..."));
		System.out.println("\n---Using cleared SuperArray---");
		a.clear();
		System.out.println("\n---Testing set(2, \"rock\"): should return null and an error message---");
		System.out.println(a.set(2, "rock"));
		System.out.println("-Should print []-");
		System.out.println(a);
    System.out.print("\n\n\n\n\n");

    /**************************************************************************/

    SuperArray SA = new SuperArray();
    System.out.println("Created an empty SuperArray \"SA\" with capacity 10\n\n");

    /**************************************************************************/

    System.out.println("SA's status:                       " + SA.toStringDebug());
    System.out.println("SA is empty (should return true):  " + SA.isEmpty());
    System.out.println("SA's size:                         " + SA.size());

    /**************************************************************************/

    SA.add("Fish");
    SA.add("45");
    SA.add("Fortnite");
    System.out.println("\nAdded \"Fish\", \"45\", \"Fortnite\" to SA");
    System.out.println("SA's current value':               " + SA.toString());
    System.out.println("Value with nulls:                  " + SA.toStringDebug() + "\n\n");
    System.out.println("SA is empty (should return false): " + SA.isEmpty());

    /**************************************************************************/

    SA.set(1, "38");
    System.out.println("Setting SA[1] to \"38\"...");
    System.out.println("\n");
    System.out.println("Checking set value:                " + SA.get(1) + "\n\n");

    /**************************************************************************/

    for (int i = SA.size(); i < 10; i++) {
      SA.add("" + i);
    }
    System.out.println("Filling empty slots of SA with integers...");
    System.out.println("Full status of SA:                 " + SA.toStringDebug() + "\n");
    System.out.println("Adding \"churros\" to SA to test resize...");
    SA.add("churros");
    System.out.println("SA (capacity should have doubled): " + SA.toStringDebug() + "\n\n");

    /**************************************************************************/

    System.out.println("Checking SA for \"Fortnite\":      " + SA.contains("Fortnite"));
    System.out.println("This should return true!");
    System.out.println("Checking SA for \"jedi master\"    " + SA.contains("jedi master"));
    System.out.println("This should return false!\n\n");

    /**************************************************************************/

    SA.add(5, "jedi master");
    System.out.println("Adding \"jedi master\" to index 5...");
    System.out.println("SA status:                         " + SA.toString());
    SA.remove(6);
    System.out.println("\nRemoving the number \"5\" from index 6...");
    System.out.println("SA status:                         " + SA.toString());
    SA.remove("38");
    System.out.println("\nRemoving the number \"38\" from SA...");
    System.out.println("SA status:                         " + SA.toString() + "\n\n");

    /**************************************************************************/
  }
}
