package abstract_factory.factory;

import model.Profession;
import model.TraineeEngineer;
import model.TraineeTeacher;

public class TraineeProfessionAbstractFactory extends AbstractFactory{

    @Override
    public Profession getProfession(String str) {
         if(str.equalsIgnoreCase("Engineer"))
             return new TraineeEngineer();
         else if (str.equalsIgnoreCase("Teacher"))
             return new TraineeTeacher();
        return null;
    }
}
