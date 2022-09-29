package factory;

import model.Engineer;
import model.Profession;
import model.Teacher;

public class ProfessionFactory {

    public Profession getProfession(String str){
        if (str.equalsIgnoreCase("Teacher"))
            return new Teacher();
        else
            return new Engineer();
    }
}
