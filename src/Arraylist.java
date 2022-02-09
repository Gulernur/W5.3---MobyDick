import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data/MobyDick.txt");

        Scanner scanner = new Scanner(file);
        Scanner scanner2 = new Scanner(file);
        long time1 = 0;
        String text = "";
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();

        while (scanner.hasNext()) {
             text = scanner.nextLine();

            time1 = System.nanoTime();
            arrayList1.add(text);
        }
        System.out.println(arrayList1.size());

        long time2 = System.nanoTime();
        long deltaTime = time2 - time1;
        System.out.println("It takes " + deltaTime/1000 + " micro seconds to add to the end of the Arraylist");

        while (scanner2.hasNext()) {
            text = scanner2.nextLine();

            time1 = System.nanoTime();
            arrayList2.add(0, text);
        }
        System.out.println(arrayList2.size());

        time2 = System.nanoTime();
        deltaTime = time2 - time1;
        System.out.println("It takes " + deltaTime/1000 + " micro seconds to add to the start of the Arraylist");

    }
}
