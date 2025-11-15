public class Parser {

    private final Lexer lexer;
    private String current;

    public Parser(Lexer l) {
        this.lexer = l;
        this.current = lexer.next();
    }

    private void eat() {
        current = lexer.next();
    }

    public Ast.Node parseExpr() {
        Ast.Node left = parsePrimary();

        while (current != null && "+-*/".contains(current)) {
            String op = current;
            eat();
            Ast.Node right = parsePrimary();
            Ast.Node node = new Ast.Node(Ast.NodeKind.Binary, op);
            node.left = left;
            node.right = right;
            left = node;
        }

        return left;
    }

    private Ast.Node parsePrimary() {
        String tok = current;
        eat();
        return new Ast.Node(Ast.NodeKind.Number, tok);
    }
}
