import bank.two.CardTwo;
import bank.two.MachineAtm;

public class AppTwo {
    public static void main(String[] args) {
        CardTwo cardTwo = new CardTwo("Ivanov Ivan", 10000);
        MachineAtm machineAtm = new MachineAtm();

        machineAtm.printCardInfoAndSum(cardTwo);
    }
}
