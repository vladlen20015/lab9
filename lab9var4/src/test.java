import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        PrintedEditions myPe1=new PrintedEditions();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите фирму: ");
        String nazv=in.next();
        myPe1.setPublhouse(nazv);
        System.out.print("Введите максимальное количество страниц: ");
        int s=in.nextInt();
        myPe1.setMaxPage(s);
        System.out.println(myPe1.getPublhouse()+" "+myPe1.getMaxPage());
    }
}
