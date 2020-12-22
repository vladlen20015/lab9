public class PrintedEditions {
    private String publhouse;
    private int maxPage;

    public void setPublhouse(String publishhouse) {
        publhouse = publishhouse;
    }

    public void setMaxPage(int page) {
        maxPage = page;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public String getPublhouse() {
        return publhouse;
    }

    public PrintedEditions() {
        publhouse = "Без названия";
        maxPage = 0;
    }

    public PrintedEditions(String publishhouse, int page) {
        publhouse = publishhouse;
        maxPage = page;
    }
}


