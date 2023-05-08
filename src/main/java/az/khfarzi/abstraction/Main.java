package az.khfarzi.abstraction;

public class Main {

    public static void main(String[] args) {

        Alive human = new Human();
//        Human human = new Human();

        human.breath();
        human.getLifespan();
        human.write();

        int a = 6;
        String b = "hello";

        System.out.println(a + b);


        Activity humanActivity = new Human();

        Math math = new Math();
        math.topla(2, 3, 7L);
    }
}
