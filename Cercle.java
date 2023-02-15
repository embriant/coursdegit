public class Cercle (){
    private static int NOMBRE_DE_CERCLES = 0;
    private double centreX;
    private double centreY;
    private double rayon;
//    public Cercle (){
//        this(0,0,1);
//    }
    public Cercle(double centreX, double centreY, double rayon){
        this.centreX = centreX;
        this.centreY = centreY;
        this.rayon = rayon;
        NOMBRE_DE_CERCLES++;
    }
    private void Deplacer (double distanceX; double distanceY){
        this.centreX = centreX + distanceX;
        this.centreY = centreY + distanceY;
    }
    @Override
    public String toString() {
        return "Cercle{" +
                "centreX=" + centreX +
                ", centreY=" + centreY +
                ", rayon=" + rayon +
                '}';
    }
    //testttttt git commit 
    public double getCentreX() {
        return centreX;
    }
    public double getCentreY() {
        return centreY;
    }
    public double getRayon() {
        return rayon;
    }
    public void setCentreX(double centreX) {
        this.centreX = centreX;
    }
    public void setCentreY(double centreY) {
        this.centreY = centreY;
    }
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    public static int getNombreDeCercles(){
        return NOMBRE_DE_CERCLES;
    }
    public boolean isGrand(){
        rayon > 100 ?
    }
    public void redimensionner(double f){
        this.rayon = f*rayon;
    }



}
