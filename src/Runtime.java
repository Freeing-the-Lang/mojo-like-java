public class Runtime {

    public static Int eval(Ast.Node node) {
        switch (node.kind) {
            case Number:
                return Int.parse(node.value);

            case Binary:
                Int l = eval(node.left);
                Int r = eval(node.right);

                switch (node.value) {
                    case "+": return l + r;
                    case "-": return l - r;
                    case "*": return l * r;
                    case "/": return l / r;
                }
        }
        throw new RuntimeException("Invalid AST node");
    }
}
