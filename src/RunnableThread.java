class MyRunnable implements Runnable {
    // Override run() method
    public void run() {
        // Loop from 1 to 5 and print numbers
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        // Create an instance of MyRunnable
        MyRunnable runnable = new MyRunnable();

        // Create a Thread object passing the runnable instance
        Thread t = new Thread(runnable);

        // Start the thread
        t.start();
    }
}

