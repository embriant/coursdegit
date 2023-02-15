package org.oxyl;

public class Point {
    private double x;
    private double y;
    public Point (double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point (Point point1){
        this(point1.x, point1.y);
    }
    public Point (){this(0.0,0.0);}

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public boolean equals(Object point_test) {
        return (((Point)point_test).x == this.x) && (((Point)point_test).y == this.y);
    }
    public double calculerDistance(Point point_test){
        double X = point_test.x - this.x;
        double Y = point_test.y - this.y;
        return (Math.sqrt((Math.pow(X,2))+(Math.pow(Y,2))));

    }

}
