<<<<<<< HEAD:c4-samples/src/main/java/aut/utcluj/isp/ex3/StockController.java
package aut.utcluj.isp.ex3;

import java.util.*;

/**
 * @author stefan
 */
public class StockController {
    private Map<String, List<Product>> catalogue = new HashMap<>();

    public StockController() {
    }

    public StockController(Map<String, List<Product>> catalogue) {
        this.catalogue = catalogue;
    }

    public void setCatalogue(Map<String, List<Product>> catalogue) {
        this.catalogue = catalogue;
    }


    /**
     * Add product to catalogue
     *
     * @param product  - product information
     * @param quantity - number of times the product should be added
     * @apiNote: if products with the same products id already exists, assume that @param product has the same data
     */
    public void addProductToCatalogue(final Product product, final int quantity) {
        // throw new UnsupportedOperationException("Not supported yet.");
        if (catalogue.containsKey(product.getId())) {
            System.out.println("This product already exists!");
        } else {
            catalogue.put(product.getId(), new ArrayList<>());
        }
        for (int i = 0; i < quantity; i++) {
            catalogue.get(product.getId()).add(product);
        }


    }

    /**
     * Return catalogue information
     *
     * @return dictionary where the key is the product id and the value is an array of products with the same id
     */
    public Map<String, List<Product>> getCatalogue() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return this.catalogue;
    }

    /**
     * Return all the products with particular id
     *
     * @param productId - unique product id
     * @return - list of existing products with same id or null if not found
     */
    public List<Product> getProductsWithSameId(final String productId) {
        if (catalogue.containsKey(productId)) {
            return catalogue.get(productId);
        } else {
            return null;
        }


    }

    /**
     * Get total number of products from catalogue
     *
     * @return
     */
    public int getTotalNumberOfProducts() {

        //throw new UnsupportedOperationException("Not supported yet.");
        int numberOfProducts = 0;
        for (List<Product> products : catalogue.values()) {
            numberOfProducts += products.size();
        }
        return numberOfProducts;


    }

    /**
     * Remove all products with same product id
     *
     * @param productId - unique product id
     * @return true if at least one product was deleted or false instead
     */
    public boolean removeAllProductsWitProductId(final String productId) {
        // throw new UnsupportedOperationException("Not supported yet.");
        if (catalogue.containsKey(productId)) {
            catalogue.remove(productId);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Update the price for all the products with same product id
     *
     * @param productId - unique product id
     * @param price     - new price to be added
     * @return true if at least one product was updated or false instead
     */
    public boolean updateProductPriceByProductId(final String productId, final Double price) {
        // throw new UnsupportedOperationException("Not supported yet.");
        if (catalogue.containsKey(productId)) {
            for (Product product : catalogue.get(productId)) {
                product.setPrice(price);
            }
            return true;
        } else {
            return false;
        }
    }
}
=======
package aut.utcluj.isp.ex3;

import java.util.List;
import java.util.Map;

/**
 * @author stefan
 */
public class StockController {
    /**
     * Add product to catalogue
     *
     * @param product  - product information
     * @param quantity - number of times the product should be added
     * @apiNote: if products with the same products id already exists, assume that @param product has the same data
     */
    public void addProductToCatalogue(final Product product, final int quantity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Return catalogue information
     *
     * @return dictionary where the key is the product id and the value is an array of products with the same id
     */
    public Map<String, List<Product>> getCatalogue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Return all the products with particular id
     *
     * @param productId - unique product id
     * @return - list of existing products with same id or null if not found
     */
    public List<Product> getProductsWithSameId(final String productId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Get total number of products from catalogue
     *
     * @return
     */
    public int getTotalNumberOfProducts() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Remove all products with same product id
     *
     * @param productId - unique product id
     * @return true if at least one product was deleted or false instead
     */
    public boolean removeAllProductsWitProductId(final String productId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Update the price for all the products with same product id
     *
     * @param productId - unique product id
     * @param price     - new price to be added
     * @return true if at least one product was updated or false instead
     */
    public boolean updateProductPriceByProductId(final String productId, final Double price) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
>>>>>>> a8b1f7187781f0950ba4fb2bcf23d8d604596271:src/main/java/aut/utcluj/isp/ex3/StockController.java
