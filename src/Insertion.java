
class Insertion extends BasicFields {

    // Method for add element at the end
    public void addElementAtEnd(int element) {
        if (currentArraySize == currentCapacity) {
            increaseCapacity();
            System.out.println("Capacity increased now you can add more elements");
        }
        arrayElement[currentArraySize++] = element;
        System.out.println(element + " is add to the end of the array");
    }

    // Inserting specified position
    public void insertAtSpecifiedPosition(int element, int position) {
        if (currentArraySize == currentCapacity) {
            increaseCapacity();
            System.out.println("Capacity increased now you can add more elements");
        }
        for (int i = currentArraySize - 1; i >= position; i++) {
            arrayElement[i + 1] = arrayElement[i];
            currentArraySize++;
        }
        arrayElement[position] = element;
        System.out.println("Element " + element + " is successfully added to the " + position + "th position");
    }

    // Display the elements
    public void displayElements() {
        for (int i = 0; i < currentArraySize; i++) {
            System.out.println(arrayElement[i] + " ");
        }
    }
}
