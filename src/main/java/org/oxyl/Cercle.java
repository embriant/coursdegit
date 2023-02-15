package org.oxyl;

public class Cercle{
    private static int NOMBRE_DE_CERCLES = 0;
    private Point centre;;
    private double rayon;
    //    public Cercle (){
//        this(0,0,1);
//    }
    public Cercle(Point centre, double rayon){
        this.centre = centre;
        setRayon(rayon);
        NOMBRE_DE_CERCLES++;
    }
    public Cercle(Cercle cercle1){
        this(cercle1.centre,cercle1.rayon);
    }
    public Cercle(){
        this(0.0,0.0,1.0);
    }
    public void deplacer(double distanceX, double distanceY){
        this.centre.setX(this.centre.getX() + distanceX);
        this.centre.y = this.centre.y + distanceY;
    }
    @Override
    public String toString() {
        return "Cercle{" +
                "centreX=" + centreX +
                ", centreY=" + centreY +
                ", rayon=" + rayon +
                '}';
    }
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
        if (rayon > 0) {
            this.rayon = rayon;
        } else this.rayon = 0;
    }
    public static int getNombreDeCercles(){
        return NOMBRE_DE_CERCLES;
    }

    public boolean isGrand() {
        return(rayon > 100);
    }
    public void redimensionner(double f){
        setRayon(f*rayon);
    }
    public void tourner(double theta){
    }
}
