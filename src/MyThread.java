public class MyThread implements Runnable{
    private Road road;
    boolean flag = true;

    public MyThread(Road road) {
        this.road = road;
    }

    @Override
    public void run() {
      while (flag) {
          road.runPeople();
        }
    }
}
