<<<<<<< HEAD:c4-samples/src/main/java/aut/utcluj/isp/ex4/User.java
package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public class User {
    private UserCart userCart;
    private Double userMoney;

    public User(Double userMoney) {
        this.userMoney = userMoney;
    }

    public UserCart getUserCart() {
        return userCart;
    }

    public Double getUserMoney() {
        return userMoney;
    }

    /**
     * Add product to the cart
     *
     * @param product  - product to be added
     * @param quantity - quantity to be added
     */
    public void addProductToCart(Product product, int quantity) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Remove product from cart
     * An {@link ProductNotFoundException} exception should be thrown if no product with desired productId is found
     *
     * @param productId - unique product id
     */
    public void removeProductFromCart(final String productId) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Submit cart details
     * Total price of the products should be extracted from userMoney
     * If userMoney is less than total price of the products, an {@link NotEnoughMoneyException} exception will be thrown
     * If userMoney is greater or equal to the total price of the products, total price should be extracted from total money and cart to be reset to default values
     */
    public void submitCart() {
       // throw new UnsupportedOperationException("Not supported yet.");
      //  System.out.println();
    }
}
=======
package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public class User {
    private UserCart userCart;
    private Double userMoney;

    public User(Double userMoney) {
        this.userMoney = userMoney;
        this.userCart = new UserCart();
    }

    public UserCart getUserCart() {
        return userCart;
    }

    public Double getUserMoney() {
        return userMoney;
    }

    /**
     * Add product to the cart
     *
     * @param product  - product to be added
     * @param quantity - quantity to be added
     */
    public void addProductToCart(Product product, int quantity) {
        userCart.addProductToCart(product, quantity);
    }

    /**
     * Remove product from cart
     * An {@link ProductNotFoundException} exception should be thrown if no product with desired productId is found
     *
     * @param productId - unique product id
     */
    public void removeProductFromCart(final String productId) throws ProductNotFoundException {

        userCart.removeProductFromCart(productId);

    }

    /**
     * Submit cart details
     * Total price of the products should be extracted from userMoney
     * If userMoney is less than total price of the products, an {@link NotEnoughMoneyException} exception will be thrown
     * If userMoney is greater or equal to the total price of the products, total price should be extracted from total money and cart to be reset to default values
     */
    public void submitCart() throws NotEnoughMoneyException {
        if (userMoney < userCart.getTotalPrice()) {
            throw new NotEnoughMoneyException();
        } else if (userMoney >= userCart.getTotalPrice()) {
            userMoney = userMoney - userCart.getTotalPrice();
            userCart.resetCart();
        }
    }

}
>>>>>>> a8b1f7187781f0950ba4fb2bcf23d8d604596271:src/main/java/aut/utcluj/isp/ex4/User.java
