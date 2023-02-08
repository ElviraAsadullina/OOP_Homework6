package ru.gb.oopseminar.Homework4;

import ru.gb.oopseminar.Homework4.Model.Student;
import ru.gb.oopseminar.Homework4.Model.Teacher;
import ru.gb.oopseminar.Homework4.Service.UserService;
import ru.gb.oopseminar.Homework4.impls.UserServiceImpl;


public class AddList {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
//        TeacherComparator tc = new TeacherComparator();
        Teacher t1 = new Teacher("Савченко Галина Степановна");
        Teacher t2 = new Teacher("Прокофьева Нина Петровна");
        userService.add(t1);
        userService.add(t2);
        userService.add(new Student("Афонасьев Иван", 4.92f, 11, t1));
        userService.add(new Student("Быкова Вероника", 4.52f, 11, t1));
        userService.add(new Student("Воробьев Павел", 2.12f, 10, t1));
        userService.add(new Student("Гусев Сергей", 5.00f, 7, t1));
        userService.add(new Student("Давыдова Инна", 4.11f, 9, t1));
        userService.add(new Student("Ершова Кристина", 3.92f, 4, t1));
        userService.add(new Student("Жиляев Алексей", 2.06f, 5, t2));
        userService.add(new Student("Пятеркина Дарья", 5.00f, 1, t2));
        userService.add(new Student("Нехорошев Сидор", 1.24f, 1, t2));
    }
}
