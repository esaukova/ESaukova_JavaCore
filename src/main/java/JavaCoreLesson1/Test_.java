package JavaCoreLesson1;

public class Test_ {
    public static void main(String[] args) {

        Participants[] participants = new Participants[3];

        participants[0] = new Cat("Vasiliy", 500, 1);
        participants[1] = new Human("Katya", 1000, 1);
        participants[2] = new Robot("NDR-114", 3000, 10);


        Obstacles[] obstacles = new Obstacles[2];

        obstacles[0] = new Treadmill(900);
        obstacles[1] = new Wall (2);

        passTreadmill (participants, obstacles);

    }

    private static void passTreadmill (Participants[] participants, Obstacles[] obstacles) {

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {

                if (obstacles[j] instanceof Wall) {
                    if (participants[i].participantPassObstacle()) {
                        participants[i].jump((Wall) obstacles[j]);
                    }
                }


                if (obstacles[j] instanceof Treadmill) {
                    if (participants[i].participantPassObstacle()) {
                        participants[i].run((Treadmill) obstacles[j]);
                    }
                }
            }
        }
    }
}
