
public class BasicFields {

    // Fields
    public static int initialCapacity = 5;
    public int currentCapacity;
    public int currentArraySize;
    public int[] arrayElement;

    // Constructor
    public BasicFields() {
        currentArraySize = 0;
        arrayElement = new int[initialCapacity];
        currentCapacity = initialCapacity;
    }

    //  Capacity increment method
    public void increaseCapacity() {
        currentCapacity *= 2; // Increase the capacity in to 2
        arrayElement = java.util.Arrays.copyOf(arrayElement, currentCapacity); // Store the copied array element to the existing array element.
    }

    // Capacity decrement method
}
