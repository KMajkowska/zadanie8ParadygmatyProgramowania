import java.awt.*;

public class RenderBoundingBox extends Decorator{

    public RenderBoundingBox(Item i)
    {
        super(i);
    }

    public Point[] getBoundingBox() {
        return item.getBoundingBox();
    }

    public void drawBoundingBox()
    {
        item.getGraphics().drawPolygon(
                new int[] {
                        item.getBoundingBox()[0].getX(),
                        item.getBoundingBox()[1].getX(),
                        item.getBoundingBox()[2].getX(),
                        item.getBoundingBox()[3].getX()
                },
                new int[] {
                        item.getBoundingBox()[0].getY(),
                        item.getBoundingBox()[1].getY(),
                        item.getBoundingBox()[2].getY(),
                        item.getBoundingBox()[3].getY()
                },
                4);
    }

    public  int mostHigh()
    {
        return item.mostHigh();
    }
    public int mostLow()
    {
        return item.mostLow();
    }
    public int mostRight()
    {
        return item.mostRight();
    }
    public int mostLeft()
    {
        return item.mostLeft();
    }

    public void draw()
    {
        item.draw();
    }

    public Graphics getGraphics()
    {
        return item.getGraphics();
    }

    public void setGraphics(java.awt.Graphics graphics)
    {
        item.setGraphics(graphics);
    }


    public Point getPosition()
    {
        return item.getPosition();
    }

    public void setPosition(Point pos)
    {
        item.setPosition(pos);
    }

    public void translate(Point p)
    {
        item.translate(p);
    }


}
