import java.lang.Math;

// Each instance of this class will be a separate thread
class EjemploThread extends Thread {
    int numero;

    // Constructor: receives and stores a number to print later
    EjemploThread(int n) {
        numero = n;
    }

    // This method is run when the thread starts
    public void run() {
        try {
            while (true) { // Infinite loop
                System.out.println(numero); // Print the thread's assigned number
                // Sleep for a random time between 0 and 1000 milliseconds (1 second)
                sleep((long)(1000 * Math.random()));
            }
        } catch (InterruptedException e) {
            return; // Ends the thread if interrupted
        }
    }
}

// Main class to launch the program
public class Main {
    public static void main(String args[]) {
        // Start 10 threads, each with a different number from 0 to 9
        for (int i = 0; i < 10; i++) {
            new EjemploThread(i).start(); // Each thread begins running its 'run()' method
        }
    }
}