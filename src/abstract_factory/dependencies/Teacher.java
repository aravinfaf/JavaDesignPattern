package abstract_factory.dependencies;

public class Teacher implements Profession{
    @Override
    public void print() {
        System.out.println("Teacher");
    }
}
