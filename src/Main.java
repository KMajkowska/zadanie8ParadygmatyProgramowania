import java.awt.*;

public class Main {

    public static void main(String[] args)
    {
        Scene s1 = new Scene(600,600);
        //Graphics g1 = s1.getGraphics();
       Circle c = new Circle(100, new Point(100, 100), true);
       RenderBoundingBox circle = new RenderBoundingBox(c);
        Triangle t1 = new Triangle(new Point(400,200), new Point(500,200), new Point(450,300),true);
       RenderBoundingBox triangle = new RenderBoundingBox(t1);
       s1.addItem(t1);
       triangle.drawBoundingBox();
    }

}