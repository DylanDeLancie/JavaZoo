public class Bee extends Animal {
    String favoriteFood;

    public Bee(String name) { super(name, "pollen"); }
    public void eat(String food){
        if ( food == favoriteFood){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);
        }else{
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }

    }
    public void sleep() {
        System.out.println( name + " never sleeps");
    }
}