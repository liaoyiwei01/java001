//: Adventure.java
// Multiple interfaces
package c07;
import java.util.*;
interface CanFight {
    void fight();
}
interface CanSwim {
    void swim();
}
interface CanFly {
    void fly();
}
class ActionCharacter {
    public void fight() {
        System.out.println("ActionCharacter fight");
    }
}
class Hero extends ActionCharacter
        implements CanFight, CanSwim, CanFly {
    public void swim() {
        System.out.println("Hero swim");
    }
    public void fly() {
        System.out.println("Hero fly");
    }
}
public class Adventure {
    static void t(CanFight x) { x.fight(); }
    static void u(CanSwim x) { x.swim(); }
    static void v(CanFly x) { x.fly(); }
    static void w(ActionCharacter x) { x.fight(); }
    public static void main(String[] args) {
        Hero i = new Hero();
        t(i); // Treat it as a CanFight
        u(i); // Treat it as a CanSwim
        v(i); // Treat it as a CanFly
        w(i); // Treat it as an ActionCharacter
    }
} ///:~