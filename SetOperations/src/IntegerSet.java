/*
 * IntegerSet.java
 */

/**
 *
 * @author Anne Chen
 */
public class IntegerSet {
	
	
	private boolean[] set;
	
    
    /** 
     * Creates a new instance of IntegerSet   
     */
    // TODO: implement the constructor
	public IntegerSet() {
		set = new boolean[101];
	}
    
    /**
     * Return a new IntegerSet containing the union of the two IntegerSet objects
     * passed as arguments
     */
    // TODO: implement the union method
	public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
		IntegerSet result = new IntegerSet();
		for (int i = 0; i < result.set.length; i++) {
			if (set1.set[i] || set2.set[i]) {
				result.set[i] = true;
			}
		}
		return result;
	}
    
    /**
     * Return a new IntegerSet containing the intersection of the two IntegerSet objects
     * passed as arguments
     */
    // TODO: implement the intersection method
	public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
		IntegerSet result = new IntegerSet();
		for (int i = 0; i < result.set.length; i++) {
			if (set1.set[i] && set2.set[i]) {
				result.set[i] = true;
			}
		}
		return result;
	}
    
    /**
     * Inserts an element into the IntegerSet by setting the corresponding
     * value within the set array to true. Returns false if the value was out
     * of range and true otherwise.
     */
    // TODO: implement the insertElement method
	public boolean insertElement(int element) {
		if (element >= 0 && element < set.length) {
			set[element] = true;
			return true;
		}
		return false;
	}
    
    /**
     * Deletes an element from the IntegerSet by setting the corresponding
     * value within the set array to false. Returns false if the value was out
     * of range and true otherwise.
     */
    // TODO: implement the deleteElement method 
	public boolean deleteElement(int element) {
		if (element >= 0 && element < set.length) {
			set[element] = false;
			return true;
		}
		return false;
	}
    
    /**
     * @Override the toString method in the Object class
     * Displays the integers contained by the IntegerSet separated by spaces. 
     * An empty set should be displayed as:
     * { --- }
     * An integer set containing 5 and 10 should be displayed as:
     * { 5 10 }
     */
    // TODO: implement the toString method  
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		boolean isEmpty = true;
		sb.append("{ ");
		for (int i = 0; i < set.length; i++) {
			if (set[i]) {
				if (!isEmpty) {
					sb.append(" ");
				}
				sb.append(i);
				isEmpty = false;
			}
		}
		if (isEmpty) {
			sb.append("---");
		}
		sb.append(" }");
		return sb.toString();
	}
	
	
    
    /**
     * Returns true iff the current IntegerSet contains the same integers as
     * the IntegerSet supplied as an argument
     */
	// TODO: implement the isEqualTo method   
	public boolean isEqualTo(IntegerSet otherSet) {
		for (int i = 0; i < set.length; i++) {
			if (this.set[i] != otherSet.set[i]) {
				return false;
			}
		}
		return true;
	}
}
