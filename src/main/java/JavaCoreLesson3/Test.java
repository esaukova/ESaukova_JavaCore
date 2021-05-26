package JavaCoreLesson3;

public class Test {

    public static void main(String[] args) {

        System.out.println("\n The weight of the box \n");
        Box<Apple> appleBox1 = new Box();
        for(int i = 0; i < 8; i++){
            appleBox1.add(new Apple());
        }

        Box<Apple> appleBox2 = new Box();
        for(int i = 0; i < 7; i++){
            appleBox2.add(new Apple());
        }

        Box<Orange> orangeBox1 = new Box();
        for(int i = 0; i < 4; i++){
            orangeBox1.add(new Orange());
        }

        Box<Orange> orangeBox2 = new Box();
        for(int i = 0; i < 3; i++){
            orangeBox2.add(new Orange());
        }

        System.out.println(appleBox1.getBoxWeight());
        System.out.println(orangeBox1.getBoxWeight());
        System.out.println(appleBox2.getBoxWeight());
        System.out.println(orangeBox2.getBoxWeight());

        System.out.print("Comparing boxes weight:  ");

        if (appleBox1.compareBoxes(orangeBox1)) {
            System.out.println("boxes have equal weight.");
        } else {
            System.out.println("boxes have different weight.");
        }
        System.out.println();

        System.out.println("Fruits transfer to another box");
        appleBox1.printBox();
        appleBox2.printBox();
        System.out.println("Transfer fruits from 1 box to another: ");
        System.out.println();
        appleBox1.transfer(appleBox2);
        appleBox1.printBox();
        appleBox2.printBox();


    }

}
