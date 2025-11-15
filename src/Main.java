@mojo // 확장 어노테이션 (의미 기반 실행)
public class Main {

    // Mojo-style function in Java syntax
    public static fn add(Int a, Int b) -> Int {
        return a + b;
    }

    public static fn main() {
        Int x = 10;
        Int y = 32;

        Int result = add(x, y);

        print("Mojo-like-Java Running...");
        print("10 + 32 = " + result);
    }

    // Built-in style print (Mojo Runtime)
    public static fn print(String s) {
        System.out.println(s);
    }

    public static fn print(String label, Int n) {
        System.out.println(label + n);
    }
}
