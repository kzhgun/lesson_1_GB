package Lesson_1;


public class MyClass {
    private static int p = -1;

    public static void main(String[] args) {
        // Объявление переменных
        int q;
        byte b;
        short c;
        long l;
        float f;
        double d;
        boolean bool;
        char k;
        String m;
        // Инициализация переменных
        q = 4;
        b = 10;
        c = 24;
        l = 1500L;
        f = 12.0f;
        d = 16.445;
        bool = true;
        k = 'M';
        System.out.println(q + b + c + l + f + d);
        System.out.println(k);
        q = eq(1, 2, 8, 4);
        System.out.println(q);
        bool = logic_if(5,3);
        System.out.println(bool);
        param();
        bool = logic_num(-5);
        System.out.println(bool);
        stroka("Дружок");
        year(2020);
    }
//Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
// где a, b, c, d – входные параметры этого метода;
    static int eq(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
// Написать метод, принимающий на вход два числа, и проверяющий, что их сумма лежит в пределах от 10 до 20
// (включительно), если да – вернуть true, в противном случае – false;
    static boolean logic_if(int a, int b)
    {
        return ((a + b) >= 10) && ((a + b) <= 10);
    }
// Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
// положительное число передали или отрицательное (Замечание: ноль считаем положительным числом.)
    static <p> void param(){
       if(p < 0){
           System.out.println("Отрицательное");
       }
       else {
           System.out.println("Положительное");
       }
    }
//Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true,
// если число отрицательное;
    static boolean logic_num(int a)
    {
        return a<0;
    }
// Написать метод, которому в качестве параметра передается строка, обозначающая имя,
// метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    static void stroka(String m){
        System.out.println("Привет,"+ m + "!");
    }
//Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    static void year(int y){
        if (((y % 4 == 0) && !(y % 100 == 0)) || (y % 400 == 0)){
            System.out.println("Високосный год");
        }
        else {
            System.out.println("Обычный год");
        }
    }
}
// Не набирая код в IDE, ответьте на следующий вопрос. Есть два метода:
//
//void myMethod(int a, String b) {}
//void myMethod(String b, int a) {}
// Разные методы с одинаковыми именами