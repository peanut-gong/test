import java.util.Objects;

/**
 * 这是一个狗类
 * @author Administrator
 */
public class Dog {
    private String name;
    private String color;
    private String food;

    public Dog() {
    }

    public Dog(String name, String color, String food) {
        this.name = name;
        this.color = color;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) &&
                Objects.equals(color, dog.color) &&
                Objects.equals(food, dog.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, food);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}
