public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        triangle.a = 10;
        triangle.b = 10;
        triangle.c = 20;

        System.out.println("Стороны треугольника равны: " + triangle.a + ", " + triangle.b + ", " + triangle.c );

        System.out.println("Периметр треугольника равен: " +  triangle.calculatePerimeter());

        System.out.println("Площадь треугольника равна: " + Math.ceil(triangle.calculateArea()));
    }

}