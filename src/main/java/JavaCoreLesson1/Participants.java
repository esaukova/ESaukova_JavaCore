package JavaCoreLesson1;

public interface Participants {

    void jump();

    void jump(Wall wall);

    void run();

    void run(Treadmill treadmill);

    boolean participantPassObstacle();
}
