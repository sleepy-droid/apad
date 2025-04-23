public class NoSincronizada extends Thread {
    // 'NoSincronizada' es el nombre de la clase, y hereda de la clase 'Thread'.
    // Esto significa que los objetos de esta clase pueden ejecutarse como hilos (threads).

    static int n = 1;
    // 'static int n = 1;' declara una variable entera llamada 'n' que es 'static'.
    // 'static' significa que esta variable pertenece a la clase 'NoSincronizada' en sí misma,
    // no a una instancia específica de la clase. Solo habrá una copia de 'n' compartida
    // por todos los objetos de 'NoSincronizada'.
    // Se inicializa con el valor 1.

    public void run() {
        // 'run()' es un método especial en la clase 'Thread'. Cuando se inicia un hilo
        // utilizando el método 'start()', el código dentro del método 'run()' es lo que
        // se ejecuta en ese nuevo hilo.

        for (int i = 0; i < 10; i++) {
            // Este es un bucle 'for' que se ejecutará 10 veces.
            // La variable 'i' comenzará en 0 y se incrementará en 1 en cada iteración
            // hasta que sea menor que 10.

            System.out.println(n);
            // 'System.out.println(n);' imprime el valor actual de la variable 'n' en la consola.

            n++;
            // 'n++;' incrementa el valor de la variable 'n' en 1 después de que se ha impreso.
        }
    }

    public static void main(String args[]) {
        // 'main()' es el método principal donde comienza la ejecución del programa Java.
        // 'public static' permite que este método sea llamado directamente por la JVM
        // sin necesidad de crear una instancia de la clase.
        // 'void' indica que este método no devuelve ningún valor.
        // 'String args[]' son los argumentos de línea de comandos que se pueden pasar al programa.

        Thread thr1 = new NoSincronizada();
        // Se crea un nuevo objeto de la clase 'NoSincronizada' y se asigna a la variable
        // 'thr1' de tipo 'Thread'. Este objeto representa un hilo.

        Thread thr2 = new NoSincronizada();
        // Se crea otro nuevo objeto de la clase 'NoSincronizada' y se asigna a la variable
        // 'thr2' de tipo 'Thread'. Este es un segundo hilo.

        thr1.start();
        // 'thr1.start();' inicia la ejecución del hilo representado por el objeto 'thr1'.
        // Esto hace que el método 'run()' de la instancia 'thr1' se ejecute en un nuevo hilo
        // de ejecución.

        thr2.start();
        // 'thr2.start();' inicia la ejecución del hilo representado por el objeto 'thr2'.
        // Esto hace que el método 'run()' de la instancia 'thr2' se ejecute en otro nuevo
        // hilo de ejecución, concurrente con el primer hilo.
    }
}
