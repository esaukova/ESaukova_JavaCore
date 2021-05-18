package JavaCoreLesson1;

public class Wall implements Obstacles {
    private double height;

    public double getHeight() {
        return height;
    }

    public Wall(double height)
    {
        this.height = height;
    }
}
