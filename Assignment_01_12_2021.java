// Assignment of (01/12/2021) class taken by Jay Sir !

class Animal{

    // data member / instance Variable

    String landAnimal;
    String waterAnimal;
    String landAndWaterAnimal;
    static int age;
    static int count = 0;

    // Constructors with Constructor Chaining

    public Animal(){
        this("Dog", "Fish");
        System.out.println("Default Construction");
    }

    public Animal(String landAnimal, String waterAnimal) {
        this("Tiger", "CatFish", "Anaconda");
        this.landAnimal = landAnimal;
        this.waterAnimal = waterAnimal;
    }

    public Animal(String landAnimal, String waterAnimal, String landAndWaterAnimal) {
        this.landAnimal = landAnimal;
        this.waterAnimal = waterAnimal;
        this.landAndWaterAnimal = landAndWaterAnimal;
        System.out.println("landAnimal: "+landAnimal+" waterAnimal: "+waterAnimal+" landAndWaterAnimal: "+landAndWaterAnimal);
    }

    //member methods

    public void canFly(){
        System.out.println("Animal can Fly");
    }

    public void canRun(){
        System.out.println("Animal can Run");
    }

    public void canSwim(){
        System.out.println("Animal can Swim");
    }

    // Auto generated getters & Setters


    public String getLandAnimal() {
        return landAnimal;
    }

    public void setLandAnimal(String landAnimal) {
        this.landAnimal = landAnimal;
    }

    public String getWaterAnimal() {
        return waterAnimal;
    }

    public void setWaterAnimal(String waterAnimal) {
        this.waterAnimal = waterAnimal;
    }

    public String getLandAndWaterAnimal() {
        return landAndWaterAnimal;
    }

    public void setLandAndWaterAnimal(String landAndWaterAnimal) {
        this.landAndWaterAnimal = landAndWaterAnimal;
    }

    //static Method for counting as a break point......

    public static void incrementAge(){
        System.out.println("age is "+age+" count is "+count);
        count++;
    }
}



public class Assignment_01_12_2021 {
    public static void main(String[] args) {

        Animal dog=new Animal();
        dog.landAnimal="American Dog";
        System.out.println("Dog breed is "+dog.landAnimal);
        dog.canSwim();
        Animal.age=18;
        Animal.incrementAge();
        Animal cat=new Animal();
        cat.canRun();
        Animal.age=20;
        Animal.incrementAge();
        Animal cow=new Animal();
        cow.canFly();
        Animal.age=22;
        Animal.incrementAge();
        Animal Elephant = new Animal();

    }
}
