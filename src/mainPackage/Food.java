//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package mainPackage;

import java.util.Objects;

public abstract class Food implements Consumable {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Food)) {
            return false;
        } else if (Objects.isNull(this.name)) {
            return false;
        } else {
            Food food = (Food)obj;
            return this.name.equals(food.name);
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name});
    }
}
