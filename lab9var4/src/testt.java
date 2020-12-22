import java.util.Scanner;
public class testt {
    public static void main(String[] args) {
        PrintedEditions myPrintedEditions1=new PrintedEditions();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        String nazv=in.next();
        myPrintedEditions1.setPublhouse(nazv);
        System.out.print("Введите максимальное количество страниц: ");
        int s=in.nextInt();
        myPrintedEditions1.setMaxPage(s);
        System.out.println("Книга: "+myPrintedEditions1.getPublhouse()+" "+myPrintedEditions1.getMaxPage());
        System.out.println();
        Book myBook1=new Book("lolollo", 200,"lalalaa",256,false);
        Book myBook2=new Book();
        System.out.print("Введите издательство книги: ");
        nazv=in.next();
        myBook2.setPublhouse(nazv);
        System.out.print("Введите максимальное количество страниц: ");
        s=in.nextInt();
        myBook2.setMaxPage(s);
        System.out.print("Введите стиль книги: ");
        nazv=in.next();
        myBook2.setStyle(nazv);
        System.out.print("Введите серийный номер: ");
        s=in.nextInt();
        myBook2.setNumber(s);
        System.out.print("Введите признак бестселлера книги (true/false): ");
        Boolean f=in.nextBoolean();
        System.out.println();
        System.out.println("Первая книга: "+myBook1.toString());
        System.out.println("Вторая книга: "+myBook2.toString());
        Magazine myMagazine=new Magazine();
        myMagazine.setAllInfo();
        System.out.println(myMagazine.toString());
    }
}
