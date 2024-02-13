package varioshilos;

public class SynchronizedSingleton {
    private static SynchronizedSingleton instancia;
    private SynchronizedSingleton() {}
    public static synchronized SynchronizedSingleton obtenerInstancia() {
        if (instancia == null) {
            instancia = new SynchronizedSingleton();
            int hashcode = instancia.hashCode();
            System.out.println("Hash Singleton protegido: " + hashcode + " por el hilo " + Thread.currentThread().getName());
        }
        return instancia;
    }

}
