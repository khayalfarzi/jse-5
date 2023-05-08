package az.khfarzi.abstraction;

public class Human extends Alive implements Activity {

    @Override
    public void breath() {
        System.out.println("Example breath method for Human clazz");
    }

    @Override
    public void run() {
        System.out.println("Human is running");
    }

    @Override
    public void play() {
        System.out.println("Play football");
    }

    @Override
    public void write() {
        System.out.println("Human write");
    }
}
