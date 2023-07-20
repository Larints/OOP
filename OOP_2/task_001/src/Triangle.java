public class Triangle extends Figure {   // Создаём экземпляр класса "Треугольник"

    int a;

    int b;

    int c;


    public Triangle() {
        // TODO Auto-generated constructor stub
    }

    public Triangle(int a, int b, int c) {

    }

    @Override
    public Double calculateArea() {                             // Переопределение метода
        int P = this.a + this.b + this.c;
        return Math.sqrt(P * (P - a) * (P - b) * (P - c));
    }

    @Override
    public Double calculatePerimeter() {            // Переопределение метода
        return (double) (this.a + this.b + this.c);

    }

}