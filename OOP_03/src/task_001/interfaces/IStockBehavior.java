package task_001.interfaces;

import task_001.classes.Product;

public interface IStockBehavior {


    void putProduct(Product product);

    void removeProduct(Product product);

    void checkStatus();

}
