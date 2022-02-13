public class Road {
   private int person = 0;
    private int cars = 3;

    public synchronized void runPeople(){
        try {
            if(person<1) {
                while (person < 4) {
                    wait(2000);
                    person++;
                    System.out.println("+1 пешеход, текущее количество =  " + person);
                }
            }
            System.out.println("Горит зеленый для пешеходов");
            person = 0;
            notify();
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    public synchronized void countCars(){
        try {
            if(cars<1) {
                while (cars < 3) {
                    wait(5000);
                    cars++;
                    System.out.println("+1 машина на светофоре, всего машин = " + cars);
                }
            }
            System.out.println("Горит зеленый для машин");
            cars = 0;
            notify();
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
