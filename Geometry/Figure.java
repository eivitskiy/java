public class Figure {
    public static void main(String[] args) throws Exception {
        /*
         * при указании типа переменной можно использовать
         * интерфейс как здесь (т.к. класс реализует этот интерфейс)
         * или прям конкретный класс
         * Здесь могло быть так:
         * Circle circle = new Circle(1.23);
         */ 
        GeometricFigureInterface circle = new Circle(1.23);

        System.out.println("Круг:");
        System.out.println(" - площадь: " + circle.area());
        System.out.println(" - периметр: " + circle.perimeter());

        GeometricFigureInterface rectangle = new Rectangle(2.0, 3.0);
        System.out.println("Прямоугольник:");
        System.out.println(" - площадь: " + rectangle.area());
        System.out.println(" - периметр: " + rectangle.perimeter());

        GeometricFigureInterface triangle = new Triangle(3, 4, 5);
        System.out.println("Треугольник:");
        System.out.println(" - площадь: " + triangle.area());
        System.out.println(" - периметр: " + triangle.perimeter());
    }
}
