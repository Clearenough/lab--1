//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package mainPackage;

public class Main {
    public Main() {
    }

    static void countFoods(Food[] breakfast) {
        int CheeseType = 0;
        int AppleType = 0;
        int BeefType = 0;
        Cheese CompC = new Cheese();
        Beef CompB = new Beef((String)null);
        Apple CompA = new Apple((String)null);

        for(int i = 0; i < breakfast.length && breakfast[i] != null; ++i) {
            if (breakfast[i].equals(CompC)) {
                ++CheeseType;
            } else if (breakfast[i].equals(CompB)) {
                ++BeefType;
            } else if (breakfast[i].equals(CompA)) {
                ++AppleType;
            }
        }

        System.out.println("Ваш завтрак состоит из " + AppleType + " яблок, " + BeefType + " кусков мяса и " + CheeseType + " ломтиков сыра.");
    }

    public static void main(String[] args) {
        Food[] breakfast = new Food[20];

        for(int itemIndex = 0; itemIndex < args.length; ++itemIndex) {
            String[] parts = args[itemIndex].split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemIndex] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[itemIndex] = new Apple(parts[1]);
            } else if (parts[0].equals("Beef")) {
                breakfast[itemIndex] = new Beef(parts[1]);
            }
        }

        countFoods(breakfast);
        Food[] var6 = breakfast;
        int var7 = breakfast.length;

        for(int var4 = 0; var4 < var7; ++var4) {
            Food item = var6[var4];
            if (item == null) {
                break;
            }

            item.consume();
        }

        System.out.println("Всего хорошего!");
    }
}
