package abstract_factory.main;

import abstract_factory.dependencies.Profession;
import abstract_factory.factory.AbstractFactory;
import abstract_factory.factory.AbstractFactoryProducer;

public class Main {

    public static void main(String[] args) {

        AbstractFactory abstractFactory =  AbstractFactoryProducer.getProfession(false);
        Profession profession = abstractFactory.getProfession("Engineer");
        profession.print();

    }
}
