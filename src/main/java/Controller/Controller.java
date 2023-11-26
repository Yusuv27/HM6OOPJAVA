package Controller;

import data.Teacher;

import java.util.ArrayList;
import java.util.List;
public class Controller {
    private static List<Teacher> stream = new ArrayList<>();
    public void createTeacher(String name,String object,Integer yea,Integer id){
        stream.add(new Teacher(name,object,yea,id));
    }
    public static Teacher getTeacher(Integer id){
        for (Teacher teacher:stream) {
            if(teacher.getId()==id){
                return teacher;
            }
        }
        return null;
    }
    public void redactorTeacher(String name,String object,Integer yea,Integer id){
        getTeacher(id).setName(name);
        getTeacher(id).setObject(object);
        getTeacher(id).setYea(yea);
    }
    public Controller(ArrayList<Teacher>teacherList){
        stream=teacherList;
    }
    public Controller(){}
    public void Controller(ArrayList<Teacher>teacherList){
        stream=teacherList;
    }

    public List<Teacher> getStream() {
        return stream;
    }

    public static void setStream(List<Teacher> stream) {
        Controller.stream = stream;
    }

    @Override
    public String toString() {
        String str = stream.toString().replace("[","").replace("]","").replace(",","");
        return str;
    }
}
