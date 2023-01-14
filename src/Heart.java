public class Heart extends Shape{
    int x, y, width, length;

    public Heart()
    {
        x = 0;
        y=0;
        width = 0;
        length =0;
    }

    public Heart(int width, int length, Point position, Boolean filled, int x, int y)
    {
        super(filled,position);
        this.width=width;
        this.length=length;
        this.x = x;
        this.y = y;
    }

    public Point[] getBoundingBox() {
        Point[] arr = new Point[4];
        arr[0] = new Point(this.getPosition().getX(),this.getPosition().getY());
        arr[1] = new Point(this.getPosition().getX(),this.getPosition().getY()-length);
        arr[2] = new Point(this.getPosition().getX()+width,this.getPosition().getY()-length);
        arr[3] = new Point(this.getPosition().getX()+width,this.getPosition().getY());
        return arr;
    }

    public void draw() {
        if (getFilled()) {
            int[] triangleX = {
                    x - 2 * width / 18,
                    x + width + 2 * width / 18,
                    (x - 2 * width / 18 + x + width + 2 * width / 18) / 2};
            int[] triangleY = {
                    y + length - 2 * length / 3,
                    y + length - 2 * length / 3,
                    y + length};
            getGraphics().fillOval(
                    x - width / 12,
                    y,
                    width / 2 + width / 6,
                    length / 2);
            getGraphics().fillOval(
                    x + width / 2 - width / 12,
                    y,
                    width / 2 + width / 6,
                    length / 2);
            getGraphics().fillPolygon(triangleX, triangleY, triangleX.length);
        } else {
            int[] triangleX = {
                    x - 2 * width / 18,
                    x + width + 2 * width / 18,
                    (x - 2 * width / 18 + x + width + 2 * width / 18) / 2};
            int[] triangleY = {
                    y + length - 2 * length / 3,
                    y + length - 2 * length / 3,
                    y + length};
            getGraphics().drawOval(
                    x - width / 12,
                    y,
                    width / 2 + width / 6,
                    length / 2);
            getGraphics().drawOval(
                    x + width / 2 - width / 12,
                    y,
                    width / 2 + width / 6,
                    length / 2);
            getGraphics().drawPolygon(triangleX, triangleY, triangleX.length);
        }
    }

    public int mostHigh()
    {
        return this.getPosition().getY();
    }

    public int mostLow()
    {
        return this.getPosition().getY() - length;
    }

    public int mostRight()
    {
        return this.getPosition().getX() + width;
    }

    public int mostLeft()
    {
        return this.getPosition().getX();
    }
}
