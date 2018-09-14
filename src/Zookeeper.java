import java.util.ArrayList;

public class Zookeeper {
    String name;
    public Zookeeper (String name){
        this.name = name;
    }

    public void feedAnimals(Animal[] animals, String food){
        System.out.println(this.name + " is feeding " + food + " to " + animals.length + " of " + Animal.population + " total animals");
        for(int n = 0; n<animals.length; n++){
            animals[n].eat(food);
        }
    }

    //can't get this to work with ArrayLists...
//    public void feedAnimals(ArrayList animals, String food){
//        System.out.println(this.name + " is feeding " + food + " to " + animals.size() + " animals");
//        Animal item;
//        for(int n = 0; n<animals.size(); n++){
//            item = animals.get(n);
//            item.eat(food);
//        }
//    }
}
