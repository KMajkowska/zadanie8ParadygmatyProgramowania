import java.util.ArrayList;

public class ComplexItem extends Item{
    private ArrayList<Item> children;

    public ComplexItem()
    {
        children=new ArrayList<>();
    }

    public void addChild(Item child)
    {
        children.add(child);
    }

    public ArrayList<Item> getChildren()
    {
        return children;
    }

    @Override
    public void translate(Point p) {
        for(int i=0;i<children.size();i++)
        {
            children.get(i).translate(p);
        }
    }

    public Point[] getBoundingBox() {
        Point[] arr = new Point[4];
        arr[0] = new Point(mostLeft(),mostHigh());
        arr[1] =new Point(mostLeft(),mostLow());
        arr[2] =new Point(mostRight(),mostLow());
        arr[3] =new Point(mostRight(),mostHigh());
        return arr;
    }

    public int mostHigh()
    {
        int first = getChildren().get(0).getBoundingBox()[0].getY();
        int max=first;
        for(int i=1;i<getChildren().size();i++)
        {
            max=Math.max(getChildren().get(i).getBoundingBox()[0].getY(),max);
        }
        return max;
    }

    public int mostLow()
    {
        int first = getChildren().get(0).getBoundingBox()[1].getY();
        int min=first;
        for(int i=1;i<getChildren().size();i++)
        {
            min=Math.min(getChildren().get(i).getBoundingBox()[1].getY(),min);
        }
        return min;
    }

    public int mostRight()
    {
        int first = getChildren().get(0).getBoundingBox()[3].getX();
        int max=first;
        for(int i=1;i<getChildren().size();i++)
        {
            max=Math.max(getChildren().get(i).getBoundingBox()[3].getX(),max);
        }
        return max;
    }

    public int mostLeft()
    {
        int first = getChildren().get(0).getBoundingBox()[0].getY();
        int min=first;
        for(int i=1;i<getChildren().size();i++)
        {
            min=Math.min(getChildren().get(i).getBoundingBox()[0].getY(),min);
        }
        return min;
    }

    public void draw()
    {
        for(int i=0;i<getChildren().size();i++)
        {
            getChildren().get(i).draw();
        }
    }
}
