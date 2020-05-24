package aut.utcluj.isp.ex4;

import java.util.List;

/**
 * @author ashraf_sarhan
 *
 */
public class Constants {

    private List<Product> cardProducts;

    public Constants(List<Product> cardProducts) {
        this.cardProducts = cardProducts;
    }

    public void setCardProducts(List<Product> cardProducts) {
        this.cardProducts = cardProducts;
    }

}