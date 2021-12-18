package c07;

//: Sandwich.java
// Order of constructor calls
class Meal {
    Meal() { System.out.println("Meal()"); }
}
class Bread {
    Bread() { System.out.println("Bread()"); }
}
class Cheese {
    Cheese() { System.out.println("Cheese()"); }
}
class Lettuce {
    Lettuce() { System.out.println("Lettuce()"); }
}
class Lunch extends Meal {
    Lunch() { System.out.println("Lunch()");}
}
class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}
class Sandwich extends PortableLunch {
    Sandwich() {
        System.out.println("Sandwich()");
        c = new Cheese();
    }
    Bread b = new Bread();
    Cheese c;
    Lettuce l = new Lettuce();
    public static void main(String[] args) {
        new Sandwich();
    }
} ///:~