public class Ast {

    public enum NodeKind {
        Number,
        Binary,
        Identifier,
        Call
    }

    public static class Node {
        public NodeKind kind;
        public Node left;
        public Node right;
        public String value;

        public Node(NodeKind k) {
            this.kind = k;
        }

        public Node(NodeKind k, String v) {
            this.kind = k;
            this.value = v;
        }

        public Node(NodeKind k, Node l, Node r) {
            this.kind = k;
            this.left = l;
            this.right = r;
        }
    }
}
