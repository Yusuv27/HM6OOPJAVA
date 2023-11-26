package View;

import Servis.TeacherServis;

public class TeacherView {
    TeacherServis teacherServis = new TeacherServis();
    public TeacherView(TeacherServis ts){
        this.teacherServis=ts;
        System.out.println("\n"+ts);
    }
    public void tv(){
        System.out.println("\n"+teacherServis);
    }
}
