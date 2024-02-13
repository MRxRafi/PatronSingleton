package unhilo;

public class Main {
    public static void main(String[] args) {
        LazySingleton.obtenerInstancia().pintarHash();
        LazySingleton.obtenerInstancia().pintarHash();
        LazySingleton.obtenerInstancia().pintarHash();

        EagerSingleton.obtenerInstancia().pintarHash();
        EagerSingleton.obtenerInstancia().pintarHash();
    }
}
