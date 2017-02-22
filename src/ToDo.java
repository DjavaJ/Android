import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dangelojoyce on 2/13/17.
 */
public class ToDo {

    public static void main(String[] args) {

        ArrayList<ToDoItem> items = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create to-do item");
            System.out.println("2. Toggle to-do item");
            System.out.println("3. List to-do items");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Enter your to-do item: ");
                String text = scanner.nextLine();

                ToDoItem item = new ToDoItem(text, false);

                items.add(item); //look up syntax

            } else if (option.equals("2")) {
                System.out.println("Enter the number the number of the item you want to toggle");
                //toggle is determining whats works and doesn't boolean
                int itemNum = Integer.valueOf(scanner.nextLine());

                ToDoItem item = items.get(itemNum - 1);

                item.isDone = !item.isDone;
            } else if (option.equals("3")) {
                int i = 1;

                for (ToDoItem item : items) {     //item is a particular object that the for loop is operating on
                    String checkbox = "[ ]";     //items is the ArrayList of items //Learn up "for" syntax
                    if (item.isDone) {
                        checkbox = "[x] ";
                    }
                    System.out.println(checkbox + i + ". " + item.text);
                    i++;
                }
            } else {
                System.out.println("Invalid Option");
            }

        }
    }
}


