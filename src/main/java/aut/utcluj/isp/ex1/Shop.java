<<<<<<< HEAD:c4-samples/src/main/java/aut/utcluj/isp/ex1/Shop.java
package aut.utcluj.isp.ex1;

import java.util.Objects;

/**
 * @author stefan
 */
public class Shop {
    private String name;
    private String city;

    public Shop(String name, String city) {
        //throw new UnsupportedOperationException("Not supported yet.");
        this.name = name;
        this.city = city;
    }

    public Shop(String name) {
        this.city = "";
        //throw new UnsupportedOperationException("Not supported yet.");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shop)) return false;
        Shop shop = (Shop) o;
        return Objects.equals(name, shop.name) &&
                Objects.equals(city, shop.city);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, city);
    }

    @Override
    public String toString() {
        return "Shop: " + name +
                " City: " + city;
    }
}
=======
package aut.utcluj.isp.ex1;

/**
 * @author stefan
 */
public class Shop {
    private String name;
    private String city;

    public Shop(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Shop(String name) {
        this.city = "";
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
>>>>>>> a8b1f7187781f0950ba4fb2bcf23d8d604596271:src/main/java/aut/utcluj/isp/ex1/Shop.java
