//: HorrorShow.java
// Extending an interface with inheritance
package c07;

interface Monster {
    void menace();
}
interface DangerousMonster extends Monster {
    void destroy();
}
interface Lethal {
    void kill();
}
class DragonZilla implements DangerousMonster {
    public void menace() {
        System.out.println("Dragonzilla menace");
    }
    public void destroy() {
        System.out.println("Dragonzilla destroy");
    }
}
interface Vampire
        extends DangerousMonster, Lethal {
    void drinkBlood();
}
class Dracula implements Vampire {
    public void kill() {
        System.out.println("Dracula kill");
    }
    public void drinkBlood() {
        System.out.println("Dracula drinkBlood");
    }
    public void destroy() {
        System.out.println("Dracula destroy");
    }

    @Override
    public void menace() {
        System.out.println("Dracula menace");
    }
}
class HorrorShow {
    static void u(Monster b) { b.menace(); }
    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    static void w(Dracula d) {
        d.menace();
        d.drinkBlood();
        d.kill();
        d.destroy();
    }
    public static void main(String[] args) {
        DragonZilla if2 = new DragonZilla();
        u(if2);
        v(if2);
        Dracula if3 = new Dracula();
        u(if3);
        v(if3);
        w(if3);
    }
} ///:~