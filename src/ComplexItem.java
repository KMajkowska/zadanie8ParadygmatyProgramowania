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
        arr[0] = new Point(mostL(),mostHigh());
        arr[1] =new Point(mostL(),mostLow());
        arr[2] =new Point(mostR(),mostLow());
        arr[3] =new Point(mostR(),mostHigh());
        return arr;
    }

    private int mostHigh()
    {
        int first = getChildren().get(0).getBoundingBox()[0].getY();
        int max=first;
        for(int i=1;i<getChildren().size();i++)
        {
            max=Math.max(getChildren().get(i).getBoundingBox()[0].getY(),max);
        }
        return max;
    }

    private int mostLow()
    {
        int first = getChildren().get(0).getBoundingBox()[1].getY();
        int min=first;
        for(int i=1;i<getChildren().size();i++)
        {
            min=Math.min(getChildren().get(i).getBoundingBox()[1].getY(),min);
        }
        return min;
    }

    private int mostR()
    {
        int first = getChildren().get(0).getBoundingBox()[3].getX();
        int max=first;
        for(int i=1;i<getChildren().size();i++)
        {
            max=Math.max(getChildren().get(i).getBoundingBox()[3].getX(),max);
        }
        return max;
    }

    private int mostL()
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
