package abstract_factory.factory;

import abstract_factory.dependencies.*;

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
