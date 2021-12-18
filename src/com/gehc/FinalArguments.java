package com.gehc;

import java.util.*;

//: FinalArguments.java
// Using "final" with method arguments
class Gizmo {
    public void spin() {
    }
}

public class FinalArguments {
    Vector<Integer> v = new Vector<Integer>();
    Stack<Gizmo> s = new Stack<Gizmo>();
    Hashtable<Integer, Gizmo> ht = new Hashtable<Integer, Gizmo>();
    Vector v1 = new Vector();
    Stack s1 = new Stack();
    Hashtable ht1 = new Hashtable();


    void with(final Gizmo g) {
//! g = new Gizmo(); // Illegal -- g is final
        g.spin();
        v.add(Integer.valueOf(1));
    }
    void without(Gizmo g) {
        g = new Gizmo(); // OK -- g not final
        g.spin();
    }
    // void f(final int i) { i++; } // Can't change
// You can only read from a final primitive:
    int g(final int i) { return i + 1; }
    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(new Gizmo());
        bf.with(null);

    }
} ///:~