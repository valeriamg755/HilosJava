public class Main {
    public static void main(String[] args) {
        Thread hilo1 = new Thread(new Tarea1());
        Thread hilo2 = new Thread(new Tarea1());
        hilo1.start();
        hilo2.start();
        // el código continúa ejecutándose aquí mientras los hilos trabajan en segundo plano
    }
}