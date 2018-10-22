public class Unicorn extends Animal {
    String favoriteFood;

    public Unicorn(String name) {
        super(name, "marshmallows");
    }
    public void sleep() {
        System.out.println( name + " sleeps in a cloud");
    }
}
