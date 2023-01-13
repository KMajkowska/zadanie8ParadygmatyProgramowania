public class Segment extends Primitive {

    double length;
    Point start_point;
    Point end_point;
    Point[] arr = new Point[4];

    public Segment() {
        this.length = 0;
        this.start_point = new Point();
        this.end_point = new Point();
    }

    public Segment(Point start_point, Point end_point) {
        this.length = Math.sqrt((Math.pow(end_point.getX() - start_point.getX(),2) + Math.pow(end_point.getY() - start_point.getY(),2)));
        this.start_point = start_point;
        this.end_point = end_point;
    }

    public double getLength() {
        return length;
    }

    public void setLength(Point s, Point e) {
        this.length = Math.sqrt((Math.pow(e.getX() - s.getX(),2) + Math.pow(e.getY() - s.getY(),2)));
    }

    public Point getStart_point() {
        return start_point;
    }

    public void setStart_point(int x, int y) {

        this.start_point = new Point(x,y);
    }

    public Point getEnd_point() {
        return end_point;
    }

    public void setEnd_point(int x, int y) {

        this.end_point = new Point(x,y);
    }

    @Override
    public void draw() {
        getGraphics().drawLine(start_point.getX(),start_point.getY(),end_point.getX(),end_point.getY());
    }

    public Point[] getBoundingBox()
    {
        Point[] arr = new Point[4];
        arr[0] = start_point;
        arr[1] = new Point(start_point.getX(), end_point.getY());
        arr[2] = end_point;
        arr[3] = new Point(end_point.getX(), start_point.getY());
        setPosition(new Point(left(), high()));
        return arr;
    }

    private int left()
    {
        return Math.max(start_point.getY(),end_point.getY());
    }

    private int low()
    {
        return Math.min(start_point.getY(),end_point.getY());
    }

    private int right()
    {
        return Math.max(start_point.getX(),end_point.getX());
    }

    private int high()
    {
        return Math.min(start_point.getX(),end_point.getX());
    }


}
