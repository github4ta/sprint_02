package bank.three;

import bank.ICard;

public class ATMThree {

    public void print(ICard card) {
        System.out.println(card.getInfo() + " = " + card.getMoney());
    }
}
