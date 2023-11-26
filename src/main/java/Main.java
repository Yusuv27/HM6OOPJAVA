import Servis.TeacherServis;
import View.TeacherView;
import data.Teacher;
import data.TeacherGroup;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Ivan1","IT",25,1);
        Teacher teacher2 = new Teacher("Ivan2","IT",25,2);
        Teacher teacher3 = new Teacher("Ivan3","IT",25,3);
        Teacher teacher4 = new Teacher("Ivan4","IT",25,4);

        TeacherServis ts = new TeacherServis();
        ts.TeacherServer(new ArrayList(List.of(teacher1,teacher2,teacher3)));
        ts.createTeacher("Ivan4","IT",25,4); // Создание учителя
        TeacherView tv = new TeacherView(ts);
        ts.redactorTeacher("Ivan1_new","IT",25,1);//Редактирование по id
        tv.tv();

        TeacherGroup tg = new TeacherGroup(new ArrayList(List.of(teacher1))); // Отдельная группа учителей
        tg.add(teacher2);
        System.out.println(tg);
    }
}