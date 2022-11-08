public class Main {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        c.makeSound();
        d.makeSound();

        c.eat("Fish");
        d.eat("DogFood");

        c.mood(true);
        d.mood(false);

        System.out.println("Stash");
    }
}
