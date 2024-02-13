package varioshilos;

public class MainMultihilo {
    public static void main(String[] args) {
        Thread[] hilos = new Thread[10];
        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new Thread(() -> {
                SinProtegerSingleton.obtenerInstancia();
                SynchronizedSingleton.obtenerInstancia();
            });
            hilos[i].start();
        }

        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
