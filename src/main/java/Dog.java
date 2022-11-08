public class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog");
    }
    boolean eat(String s) {
        return true;
    }

    void mood(boolean mood) {
        if (mood) System.out.println("Logre");
        else System.out.println("Knurrer");
    }
}
