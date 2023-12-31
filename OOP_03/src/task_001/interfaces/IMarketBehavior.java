package task_001.interfaces;

public interface IMarketBehavior {

    /**
     * Этот метод имитурет вхождение человека в магазин
     */
    void getIn();

    /**
     * Этот метод имитирует выход человека из магазина
     */
    void getOut();

    /**
     * Этот метод отображает текущий статус количества людей в магазине
     */
    void update();

}
