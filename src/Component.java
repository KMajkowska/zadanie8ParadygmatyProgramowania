import java.awt.*;

public interface Component {

    public Graphics getGraphics();

    public void setGraphics(Graphics graphics);


    public Point getPosition();

    public void setPosition(Point pos);

    public void translate(Point p);

    public abstract int mostHigh();
    public abstract int mostLow();
    public abstract int mostRight();
    public abstract int mostLeft();

    public abstract Point[] getBoundingBox();

    public abstract void draw();
}
