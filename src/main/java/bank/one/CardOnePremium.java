package bank.one;

public class CardOnePremium {
    private String name;
    private int sum;
    private boolean overdfraft;

    public CardOnePremium(String name, int sum) {
        this.name = name;
        this.sum = sum;
        overdfraft = true;
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    public boolean isOverdfraft() {
        return overdfraft;
    }

    public void setOverdfraft(boolean overdfraft) {
        this.overdfraft = overdfraft;
    }
}
