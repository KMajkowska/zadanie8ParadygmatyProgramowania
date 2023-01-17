import java.awt.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Scene s1 = new Scene(600,600);
       Circle c = new Circle(100, new Point(100, 100), true);
       RenderBoundingBox circle = new RenderBoundingBox(c);
       Triangle t = new Triangle(new Point(400,200), new Point(500,200), new Point(450,300),true);
       RenderBoundingBox triangle = new RenderBoundingBox(t);
       Segment s = new Segment(new Point(500, 300), new Point(200, 400));
       RenderBoundingBox segment = new RenderBoundingBox((s));
       s1.addItem(circle);
       s1.addItem(triangle);
       s1.addItem(segment);

       for(int i=0; i<s1.getItems().size(); i++)
       {
           System.out.println(i+1);
       }

       int answer;
       answer = scan.nextInt();
       s1.getItems().get(answer-1).drawBoundingBox();


    }

}