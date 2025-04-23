import java.util.concurrent.*;

public class EjemploConcurrenciaJava {
    public static void main(String[] args) {
        // Crear un ExecutorService para administrar hilos
        // Executors.newFixedThreadPool(3) crea un pool de hilos fijo con 3 hilos disponibles.
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Crear tareas (Runnable) que se ejecutaran en paralelo
        // Runnable es una interfaz funcional que representa una tarea que puede ser ejecutada por un hilo.
        Runnable tarea1 = () -> {
            // Esta es la implementación de la tarea 1.
            for (int i = 0; i < 5; i++) {
                System.out.println("Tarea 1: " + i);
            }
        };

        Runnable tarea2 = () -> {
            // Esta es la implementación de la tarea 2.
            for (int i = 0; i < 5; i++) {
                System.out.println("Tarea 2: " + i);
            }
        };

        Runnable tarea3 = () -> {
            // Esta es la implementación de la tarea 3.
            for (int i = 0; i < 5; i++) {
                System.out.println("Tarea 3: " + i);
            }
        };

        // Ejecutar las tareas en hilos separados
        // executor.execute() envía una tarea Runnable al ExecutorService para su ejecución.
        // El ExecutorService se encarga de asignar un hilo disponible del pool para ejecutar la tarea.
        executor.execute(tarea1);
        executor.execute(tarea2);
        executor.execute(tarea3);

        // Cerrar el ExecutorService cuando ya no se necesite
        // Es importante llamar a shutdown() para liberar los recursos del ExecutorService
        // y permitir que la aplicación termine de forma limpia una vez que todas las tareas han finalizado.
        executor.shutdown();
    }
}