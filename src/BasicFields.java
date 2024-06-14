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
        currentCapacity *= 2;
        System.out.println(currentCapacity);
        java.util.Arrays.copyOf(arrayElement, currentCapacity);
    }

    // Capacity decrement method
}
