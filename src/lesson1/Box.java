package lesson1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    List<T> list;
    Box(T...fruits){
    this.list=new ArrayList<>(Arrays.asList(fruits));
    }
    float getWeight(){
        float weight=0.0f;
        for (int i = 0; i <list.size() ; i++) {
            weight+=list.get(i).weight;
        }
        return weight;
    }
boolean compare(Box<?> another){
        return Math.abs(this.getWeight()-another.getWeight())<0.00001;
}
void transfer (Box<? super T> another){
        if (another==this){
            return;
        }
        another.list.addAll(this.list);
        this.list.clear();
}
void add(T fruit){
        list.add(fruit);
}

}
