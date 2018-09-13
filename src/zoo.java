public class zoo {

    public static void main(String args[]){
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
    }

    String favoriteFood = "bacon";
    public void sleep(String name){
        System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String name, String food){
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!! " + name + " wants more " + food);
        }else{
            sleep(name);
        }
    }
}

