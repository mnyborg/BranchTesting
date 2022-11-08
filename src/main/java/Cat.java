public class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat");
    }
    boolean eat(String s) {
        return true;
    }

    void mood(boolean mood) {
        if (mood) System.out.println("Spinder");
        else System.out.println("Hvæser");
    }

    void jump(double dist) {
        System.out.println(dist);
    }
}
