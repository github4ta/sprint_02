package bank.two;

import bank.ICard;

public class CardTwo implements ICard {
    private String cardholder;
    private int amount;
    private String expired;

    public CardTwo(String cardholder, int amount) {
        this.cardholder = cardholder;
        this.amount = amount;
    }

    public String getCardholder() {
        return cardholder;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String getInfo() {
        return cardholder;
    }

    @Override
    public int getMoney() {
        return amount;
    }
}
