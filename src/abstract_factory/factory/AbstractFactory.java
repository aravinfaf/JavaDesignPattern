package abstract_factory.factory;

import model.Profession;

public abstract class AbstractFactory {
    public abstract Profession getProfession(String str);
}
