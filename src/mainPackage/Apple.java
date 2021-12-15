//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package mainPackage;

import java.util.Objects;

public class Apple extends Food {
    private String size;
    public static final String FOOD_NAME = "Яблоко";

    public Apple(String size) {
        super("Яблоко");
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void consume() {
        System.out.println(this + " съедено.");
    }

    public String toString() {
        return String.format("%s с размером '%s'", super.toString(), this.size.toUpperCase());
    }

    public int hashCode() {
        return Objects.hash(new Object[]{super.hashCode(), this.size});
    }
}
