import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data/MobyDick.txt");

        Scanner scanner = new Scanner(file);
        Scanner scanner2 = new Scanner(file);
        long time1 = 0;
        String text = "";
        java.util.LinkedList<String> linkedList1 = new java.util.LinkedList<>();
        java.util.LinkedList<String> linkedList2 = new java.util.LinkedList<>();

        while (scanner.hasNext()) {
            text = scanner.nextLine();

            time1 = System.nanoTime();
            linkedList1.add(text);
        }
        System.out.println(linkedList1.size());

        long time2 = System.nanoTime();
        long deltaTime = time2 - time1;
        System.out.println("It takes " + deltaTime/1000 + " micro seconds to add to the end of the Linked list");

        while (scanner2.hasNext()) {
            text = scanner2.nextLine();

            time1 = System.nanoTime();
            linkedList2.add(0, text);
        }
        System.out.println(linkedList2.size());

        time2 = System.nanoTime();
        deltaTime = time2 - time1;
        System.out.println("It takes " + deltaTime/1000 + " micro seconds to add to the start of the Linked list");

    }
}
