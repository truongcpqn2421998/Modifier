class ChuNhat {
    public int rong, dai;

    public ChuNhat(int rong, int dai) {
        this.rong = rong;
        this.dai = dai;
    }
}
public class MyClass {
    //    static public int X = 2;
//
//    static {
//        X = 1;
//    }
//
//    static public void method() {
//        X = 5;
//    }
//
//    public static void main(String[] args) {
//        MyClass o = new MyClass();
//        MyClass.method();
//        MyClass.X = 10;
//        System.out.printf("x=%d, y=%d", o.X, MyClass.X);
//    }
//static public int X = 2;
//
//    public static void main(String[] args) {
//        MyClass o1 = new MyClass();
//        MyClass o2 = new MyClass();
//        o2.X = 5;
//        System.out.printf("x=%d, y=%d, z=%d", o1.X, o2.X, MyClass.X);
//    }
    void method(ChuNhat x) {
        x.rong = 5;
        x.dai = 5;
    }

    public static void main(String[] args) {
        MyClass o = new MyClass();
        ChuNhat cn = new ChuNhat(1, 1);
        o.method(cn);
        System.out.printf("x=%d, y=%d", cn.rong, cn.dai);
    }
}

