package task_01;

public abstract class Figure implements IFigure {       // Создаём абстрактный класс "Фигура"

    public final Double pi = 3.14;

    Double height;

    Double width;

    public Figure() {

    }


    public Figure(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public Double calculateArea() {          // Преопределение метода интерфейса
        return height * width;
    }

    @Override
    public Double calculatePerimeter() {  // Преопределение метода интерфейса

        return 2 * (height + width);
    }

}