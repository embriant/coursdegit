package org.oxyl;

public class Triangle {
    private static int NOMBRE_DE_TRIANGLES = 0;
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;


    //    public Rectangle (){
//        this(0,0,1,2,0);
//    }
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        NOMBRE_DE_TRIANGLES++;
    }
    public Triangle(){
        this(0.0, 0.0, 0.0, 1.0, 0.5, 0.5);
    }
    public Triangle(Triangle triangle1){
        this(triangle1.x1, triangle1.y1, triangle1.x2, triangle1.y2, triangle1.x3, triangle1.y3);
    }
    public void deplacer(double distanceX, double distanceY){
        this.x1 = x1 + distanceX;
        this.y1 = y1 + distanceY;
        this.x2 = x2 + distanceX;
        this.y2 = y2 + distanceY;
        this.x3 = x3 + distanceX;
        this.y3 = y3 + distanceY;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", x3=" + x3 +
                ", y3=" + y3 +
                '}';
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public double getX3() {
        return x3;
    }

    public double getY3() {
        return y3;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    public boolean isEquilateral() {
       double distance1 = Math.round(Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)));
       double distance2 = Math.round(Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2)));
       double distance3 = Math.round(Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2)));
        return ((distance1 == distance2) && (distance2 == distance3));
        }


    public void tourner(double theta){
        double barycentreX = (x1+x2+x3)/3;
        double barycentreY = (y1+y2+y3)/3;
        double X1 = Math.round((Math.cos(theta*Math.PI/180)*(x1-barycentreX) - Math.sin(theta*Math.PI/180)*(y1-barycentreY)+barycentreX)*100)/100.0;
        double Y1 = Math.round((Math.sin(theta*Math.PI/180)*(x1-barycentreX) + Math.cos(theta*Math.PI/180)*(y1-barycentreY)+barycentreY)*100)/100.0;
        double X2 = Math.round((Math.cos(theta*Math.PI/180)*(x2-barycentreX) - Math.sin(theta*Math.PI/180)*(y2-barycentreY)+barycentreX)*100)/100.0;
        double Y2 = Math.round((Math.sin(theta*Math.PI/180)*(x2-barycentreX) + Math.cos(theta*Math.PI/180)*(y2-barycentreY)+barycentreY)*100)/100.0;
        double X3 = Math.round((Math.cos(theta*Math.PI/180)*(x3-barycentreX) - Math.sin(theta*Math.PI/180)*(y3-barycentreY)+barycentreX)*100)/100.0;
        double Y3 = Math.round((Math.sin(theta*Math.PI/180)*(x3-barycentreX) + Math.cos(theta*Math.PI/180)*(y3-barycentreY)+barycentreY)*100)/100.0;
        this.x1 = X1;
        this.y1 = Y1;
        this.x2 = X2;
        this.y2 = Y2;
        this.x3 = X3;
        this.y3 = Y3;
    }

}
