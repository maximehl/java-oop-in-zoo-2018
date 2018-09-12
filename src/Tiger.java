public class Tiger{

    String name;
    String favoriteFood;

    public Tiger(String name){
        this.name = name;
        this.favoriteFood = "meat";
    }

    public void sleep(){
        System.out.println(this.name + " sleeps for 8 hours");
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