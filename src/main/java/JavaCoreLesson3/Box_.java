package JavaCoreLesson3;

import java.util.ArrayList;

public class Box_<T extends Fruit_> {

    private ArrayList<T> fruits = new ArrayList<T>();


    public void add (T fruit) {
        fruits.add(fruit);
    }

    public T remove (int i) {
        return fruits.remove(i);
    }

    public int getBoxSize(){
        return fruits.size();
    }

    public float getBoxWeight() {
        if(fruits.size() == 0) return 0;
        float weight = 0;
        for (T fruit : fruits)
            weight += fruit.getWeight();
        return weight;
    }

    public String showType() {
        if(this.getBoxSize() > 0) return (fruits.get(0).getClass().getName());
        else return "unknown";
    }

    public void printBox(){
        System.out.println("Current box has " + this.getBoxSize() + " elements of type " + this.showType());
    }

    public boolean compareBoxes(Box_<?> another) {
        return Math.abs(this.getBoxWeight() - another.getBoxWeight()) < 0.0001;
    }

    public void transfer (Box_<T> another) {
        for(int i = this.getBoxSize() - 1; i >= 0; i--){
            T fruit = this.remove(i);
            another.add(fruit);
        }
    }

}
