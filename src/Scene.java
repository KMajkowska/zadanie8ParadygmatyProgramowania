import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Scene extends Frame{
    private int width;
    private int height;

    private ArrayList<RenderBoundingBox> items;

    public Scene(int width, int height)
    {
        items = new ArrayList<>();
        setSize(width, height);
        setTitle("Rysowanie");
        setVisible(true);
        addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we) {System.exit(0);}});
    }

    public void addItem(RenderBoundingBox item){
        item.setGraphics(this.getGraphics());
        items.add(item);
    }

    public void draw(){
        for(int i=0;i<items.size();i++)
        {
            items.get(i).draw();
        }
    }

    public ArrayList<RenderBoundingBox> getItems(){
        return items;
    }

    public void paint(Graphics g)
    {
        draw();
    }
}