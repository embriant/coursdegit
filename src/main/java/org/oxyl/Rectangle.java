package org.oxyl;

public class Rectangle {
    private static int NOMBRE_DE_RECTANGLES = 0;
    private double centreX;
    private double centreY;
    private double longueur;
    private double largeur;
    private double angle;

    //    public Rectangle (){
//        this(0,0,1,2,0);
//    }
    public Rectangle(double centreX, double centreY, double longueur, double largeur, double angle){
        this.centreX = centreX;
        this.centreY = centreY;
        setLongueur(longueur);
        setLargeur(largeur);
        this.angle = angle;
        NOMBRE_DE_RECTANGLES++;
    }
    public Rectangle(){
        this(0.0,0.0,1.0,1.0,0);
    }
    public Rectangle(Rectangle rectangle1){
        this(rectangle1.centreX, rectangle1.centreY, rectangle1.longueur, rectangle1.largeur, rectangle1.angle);
    }
    public void deplacer(double distanceX, double distanceY){
        this.centreX = this.centreX + distanceX;
        this.centreY = this.centreY + distanceY;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "centreX=" + centreX +
                ", centreY=" + centreY +
                ", longueur=" + longueur +
                ", largeur=" + largeur +
                ", angle=" + angle +
                '}';
    }

    public double getCentreX() {
        return centreX;
    }

    public double getCentreY() {
        return centreY;
    }

    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getAngle() {
        return angle;
    }

    public void setCentreX(double centreX) {
        this.centreX = centreX;
    }

    public void setCentreY(double centreY) {
        this.centreY = centreY;
    }

    public void setLongueur(double longueur) {
        if (longueur > 0) {
            this.longueur = longueur;
        } else this.longueur = 0;
    }

    public void setLargeur(double largeur) {
        if (largeur > 0) {
            this.largeur = largeur;
        } else this.largeur = 0;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public boolean isCarre() {
        return(longueur==largeur);
    }
    public void redimensionner(double f){
        if (f>0) {
            this.longueur = f * longueur;
            this.largeur = f * largeur;
        }else{
            this.longueur = 0;
            this.largeur = 0;
        }
        }

    public void tourner(double theta){
        setAngle(getAngle()+theta);
    }
}
