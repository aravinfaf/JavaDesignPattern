package abstract_factory.factory;

public class AbstractFactoryProducer {

   public static AbstractFactory getProfession(boolean isTrue){
        if (isTrue)
            return new TraineeProfessionAbstractFactory();
        else
            return new ProfessionAbstractFactory();
    }
}
