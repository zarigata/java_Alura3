import com.zarigata.tank.Model;
import com.zarigata.tank.Tank;
//import com.zarigata.tank.calculator;

public class Main {
    public static void main(String[] args) {
        Tank myTank = new Tank();
        myTank.setName("Panzerkranfwagent");
        myTank.setYear(1941);
        myTank.setBr(6.3);
        myTank.setPenetration(188);
        myTank.setArmour(220);
        myTank.showDetails();

        Model stuart = new Model();
        stuart.setName("Stuart");
        stuart.setYear(1943);

//        calculator penetration = new calculator();
//        calculator.confront(myTank);
    }
}
