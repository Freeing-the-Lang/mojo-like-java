public class Lexer {

    private final String src;
    private int pos = 0;

    public Lexer(String s) {
        this.src = s;
    }

    public String next() {
        if (pos >= src.length())
            return null;

        char c = src.charAt(pos++);
        
        if ("+-*/".indexOf(c) >= 0)
            return Character.toString(c);

        if (Character.isDigit(c)) {
            StringBuilder sb = new StringBuilder();
            sb.append(c);
            while (pos < src.length() && Character.isDigit(src.charAt(pos))) {
                sb.append(src.charAt(pos++));
            }
            return sb.toString();
        }

        return Character.toString(c);
    }
}
