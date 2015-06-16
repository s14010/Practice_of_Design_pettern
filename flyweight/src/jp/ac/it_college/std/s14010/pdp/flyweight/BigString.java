package jp.ac.it_college.std.s14010.pdp.flyweight;

/**
 * Created by s14010 on 15/06/17.
 */
public class BigString {
    private BigChar[] bigchars;
    public BigString(String string) {
        bigchars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }
    public void print() {
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i].print();
        }
    }
}
