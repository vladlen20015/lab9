public class Auto {
    private String firm;
    private int maxSpeed;
    private int gosNom;
    public void setFirm(String firma){
        firm=firma;
    }

    public void setMaxSpeed(int speed){
        maxSpeed=speed;
    }
    public void setGosNom(int nom){
        gosNom=nom;
    }
    public int getGosNom(){
        return gosNom;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public String getFirm(){
        return firm;
    }
    public Auto(){
        firm="Без названия";
        maxSpeed=0;
        gosNom=0;
    }
    public Auto(String firma, int speed, int nom){
        firm=firma;
        maxSpeed=speed;
        gosNom=nom;
    }
}
