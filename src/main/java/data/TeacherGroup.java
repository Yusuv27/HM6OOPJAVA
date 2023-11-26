package data;

import java.util.ArrayList;
import java.util.List;

public class TeacherGroup {
    protected List<Teacher> teacherList = new ArrayList<>();
    public TeacherGroup(ArrayList<Teacher>teacherList){
        this.teacherList=teacherList;
    }
    public void add(Teacher teacher){
        teacherList.add(teacher);
    }

    @Override
    public String toString() {
        String str = "\nГруппа учителей:"+"\n"+"*".repeat(60)+teacherList.toString().replace("[","").replace("]","").replace(",","")+"\n"+"*".repeat(60);
        return str;
    }
}