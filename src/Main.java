public class Main {
    public static void main(String[] args) {
        Road road = new Road();
        new Thread(new MyThread(road), "Thread 1").start();
        new Thread(new MySecondThread(road), "Thread 2").start();
        try {
            Thread.sleep(30000);
            System.exit(103);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
