import java.util.ArrayList;

public class TextItem extends Item {
    private String text;

    public TextItem()
    {
        text=null;
    }

    public TextItem(String text, Point position)
    {
        super(position);
        this.text=text;
    }

    public String getText()
    {
        return text;
    }

    @Override
    public Point[] getBoundingBox() {

        Point[] arr = new Point[4];
        arr[0] = new Point(getPosition().getX(),getPosition().getY());
        arr[1] = new Point(getPosition().getX(), getPosition().getY());
        arr[2] = new Point(getPosition().getX()+text.length(),getPosition().getY());
        arr[3] = new Point(getPosition().getX()+text.length(), getPosition().getY());
        return arr;
    }

    public void draw()
    {
        getGraphics().drawString(text, getPosition().getX(), getPosition().getY());
    }
}