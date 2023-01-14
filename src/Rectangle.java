public class Rectangle extends Shape{
    private int width,height;

    public Rectangle()
    {
        width=0;
        height=0;
    }

    public Rectangle(int width, int height, Point position, Boolean filled)
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
        arr[0] = new Point(this.getPosition().getX(),this.getPosition().getY());
        arr[1] = new Point(this.getPosition().getX(),this.getPosition().getY()-height);
        arr[2] = new Point(this.getPosition().getX()+width,this.getPosition().getY()-height);
        arr[3] = new Point(this.getPosition().getX()+width,this.getPosition().getY());
        return arr;
    }

    public int mostHigh()
    {
        return this.getPosition().getY();
    }

    public int mostLow()
    {
        return this.getPosition().getY() - height;
    }

    public int mostRight()
    {
        return this.getPosition().getX() + width;
    }

    public int mostLeft()
    {
        return this.getPosition().getX();
    }

    public void draw()
    {
        if(!getFilled())
            getGraphics().drawRect(getPosition().getX()+(width/2),getPosition().getY()-(height/2),width,height);
        else
            getGraphics().fillRect(getPosition().getX()+(width/2),getPosition().getY()-(height/2),width,height);
    }
}
