import com.learning.*;

public class Main {
    public static void main(String[] args) {

        Engine sportEngine = new NormalEngine();
        Engine normalEngine = new SportEngine();




        Vehicle car = new Car("BMW", sportEngine, 0, 4000);
        Vehicle bus = new Bus("GAS", normalEngine, 0, 5000);
        Car car1 = new Car("BMW", sportEngine, 0, 80000);
        Bus bus2 = new Bus("GAS", normalEngine, 0, 6000);



        car1.test();
        bus2.test();
        car.test();
        bus.test();


    }
}