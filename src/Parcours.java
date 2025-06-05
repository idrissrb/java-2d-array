
public abstract class Parcours implements Iterateur{
    protected TableauEntier tab;
    protected int icour = 0, jcour = 0, count = 0;

    public Parcours(TableauEntier t) {
        tab = t;
    }

    public boolean hasNext() {
        return count < tab.getWidth() * tab.getHeight();
    }

    public int next() {
        int val = tab.valueAt(jcour, icour);
        suivant();
        count++;
        return val;
    }

    public abstract void suivant();
}
