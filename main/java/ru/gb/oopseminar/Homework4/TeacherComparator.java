//package ru.gb.oopseminar.Homework4;
//
//import ru.gb.oopseminar.Homework4.Model.Student;
//import ru.gb.oopseminar.Homework4.Model.Teacher;
//import ru.gb.oopseminar.Homework4.Model.User;
//import ru.gb.oopseminar.Homework4.Service.UserService;
//import ru.gb.oopseminar.Homework4.impls.UserServiceImpl;
//
//import java.util.Comparator;
//import java.util.List;
//
//import static java.util.stream.Collectors.toList;
//import static ru.gb.oopseminar.Homework4.Model.Teacher.getGrade;
//
//public class TeacherComparator {
//
//    public List<Teacher> compareByGrade() {
//        UserService userService = new UserServiceImpl();
//        List<Teacher> teachers = userService.getAllUsers().stream()
//                .filter(Teacher.class::isInstance)
////                .sorted(Comparator.comparing(Teacher::i.getGrade()))
//                .toList();
//        return sortedTeachers;
//    }
//}