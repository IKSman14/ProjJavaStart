public class Basa {
    static {
        System.out.println("static");
    }

    {
        System.out.println("Based");
    }
    public int a;
    public int b;
    public int c;


    @Override
    public String toString() {
        return "Basa{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public Basa(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
