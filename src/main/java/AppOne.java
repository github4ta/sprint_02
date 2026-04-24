import bank.one.AtmOne;
import bank.one.Card;
import bank.one.CardOne;
import bank.one.CardOnePremium;

public class AppOne {
    public static void main(String[] args) {
        CardOne cardOne = new CardOne("John", 1000);
        AtmOne atmOne = new AtmOne();

        atmOne.printCardInfo(cardOne);

        CardOnePremium cardOnePremium = new CardOnePremium("Mike", -1000);

        atmOne.printCardInfo(cardOnePremium);


    }
}
