package c09;

//: LostMessage.java
// How an exception can be lost
class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}
class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}
public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }
    public static void main(String[] args)
            throws Exception {
        LostMessage lm = new LostMessage();
        try {
            lm.f();
//            lm.dispose();
//        } catch (VeryImportantException e) {
//            System.out.println("VeryImportantException is caught");
//        } catch (HoHumException e) {
//            System.out.println("HoHumException is caught");
//        } catch (Exception e) {
//            System.out.println("Exception is caught");
        } finally {
            lm.dispose();
        }
    }
} ///:~