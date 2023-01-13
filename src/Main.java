import java.awt.*;

public class Main {

    public static void main(String[] args)
    {
        Scene s1 = new Scene(600,600);
        //Graphics g1 = s1.getGraphics();
        Heart h = new Heart(100, 200, new Point(100, 100), true, 100, 100);
        s1.addItem(h);
    }

}