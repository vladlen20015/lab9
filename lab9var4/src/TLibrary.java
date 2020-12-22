import java.util.Arrays;
import java.util.ArrayList;

public class TLibrary {
    public static void main(String[] args) {
        PrintedEditions p = new PrintedEditions();

        PrintedEditions[] editions = new PrintedEditions[4];
        editions[0] = p;
        ArrayList<PrintedEditions> arrayListPrintedEditions = new ArrayList<>();

        Book book = new Book("ikuyhuio", 459, "uytif", 87654, false);
        arrayListPrintedEditions.add(book);
        Magazine magazine = new Magazine("ikjdbcl", 48, "khgkovg", 486847, true);
        arrayListPrintedEditions.add(magazine);

        for (PrintedEditions printedEditions : arrayListPrintedEditions) {
            if (printedEditions instanceof Book) {
                System.out.println("Book" + printedEditions);
            }
        }
        for (PrintedEditions printedEditions : arrayListPrintedEditions) {
            if (printedEditions instanceof Magazine) {
                System.out.println("Magazine" + printedEditions);
            }
        }

        arrayListPrintedEditions.remove(p);
        arrayListPrintedEditions.clear();
        arrayListPrintedEditions.isEmpty();
        arrayListPrintedEditions.add(book);
        int[] arr = new int[3];
        Arrays.fill(arr, 1);
    }
}