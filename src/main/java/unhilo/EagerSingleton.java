package unhilo;

public class EagerSingleton {
    private static EagerSingleton instancia = new EagerSingleton();
    private EagerSingleton() {}
    public static EagerSingleton obtenerInstancia() {
        return instancia;
    }

    public void pintarHash() {
        EagerSingleton instanciaDos = new EagerSingleton();
        System.out.println("Hash Eager Singleton: " + instancia.hashCode());
        System.out.println();
    }
}
