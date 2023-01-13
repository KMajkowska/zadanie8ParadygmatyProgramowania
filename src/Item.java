import java.awt.*;
import java.util.ArrayList;

public abstract class Item {

    private Point pos;

    private Graphics graphics;

    public Item(Point pos)
    {
        this.pos=pos;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public Item()
    {
        this.pos=null;
    }

    public Point getPosition()
    {
        return pos;
    }

    public void setPosition(Point pos) {
        this.pos = pos;
    }

    public void translate(Point p)
    {
        this.pos.setX(p.getX()+this.pos.getX());
        this.pos.setY(p.getY()+this.pos.getY());
    }

    public abstract Point[] getBoundingBox();

    public abstract void draw();
}
