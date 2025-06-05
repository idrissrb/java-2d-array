public class ParcoursInverse extends Parcours {
    public ParcoursInverse(TableauEntier t) {
        super(t);
        icour = tab.getWidth() - 1;
        jcour = tab.getHeight() - 1;
    }

    public void suivant() {
        if (jcour > 0) {
            jcour--;
        } else {
            jcour = tab.getHeight() - 1;
            icour--;
        }
    }

    @Override
    public boolean hasNext() {
        return count < tab.getWidth() * tab.getHeight() && icour >= 0;
    }
}
