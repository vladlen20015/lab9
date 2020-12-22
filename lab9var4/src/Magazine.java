import java.util.Scanner;
public class Magazine extends PrintedEditions{
    private String stylee;
    private int numberr;
    private Boolean popular;
    public Magazine(){
        super();
        stylee="";
        numberr=0;
        popular=false;
    }
    public Magazine(String publishhouse, int page, String name, int n, Boolean f){
        super(publishhouse,page);
        stylee=name;
        numberr=n;
        popular=f;
    }
    public void setStylee(String name){
        stylee=name;
    }
    public String getStylee(){
        return stylee;
    }
    public void setNumberr(int n){
        numberr=n;
    }
    public int getNumberr(){
        return numberr;
    }
    public void setPopular(Boolean b){
        popular=b;
    }
    public Boolean isPopular(){
        return popular;
    }
    public void setAllInfo(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите издательство журнала: ");
        String nazv=in.next(); //метод next() позволяет вводить строки, но без пробелов
        setPublhouse(nazv);
        System.out.print("Введите максимальное количество страниц: ");
        int s=in.nextInt();
        setMaxPage(s);
        System.out.print("Введите стиль журнала: ");
        stylee=in.next();
        System.out.print("Введите номер журнала: ");
        numberr=in.nextInt();
        System.out.print("Введите признак популярности журнала (true/false): ");
        popular=in.nextBoolean();
        System.out.println();
    }
    public String toString(){
        return "\n\tЖурнал"+"\n\t"+"Издательство: "+getPublhouse()+"\n\t"+"Максимальное количество страниц: "
                +getMaxPage()+ "\n\t"+"Стиль: "+stylee+"\n\t"+"Номер: "+numberr+"\n\t"+"Популярность: "
                +popular+"\n";
    }
}

