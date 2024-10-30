public class Dog extends Animal {
    private String owner;
    public Dog(String color, String owner) {
        super(color);
        this.owner = owner;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    @Override
    public void eat() {
        System.out.println("Eat both bread and meat");
    }

    public void bark() {
        System.out.println("A dog can bark");-
        
    }
}