import bank.one.AtmOne;
import bank.one.CardOne;
import bank.three.ATMThree;
import bank.two.CardTwo;
import bank.two.MachineAtm;

public class AppOneTwo {
    public static void main(String[] args) {
        CardOne cardOne = new CardOne("John", 1000);
        AtmOne atmOne = new AtmOne();

        atmOne.printCardInfo(cardOne);

        CardTwo cardTwo = new CardTwo("Ivanov Ivan", 10000);
        MachineAtm machineAtm = new MachineAtm();

        machineAtm.printCardInfoAndSum(cardTwo);

        atmOne.printCardInfo(cardTwo);

        ATMThree atmThree = new ATMThree();
        atmThree.print(cardOne);
        atmThree.print(cardTwo);
    }
}
