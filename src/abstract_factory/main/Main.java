package abstract_factory.main;

import abstract_factory.factory.AbstractFactory;
import abstract_factory.factory.AbstractFactoryProducer;
import model.Profession;

public class Main {

    public static void main(String[] args) {

        AbstractFactory abstractFactory =  AbstractFactoryProducer.getProfession(true);
        Profession profession = abstractFactory.getProfession("Engineer");
        profession.print();

    }
}
