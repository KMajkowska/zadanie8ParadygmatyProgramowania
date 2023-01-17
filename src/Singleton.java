public interface Singleton {

    default OvalSingleton getOvalInstance(int width, int height, Point position, Boolean filled)
    {
        return OvalSingleton.getInstance(width, height, position, filled);
    }
}
