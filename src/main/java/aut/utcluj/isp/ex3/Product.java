<<<<<<< HEAD:c4-samples/src/main/java/aut/utcluj/isp/ex3/Product.java
package aut.utcluj.isp.ex3;

import java.util.Objects;

/**
 * @author stefan
 */
public class Product {
    private String id;
    private String name;
    private Double price;

    public Product(String id, String name, Double price) {
        //throw new UnsupportedOperationException("Not supported yet.");
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, price);
    }
}

=======
package aut.utcluj.isp.ex3;

/**
 * @author stefan
 */
public class Product {
    private String id;
    private String name;
    private Double price;

    public Product(String id, String name, Double price) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
>>>>>>> a8b1f7187781f0950ba4fb2bcf23d8d604596271:src/main/java/aut/utcluj/isp/ex3/Product.java
