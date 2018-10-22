public class Giraffe extends Animal {
    String favoriteFood;

    public Giraffe(String name) { super(name, "leaves"); }
    public void eat(String food){
        if ( food == favoriteFood){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);
        }else{
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }

    }
}