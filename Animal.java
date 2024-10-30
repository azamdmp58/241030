public class Animal {
    private String color;
    public Animal() {}
    public Animal(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void eat() {
        System.out.println("I can eat");
    }
}