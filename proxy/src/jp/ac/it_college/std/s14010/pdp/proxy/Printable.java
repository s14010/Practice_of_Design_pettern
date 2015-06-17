package jp.ac.it_college.std.s14010.pdp.proxy;

/**
 * Created by s14010 on 15/06/17.
 */
public interface Printable {
    public abstract void setPrinterName(String name);
    public abstract String getPrinterName();
    public abstract void print (String string);
}
