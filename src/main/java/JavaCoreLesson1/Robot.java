package JavaCoreLesson1;

public class Robot implements Participants {
    private String name;
    private int maxLength;
    private double maxHeight;
    private boolean participantDidThat = true;

    public Robot(String name, int maxLength, double maxHeight)
    {
        this.name = name;
        this.maxHeight =  maxHeight;
        this.maxLength = maxLength;
    }

    @Override
    public boolean participantPassObstacle() {
        return participantDidThat;
    }

    @Override
    public void jump() {
        System.out.println(getClass().getName() + " can jump" );
    }

    @Override
    public void jump(Wall wall) {
        if (wall.getHeight() <= maxHeight)
        {
            System.out.println("Robot " + name + " jumped " + wall.getHeight() + " meters");
            participantDidThat = true;
        }
        else {
            System.out.println("Robot " + name + " can't jump so high");
            participantDidThat = false;
        }
    }

    @Override
    public void run() {
        System.out.println(getClass().getName() + " can run" );
    }

    @Override
    public void run(Treadmill treadmill) {
        if (treadmill.getLength() <= maxLength)
        {
            System.out.println("Robot " + name + " ran " + treadmill.getLength() + " meters");
            participantDidThat = true;
        }
        else {
            System.out.println("Robot " + name + " can't run so far");
            participantDidThat = false;
        }
    }
}
