package bank.one;

public abstract class Card {
    protected String name;
    protected int sum;

    public Card(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }
}
