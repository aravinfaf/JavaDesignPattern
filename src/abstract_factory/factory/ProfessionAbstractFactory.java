package abstract_factory.factory;

import abstract_factory.dependencies.Engineer;
import abstract_factory.dependencies.Profession;
import abstract_factory.dependencies.Teacher;

public class ProfessionAbstractFactory extends AbstractFactory{

    @Override
    public Profession getProfession(String str) {
         if(str.equalsIgnoreCase("Engineer"))
             return new Engineer();
         else if (str.equalsIgnoreCase("Teacher"))
             return new Teacher();
        return null;
    }
}
