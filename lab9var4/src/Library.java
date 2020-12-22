import java.util.ArrayList;
public class Library {
    private ArrayList<PrintedEditions> masBook=new ArrayList<PrintedEditions>();
    public void addEdition(PrintedEditions m){//метод для добавления машины в гараж
        masBook.add(m);
    }
    public Library (){
    }

    public Boolean findEdition(PrintedEditions m){ //для выяснения – есть ли машина m в гараже
        return masBook.contains(m);
    }
    public Library(ArrayList< PrintedEditions> n){
        masBook=n;
    }
    public void printLibrary() { //для вывода на экран списка машин в гараже
        System.out.println("В библиотеке: ");
        for (PrintedEditions a:masBook){ //
            System.out.println("\t"+a.toString());
        }
    }
}
