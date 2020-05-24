package aut.utcluj.isp.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author stefan
 */
public class UserCart implements ICartDetails {
    private List<Product> cardProducts;
    private double totalPrice;

    public UserCart() {
        this.totalPrice = 0;
        this.cardProducts = new ArrayList<>();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<Product> getCardProducts() {
        return cardProducts;
    }

    /**
     * Add new product to user cart
     *
     * @param product  - product to be added
     * @param quantity - number of products of the same type to be added
     */
    public void addProductToCart(final Product product, int quantity) {
        int i = 1;
        while (i <= quantity) {
            cardProducts.add(product);
            totalPrice += product.getPrice();
            i++;
        }
    }


    /**
     * Remove one product with product id from cart
     * If the product with desired id not found in the card, an {@link ProductNotFoundException} exception will be thrown
     *
     * @param productId - unique product id
     */
    public void removeProductFromCart(final String productId) throws ProductNotFoundException {
        int ok = 1;
        for (Product product : cardProducts) {
            if (product.getProductId().equals(productId)) {
                totalPrice -= product.getPrice();
                cardProducts.remove(product);
                ok = 0;
                break;
            }
        }
        if (ok == 1) {
            throw new ProductNotFoundException();
        }
    }

    /**
     * Reset user cart
     * Reset products and total price to default values
     */
    public void resetCart() {
        totalPrice = 0;
        cardProducts = new ArrayList<>();
    }

    @Override
    public String getCartDetails() {
        StringBuilder result = new StringBuilder();

        int quantity, i, j;
        for (i = 0; i < cardProducts.size(); i++) {
            quantity = 0;
            for (j = i; j < cardProducts.size(); j++) {
                if (cardProducts.get(i).equals(cardProducts.get(j))) {
                    quantity++;
                }
            }
            result.append("Product id: ").append(cardProducts.get(i).getProductId()).append(", Items: ").append(quantity).append("\n");
            i += quantity - 1;
        }
        result.append("Total price: ").append(totalPrice);

        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCart userCart = (UserCart) o;
        return Double.compare(userCart.totalPrice, totalPrice) == 0 &&
                Objects.equals(cardProducts, userCart.cardProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardProducts, totalPrice);
    }
}
