public class PetTester{
    public static void main(String[] args){
    Dog dog1 = new Dog("Buddy",3,"Golden Retriever",60,"seeing eye");

    Cat cat1 = new Cat("Whiskers",2,"Siamese",10,true);

        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println();
        System.out.println("Total pets: " + Pet.getTotalPets());


    }
}
