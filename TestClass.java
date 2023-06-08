public class TestClass {
    private int val = 1;

    private static int vals = 2;

    public void testMethod() {
        System.out.println("Hello from testmethod!");
        System.out.println(val);
    }

    public void setVal(int val) {
        this.val = val;
    }

    static public void testMethodStatic() {
        System.out.println("Hello from static testmethod!");
        System.out.println(vals);
    }

    static public void setVals(int vals) {
        TestClass.vals = vals;
    }
}
