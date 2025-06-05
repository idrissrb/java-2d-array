public class ParcoursLigne extends Parcours {
    public ParcoursLigne(TableauEntier t) {
        super(t);
    }

    public void suivant() {
        if (jcour < tab.getHeight() - 1) {
            jcour++;
        } else {
            jcour = 0;
            icour++;
        }
    }
}
