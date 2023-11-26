import com.zarigata.tank.Model;
import com.zarigata.tank.Tank;

public class Main {
    public static void main(String[] args) {
        Tank myTank = new Tank();
        myTank.setName("Panzerkranfwagent");
        myTank.setYear(1941);
        myTank.setBr(6.3);
        myTank.showDetails();

        Model stuart = new Model();
        stuart.setName("Stuart");
        stuart.setYear(1943);

    }
}
