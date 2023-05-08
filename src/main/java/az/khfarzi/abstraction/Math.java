package az.khfarzi.abstraction;

public class Math {

    public int topla(int a, int b) {
        return a + b;
    }

    public int topla(int a, int b, int c) {
        return a + b + c;
    }

    public int topla(int a, int b, double c) {
        return (int) (a + b + c);
    }
}
