public class Main {
    public static void main(String[] args) {

        System.out.println("Задача № 1");
        int age = 38;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задача № 2");
        int temp = 7;
        if (temp < 5) {
            System.out.println("На улице " + temp + " - нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " - можно идти без шапки");
        }

        System.out.println("Задача № 3");
        int speed = 55;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        System.out.println("Задача № 4");
        // Убедиться, что в коде проверяются все возрастные диапазоны и выводится соответствующее сообщение в консоль.
        int agePeople = 25;
        if (agePeople >= 2 && agePeople <= 6) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в садик");
        }
        if (agePeople >= 7 && agePeople <= 17) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в школу");
        }
        if (agePeople >= 18 && agePeople <= 24) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в университет");
        } else if (agePeople > 24) {
            System.out.println("Если возраст больше " + agePeople + ", то нужно выходить на работу");
        }
        // В коде проверяются все возрастные диапазоны и выводится соответствующее сообщение в консоль + добавлен оператор Else.

        System.out.println("Задача № 5");
        // Проверить, чтобы условные операторы корректно обрабатывали возраст ребенка и выводили нужное сообщение.
        int ageKind = 5;
        if (ageKind < 5) {
            System.out.println("Если возраст ребенка равен " + ageKind + ", то ему нельзя кататься на аттракционе");
        }
        if (ageKind >= 5 && ageKind < 14) {
            System.out.println("Если возраст ребенка " + ageKind + ", то ему можно кататься на аттракционе, только в сопровождении взрослого");
        } else if (ageKind >= 14) {
            System.out.println("Если возраст ребенка " + ageKind + ", то ему можно кататься на аттракционе без сопровождения");
        }
        //При постановке значений в переменную, условные операторы корректно обрабатывали возраст ребенка и выводят нужное сообщение + добавлен оператор Else.

        System.out.println("Задача № 6");
        // Убедиться, что проверка наличия мест в вагоне реализована и выводится соответствующее сообщение.
        int passengers = 101;
        if (passengers >= 102) {
            System.out.println("Если количество пассажиров в вагоне " + passengers + ", то места нет");
        } else if (passengers >= 60 && passengers < 102) {
            System.out.println("Если количество пассажиров в вагоне " + passengers + ", то в наличии места для проезда стоя");
        } else if (passengers < 60) {
            System.out.println("Если количество пассажиров в вагоне " + passengers + ", то в наличии места для проезда сидя");
        }
        // Проверка наличия мест в вагоне реализована, и выводится соответствующее сообщение.

        System.out.println("Задача № 7");
        // Проверить, чтобы код находил максимальное из трех чисел и выводил его в консоль.
        int one = 7;
        int two = 19;
        int three = 2;
        if (three > two && three > one) {
            System.out.println("Число " + three + " большее");
        } else if (two > three && two > one) {
            System.out.println("Число " + two + " большее");
        } else if (one > two && one > three) {
            System.out.println("Число " + one + " большее");
        }
        // Код находит максимальное из трех чисел и выводит его в консоль.
    }
}