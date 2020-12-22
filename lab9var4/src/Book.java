public class Book extends PrintedEditions {
    private String style;
    private int number;
    private Boolean bestseller;
    public Book(){
        super();
        style="";
        number=4;
        bestseller=false;
}

    public Book(String publishhouse, int page, String name, int n, Boolean f){
        super(publishhouse,page);
        style=name;
        number=n;
        bestseller=f;
    }
    public void setStyle(String name){
        style=name;
    }
    public String getStyle(){
        return style;
    }
    public void setNumber(int n){
        number=n;
    }
    public int getNumber(){ return number; }
    public void setBestseller(Boolean b){
        bestseller=b;
    }
    public Boolean isBestseller(){
        return bestseller;
    }
    public String toString(){
        return getPublhouse()+" "+getMaxPage()+" "+style+" "+number+" "+bestseller;
    }
}

