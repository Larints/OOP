import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Market market = new Market("Зоомагазин классных котиков", 10);
        market.stock = new ArrayList<>();
        market.stock.add(0, "Кошка - Тотошка");
        market.stock.add(0, "Кошка - Бормотушка");
        market.stock.add(0, "Кошка - Помидорка");
        market.greetings();
        market.getIn();
        market.putPerson("Кавалер кошачьей гвардии");
        market.giveProduct("Кавалер кошачьей гвардии", market.stock, "Кошка - Тотошка");
        market.getOut();
    }
}
