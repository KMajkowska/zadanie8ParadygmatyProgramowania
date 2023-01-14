public interface Singleton {

    static OvalSingleton getInstance(int width, int height, Point position, Boolean filled)
    {
        OvalSingleton oval = OvalSingleton.getInstance(width, height, position, filled);
        return oval;
    }
}
