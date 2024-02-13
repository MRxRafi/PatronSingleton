package unhilo;

public class LazySingleton {
    private static LazySingleton instancia;
    private LazySingleton() {}
    public static LazySingleton obtenerInstancia() {
        if (instancia == null) {
            instancia = new LazySingleton();
        }
        return instancia;
    }

    public void pintarHash() {
        LazySingleton instanciaDos = new LazySingleton();
        System.out.println("Hash Lazy Singleton: " + instancia.hashCode());
        System.out.println("Hash de otra instancia: " + instanciaDos.hashCode());
        System.out.println();
    }


}
