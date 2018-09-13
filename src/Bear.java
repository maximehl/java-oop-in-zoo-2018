public class Bear{

    String name;
    String favoriteFood;

    public Bear(String name){
        this.name = name;
        this.favoriteFood = "fish";
    }

    public void sleep(){
        System.out.println(this.name + " hibernates for 4 months");
    }

    public void eat(String food){
        System.out.println(this.name + " eats " + food);
        if(food.equals(this.favoriteFood)){
            System.out.println("YUM!!! " + this.name + " wants more " + food);
        }else{
            sleep();
        }
    }
}