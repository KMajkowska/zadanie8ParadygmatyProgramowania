public abstract class Primitive extends Item{
    public Primitive(Point pos)
    {
        super(pos);
    }

    public Primitive(){}

    public Primitive(int x, int y)
    {
        super(new Point(x,y));
    }
}
