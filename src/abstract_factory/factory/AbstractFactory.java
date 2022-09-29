package abstract_factory.factory;

import abstract_factory.dependencies.Profession;

public abstract class AbstractFactory {
    public abstract Profession getProfession(String str);
}
