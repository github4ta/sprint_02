package bank.two;

import bank.ICard;

public class MachineAtm {

    public void printCardInfoAndSum(CardTwo card) {
        System.out.printf("%s - %s\n", card.getCardholder(), card.getAmount());
    }

    public void printCardInfoAndSum(ICard card) {
        System.out.printf("%s - %s\n", card.getInfo(), card.getMoney());
    }
}
