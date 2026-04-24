package bank.one;

import bank.ICard;
import bank.two.CardTwo;

public class AtmOne {

    public void printCardInfo(CardOne card) {
        System.out.println(card.getName() + " " + card.getSum());
    }

    public void printCardInfo(CardOnePremium card) {
        System.out.println(card.getName() + " " + card.getSum());
    }

    public void printCardInfo(CardTwo card) {
        System.out.println(card.getCardholder() + " " + card.getAmount());
    }

    public void printCardInfo(ICard card) {
        System.out.println(card.getInfo() + " " + card.getMoney());
    }
}
