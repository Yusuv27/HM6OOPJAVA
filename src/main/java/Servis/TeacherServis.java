package Servis;

import Controller.Controller;
import data.Teacher;

import java.util.ArrayList;

public class TeacherServis {
    Controller controller = new Controller();
    public void TeacherServer(ArrayList<Teacher> teacherList){
        controller.Controller(teacherList);
    }
    public void createTeacher(String name,String object,Integer yea,Integer id){
        controller.createTeacher(name,object,yea,id);
    }
    public void redactorTeacher(String name,String object,Integer yea,Integer id){
        controller.redactorTeacher(name,object,yea,id);
    }

    @Override
    public String toString() {
        return controller+"";
    }
}