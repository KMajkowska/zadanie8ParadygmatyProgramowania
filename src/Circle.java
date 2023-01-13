import java.util.*;
public class Circle extends Shape{

    private int radius;

    public Circle()
    {
        radius=0;
    }

    public Circle(int radius, Point position, Boolean filled)
    {
        super(filled, position);
        this.radius=radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public Point[] getBoundingBox() {
       Point[] arr = new Point[4];
       arr[0] = new Point(this.getPosition().getX(),this.getPosition().getY());
       arr[1] = new Point(this.getPosition().getX(),this.getPosition().getY()-(radius*2));
       arr[2] = new Point(this.getPosition().getX()+(radius*2),this.getPosition().getY()-(radius*2));
       arr[3] = new Point(this.getPosition().getX()+(radius*2),this.getPosition().getY());
        return arr;
    }

    public void draw()
    {
        if(!getFilled())
            getGraphics().drawOval(getPosition().getX()+radius,getPosition().getY()-radius,radius*2,radius*2);
        else
            getGraphics().fillOval(getPosition().getX(),getPosition().getY()+(radius/2),radius*2,radius*2);
    }


}
