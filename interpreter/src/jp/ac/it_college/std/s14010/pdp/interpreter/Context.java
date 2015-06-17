package jp.ac.it_college.std.s14010.pdp.interpreter;

import java.util.StringTokenizer;

/**
 * Created by s14010 on 15/06/18.
 */
public class Context {
    private StringTokenizer tokenizer;
    private String currentToken;
    public Context(String text) {
        tokenizer = new StringTokenizer(text);
        nextToken();
    }
    public String nextToken() {
        if (tokenizer.hasMoreElements()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }
        return currentToken;
    }
    public String currentToken() {
        return currentToken;
    }
    public void skipToken(String token) throws ParseException {
        if (!token.equals(currentToken)) {
            throw new ParseException("Warning: " + token + " is expected, but" + currentToken + " is found.");
        }
        nextToken();
    }
    public int currentNumber() throws ParseException {
        int number = 0;
        try{
            number = Integer.parseInt(currentToken);
        } catch (NumberFormatException e) {
            throw  new ParseException("warning:" + e);
        }
        return number;
    }
}
