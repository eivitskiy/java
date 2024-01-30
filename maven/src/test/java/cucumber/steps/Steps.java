package cucumber.steps;

import dev.eivitskiy.Triangle;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import static org.junit.Assert.assertEquals;

public class Steps {


    private Throwable exception;

    Triangle triangle;
    public Steps() throws Exception {
        triangle = new Triangle(2,3,4);
    }

    @Дано("треугольник со сторонами {int}, {int}, {int}")
    public void треугольник_со_сторонами(Integer a, Integer b, Integer c) {
        try {
            new Triangle(a, b, c);
        } catch (Exception e) {
            this.exception = e;
        }
    }

    @Тогда("треугольник с данными сторонами существует")
    public void треугольник_с_данными_сторонами_существует() {
        System.out.println("Треугольник с данными сторонами существует");
    }

    @Когда("установить значение стороны a {int}")
    public void установить_значение_стороны_a(Integer a) {
        try {
            triangle.setA(a);
        } catch (Exception e) {
            this.exception = e;
        }
    }
    @Тогда("появляется предупреждение {string}")
    public void появляется_предупреждение(String string) {
        assertEquals(string, this.exception.getMessage());
    }
}
