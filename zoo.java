import java.util.ArrayList;

public class zoo {

    public static void main(String args[]){
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        rarity.sleep();
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");
        Zookeeper zoeBot = new Zookeeper("ZoeBot");
        //zoeBot.feedAnimals(new Animal[] {tigger, pooh, rarity, gemma, stinger}, "grilled vegetables");

        //this also works now... my project defaults were weird
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(tigger);
        animals.add(pooh);
        animals.add(rarity);
        animals.add(gemma);
        animals.add(stinger);
        zoeBot.feedAnimals(animals, "grilled vegetables");
    }

}