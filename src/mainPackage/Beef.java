//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package mainPackage;

import java.util.Locale;
import java.util.Objects;

public class Beef extends Food {
    private String preparedness;
    public static final String FOOD_NAME = "Говядина";

    public Beef(String preparedness) {
        super("Говядина");
        this.preparedness = preparedness;
    }

    public String getPreparedness() {
        return this.preparedness;
    }

    public void setPreparedness(String preparedness) {
        this.preparedness = preparedness;
    }

    public void consume() {
        System.out.println(this + " съедена.");
    }

    public String toString() {
        return String.format("%s с готовностью '%s'", super.toString(), this.preparedness.toUpperCase(Locale.ROOT));
    }

    public int hashCode() {
        return Objects.hash(new Object[]{super.hashCode(), this.preparedness});
    }
}
