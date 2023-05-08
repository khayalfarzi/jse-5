package az.khfarzi.abstraction;

public abstract class Alive {

    private int lifespan;

    public abstract void breath();

    public  void write(){
        System.out.println(" Alive write");
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }
}
