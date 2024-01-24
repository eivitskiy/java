import java.util.Arrays;
import java.util.Random;

public class VariablesTheme {

    public static void main(String[] args) {
        // простой способ замены всех пробелов на _ (так же работает с подстроками)
        System.out.println(
                "Я хотел бы ветром быть".replaceAll(" ", "_")
        );

        VariablesTheme vt = new VariablesTheme();
        // спобос с использованием StringBuilder - добавил ещё параметр
        System.out.println(vt.myReplace("2021-12-05", "-", "#"));

        // ещё пример вызова, функция здесь для простоты вызова
        // такое форматирование просто для комментариев
        System.out.println(
                vt.myReplace(
                        "В лесу родилась ёлочка, в лесу она росла", // строка в которой будем заменять
                        " ", // строка (в данном случае символ) которую будем менять
                        "$$$" // строка (или символ) на которые будем заменять
                )
        );
    }

    public String myReplace(String str, String replace, String replacement) {
        StringBuilder sb = new StringBuilder(); // создаём объект StringBuilder

        sb.append(str); // добавляем в конец контента нашего объекта строку из параметров метода, до этого содержимое объекта - пустая строка

        int startIndex, endIndex;   // объявили переменные для индексов поиска

        do {
            startIndex = sb.indexOf(replace);   // ищем в нашем объекте строку replace (пришла в параметрах вызова)
            /*
             * условие ниже необходимо чтобы не производить замену
             * если вхождение не найдено
             * оно сработает когда все вхождения были заменены
             */
            if (startIndex > 0) {
                endIndex = startIndex + replace.length();   // индекс окончания подстроки - это индекс начала подстроки и длина того чем заменяем
                                                            // например в строке `Мороз и солнце` ищем `солнце`
                                                            // startIndex будет 8, а endIndex - 8+6=14

                sb = sb.replace(startIndex, endIndex, replacement); // заменяем содержимое в соответствии с индексами
            }
        } while (startIndex > -1);  // выполнять пока найдено вхождение, если индекс -1 значит не нашли

        return sb.toString();   // превращаем объект StringBuilder в базовый тип String чтобы затем его вывести на экран
    }
}
