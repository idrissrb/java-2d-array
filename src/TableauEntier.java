
public class TableauEntier {
    private int[][] tableau;
    public static final int ITERATEUR_LIGNE = 0;
    public static final int ITERATEUR_COLONNE = 1;
    public static final int ITERATEUR_INVERSE = 2;

    private int iteratorType = ITERATEUR_LIGNE;

    public TableauEntier(int n, int m) {
        tableau = new int[n][m];
    }

    public TableauEntier(int[][] t) {
        this.tableau = t;
    }

    public int valueAt(int c, int l) {
        return tableau[c][l];
    }

    public void setValueAt(int c, int l, int value) {
        tableau[c][l] = value;
    }

    public int getWidth() {
        return tableau.length;
    }

    public int getHeight() {
        return tableau[0].length;
    }
    public void configureIterator(int type) {
        this.iteratorType = type;
    }
    public Iterateur iterator() {
        return switch (iteratorType) {
            case ITERATEUR_COLONNE -> new ParcoursColonne(this);
            case ITERATEUR_INVERSE -> new ParcoursInverse(this);
            default -> new ParcoursLigne(this);
        };
    }
}
