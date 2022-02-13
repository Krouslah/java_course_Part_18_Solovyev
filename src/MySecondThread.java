public class MySecondThread implements Runnable{
    private Road road;
    boolean flag = true;

    public MySecondThread(Road road) {
        this.road = road;
    }

    @Override
    public void run() {
        while (flag) {
            road.countCars();
        }
    }
}
