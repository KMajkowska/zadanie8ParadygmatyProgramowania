import java.util.ArrayList;

public class OvalSingleton extends Shape{
    private int width,height;
    private static OvalSingleton single_instance = null;

    public OvalSingleton()
        {
            width=0;
            height=0;
        }

    public OvalSingleton(int width, int height, Point position, Boolean filled)
        {
            super(filled,position);
            this.width=width;
            this.height=height;
        }

        public int getWidth()
        {
            return width;
        }

        public int getHeight()
        {
            return height;
        }

        @Override
        public Point[] getBoundingBox() {
            Point[] arr = new Point[4];
            arr[0]= new Point(this.getPosition().getX(),this.getPosition().getY());
            arr[1]=new Point(this.getPosition().getX(),this.getPosition().getY()+height);
            arr[2]=new Point(this.getPosition().getX()+width,this.getPosition().getY()+height);
            arr[3]=new Point(this.getPosition().getX()+width,this.getPosition().getY());
            return arr;
        }

        public void draw()
        {
            if(!getFilled())
                getGraphics().drawOval(getPosition().getX(),getPosition().getY(),width,height);
            else
                getGraphics().fillOval(getPosition().getX(),getPosition().getY(),width,height);
            getGraphics().drawPolygon(new int[] {getBoundingBox()[0].getX(),getBoundingBox()[1].getX(),getBoundingBox()[2].getX(),getBoundingBox()[3].getX()},new int[] {getBoundingBox()[0].getY(),getBoundingBox()[1].getY(),getBoundingBox()[2].getY(),getBoundingBox()[3].getY()}, 4);
        }

    public static OvalSingleton getInstance(int width, int height, Point position, Boolean filled)
    {
        if (single_instance == null) {
            single_instance = new OvalSingleton(width, height, position, filled);
        }

        return single_instance;
    }
}
