import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  This scanner will be the common scanner for getting choice, value, and position
        Scanner scanner = new Scanner(System.in);
        int element;
        int position;

        // Object for inserting
        Insertion inserting = new Insertion();

        // This method will run until the user press "0" for exit
        while(true) {
            System.out.println("**************************************************");
            System.out.println("Array implementation");
            System.out.println("Choose the option to perform array operations");
            System.out.println("Press 1: Insert element at the end");
            System.out.println("Press 2: Insert element at the beginning");
            System.out.println("Press 3: Insert element to the specified position");
            System.out.println("Press 4: Delete the specified position element");
            System.out.println("Press 5: Get index value");
            System.out.println("Press 6: Update the element");
            System.out.println("Press 7: Search the element");
            System.out.println("Press 8: Delete element at the end");
            System.out.println("Press 9: Delete element at the beginning");
            System.out.println("Press 10: Delete all element");
            System.out.println("Press 11: Display all the element in the array");
            System.out.println("Press 0: Exit");
            System.out.println("**************************************************");

            // Get choice from the user
            System.out.println("Press any choice from the menu: ");
            int choice = Integer.parseInt(scanner.next());

            // This switch will perform the operations based on the user choice
            switch(choice) {
                case 1: System.out.println("Enter the element you want to add: ");
                element = Integer.parseInt(scanner.next());
                inserting.addElementAtEnd(element);
                break;
                case 3: System.out.println("Enter the element you want to add: ");
                element = Integer.parseInt(scanner.next());
                System.out.println("Enter the position you want to add the element: ");
                position = Integer.parseInt(scanner.next());
                inserting.insertAtSpecifiedPosition(element, position);
                break;
                case 11: System.out.println("Array elements: ");
                inserting.displayElements();
                break;
                case 0: System.out.println("I think you learned something");
                System.exit(0);
                break;
                default: System.out.println("Please press 1 to 11 for perform some operations (or) press 0 to exit");
                break;
            }
        }
    }
}