package jp.ac.it_college.std.s14010.pdp.factory.framework;

/**
 * Created by s14010 on 15/06/04.
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
