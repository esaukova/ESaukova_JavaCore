package JavaCoreLesson1;

public class Cat implements Participants {
    private String name;
    private int maxLength;
    private double maxHeight;
    private boolean participantDidThat = true;

    public Cat(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    @Override
    public boolean participantPassObstacle() {
        return participantDidThat;
    }


    @Override
    public void jump() {
        System.out.println("Cat " + name + " can jump");
    }

    @Override
    public void jump(Wall wall) {

        if (wall.getHeight() <= maxHeight)
        {
            System.out.println("Cat " + name + " jumped " + wall.getHeight() + " meters");
            participantDidThat = true;
        }
        else {
            System.out.println("Cat " + name + " can't jump so high");
            participantDidThat = false;

        }
    }

    @Override
    public void run() {
        System.out.println("Cat " + name + " can run");
    }

    @Override
    public void run(Treadmill treadmill) {
        if (treadmill.getLength() <= maxLength) {
            System.out.println("Cat " + name + " ran " + treadmill.getLength() + " meters");
            participantDidThat = true;
        } else {
            System.out.println("Cat " + name + " can't run so far");
            participantDidThat = false;
        }
    }
}
