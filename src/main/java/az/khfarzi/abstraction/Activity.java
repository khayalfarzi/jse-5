package az.khfarzi.abstraction;

public interface Activity {

    void run();

    void play();

    default void write() {

    }

    static void read() {

    }
}
