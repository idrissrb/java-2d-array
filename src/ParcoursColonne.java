public class ParcoursColonne extends Parcours {
    public ParcoursColonne(TableauEntier t) {
        super(t);
    }

    public void suivant() {
        if (icour < tab.getWidth() - 1) {
            icour++;
        } else {
            icour = 0;
            jcour++;
        }
    }
}
