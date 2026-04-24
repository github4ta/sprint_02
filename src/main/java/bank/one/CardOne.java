package bank.one;

import bank.ICard;

public class CardOne extends Card implements ICard {

    public CardOne(String name, int sum) {
        super(name, sum);
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public String getInfo() {
        return name;
    }

    @Override
    public int getMoney() {
        return sum;
    }
}
