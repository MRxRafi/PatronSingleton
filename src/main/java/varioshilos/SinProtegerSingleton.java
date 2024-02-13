package varioshilos;

public class SinProtegerSingleton {
    private static SinProtegerSingleton instancia;
    private SinProtegerSingleton() {}
    public static SinProtegerSingleton obtenerInstancia() {
        if (instancia == null) {
            instancia = new SinProtegerSingleton();
            int hashcode = instancia.hashCode();
            System.out.println("Hash Singleton sin proteger: " + hashcode + " por el hilo " + Thread.currentThread().getName());
        }
        return instancia;
    }

}
