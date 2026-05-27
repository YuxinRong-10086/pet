public abstract class Pet{
    // Static variable
    private static int totalPets = 0;

    // Instance variables
    private String name;
    private int age;
    private String breed;
    private int weight;
    
    // Abstract method
    public abstract String getSpecies();

    // Static method
    public static int getTotalPets(){
    return totalPets;
    }

    public String getName(){
    return name;
    }

    public int getAge() {
    return age;
    }

    public String getBreed(){
    return breed;
    }

    public int getWeight(){
    return weight;
    }

    public void setName(String name){
    this.name = name;
    }

    public void setAge(int age){
    this.age = age;
    }

    public void setBreed(String breed){
    this.breed = breed;
    }

    public void setWeight(int weight){
    if (weight <= 0){
    throw new IllegalArgumentException( "Weight must be greater than 0.");
    }

    this.weight = weight;
    }

    public void addPet(){
    totalPets++;
    }

    public String toString(){
    return getSpecies() + ": " + name + ", Age: " + age + ", Breed: " + breed + ", Weight: " + weight;
    }
}
