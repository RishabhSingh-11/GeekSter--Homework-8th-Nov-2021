//1. Edit this code so the class Beagle is a subclass of the Dog class. When you run the code it should print “woof!” and then “arf arf”

class Dog
{
    public void speak()
    {
        System.out.println("woof!");
    }
}

class Beagle extends Dog
{
    @Override
    public void speak()
    {
        super.speak();
        System.out.println("arf arf");
    }
}


public class Doggy {
    public static void main(String[] args)
    {
        // 1st Way.......

//        Dog d = new Dog();
//        d.speak();
//        Dog b = new Beagle();
//        b.speak();

        // 2nd Way.......

        Beagle b = new Beagle();
        b.speak();
    }
}
