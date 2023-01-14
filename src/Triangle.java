import java.util.ArrayList;

public class Triangle extends Shape{
    private Point p1,p2,p3;

    public Triangle()
    {
        p1=null;
        p2=null;
        p3=null;
    }

    public Triangle(Point p1, Point p2, Point p3, Boolean filled)
    {
        super();
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.setFilled(filled);
            this.setPosition(getBoundingBox()[0]);
    }

    public Point getP1()
    {
        return p1;
    }

    public Point getP2()
    {
        return p2;
    }

    public Point getP3()
    {
        return p3;
    }

    public int mostHigh()
    {
        return Math.min(Math.min(p1.getY(),p2.getY()),p3.getY());
    }

    public int mostLow()
    {
        return Math.max(Math.max(p1.getY(),p2.getY()),p3.getY());
    }

    public int mostRight()
    {
        return Math.max(Math.max(p1.getX(),p2.getX()),p3.getX());
    }

    public int mostLeft()
    {
        return Math.min(Math.min(p1.getX(),p2.getX()),p3.getX());
    }

    public Point[] getBoundingBox() {
        Point [] arr = new Point[4];
        arr[0] = new Point(mostLeft(),mostHigh());
        arr[1] = new Point(mostLeft(),mostLow());
        arr[2] = new Point(mostRight(),mostLow());
        arr[3] = new Point(mostRight(),mostHigh());
        return arr;
    }

    public void draw()
    {
        if(!getFilled())
            getGraphics().drawPolygon(new int[] {p1.getX(), p2.getX(), p3.getX()}, new int[] {p1.getY(), p2.getY(), p3.getY()}, 3);
        else
            getGraphics().fillPolygon(new int[] {p1.getX(), p2.getX(), p3.getX()}, new int[] {p1.getY(), p2.getY(), p3.getY()}, 3);
    }

    public void translate(Point p)
    {
        super.translate(p);
        p1.translate(p);
        p2.translate(p);
        p3.translate(p);
    }
}