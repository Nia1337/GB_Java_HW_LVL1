package HomeWork5;

//        1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//        2. Конструктор класса должен заполнять эти поля при создании объекта.
//        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в
//        консоль.
//        4. Создать массив из 5 сотрудников.
//        Пример:
//        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//        persArray[0] = new Person("Ivanov Ivan", "Engineer", "i vivan@mailbox.com" , "892312312",
//        30000, 30); // потом для каждой ячейки массива задаем объект
//        persArray[1] = new Person(...);
//        ...
//        persArray[4] = new Person(...);
//        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

public class HomeWork5 {

    public static void main(String[] args) {
        Сотрудник[] arr = new Сотрудник[5];
                arr[0] = new Сотрудник("Иванов Иван Иванович","Стажёр","IvanI@mail.ru","89992223311",30000,25);
                arr[1] = new Сотрудник("Дмитриенко Дмитрий Дмитриевич","Инженер","Dima@mail.ru","89992223312",55000,41);
                arr[2] = new Сотрудник("Порошков Максим Максимович","Главный Инженер","Maks@mail.ru","89992223313",80000,62);
                arr[3] = new Сотрудник("Гуляев Иван Иванович","Инженер","GuIvan@yandex.ru","89992223314",45000,34);
                arr[4] = new Сотрудник("Кошкин Генадий Юрьевич","Заместитель Главного Инженера","Ura@gmail.com","89992223315",68000,50);

        for (int i = 0; i < 5; i++) {
            if ((arr[i].getВозраст()) > 40) {
                arr[i].info();
            }
        }

    }
}

class Сотрудник {
    private String ФИО;
    private String должность;
    private String email;
    private String телефон;
    private double зарплата;
    private int возраст;

    public Сотрудник(String ФИО, String должность, String email, String телефон, double зарплата, int возраст) {
        this.ФИО = ФИО;
        this.должность = должность;
        this.email = email;
        this.телефон = телефон;
        this.зарплата = зарплата;
        this.возраст = возраст;
    }

    int getВозраст() {
        return возраст;
    }

     void info() {
        System.out.println(ФИО +" "+ должность +" "+ email +" "+ телефон +" "+ зарплата +" "+ возраст);
    }
}
