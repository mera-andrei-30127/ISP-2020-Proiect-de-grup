package aut.utcluj.isp.ex4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Controller implements ActionListener {

    private JTextField product;
    private JTextField productQuantity;
    private JTextField productPrice;
    private int option;
    private UserCart userCart;
    private Double userMoney;
    private List<Product> cardProducts;
    private double totalPrice;

    public Controller(JTextField product, JTextField productQuantity, JTextField productPrice, int option, UserCart userCart, double userMoney, List<Product> cardProducts, double totalPrice) {
        super();
        this.product = product;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.option = option;
        this.cardProducts = cardProducts;
        this.totalPrice = totalPrice;
        this.userCart = userCart;
        this.userMoney = userMoney;
    }

    public Controller(JTextField product, JTextField productPrice, int option, UserCart userCart, double userMoney, List<Product> cardProducts, double totalPrice) {
        super();
        this.product = product;
        this.productPrice = productPrice;
        this.option = option;
        this.cardProducts = cardProducts;
        this.totalPrice = totalPrice;
        this.userCart = userCart;
        this.userMoney = userMoney;
    }

    public Controller(int option, UserCart userCart, double userMoney, List<Product> cardProducts, double totalPrice) {
        super();
        this.option = option;
        this.cardProducts = cardProducts;
        this.totalPrice = totalPrice;
        this.userCart = userCart;
        this.userMoney = userMoney;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (option) {
            case 1: {
                String productId = product.getText();
                String quantity = productQuantity.getText();
                String price = productPrice.getText();
                Product product = new Product(productId, Double.valueOf(price));
                userCart.addProductToCart(product, Integer.parseInt(quantity));
                cardProducts.add(product);
            }
            case 2: {
                String productId = product.getText();
                try {
                    userCart.removeProductFromCart(productId);
                } catch (ProductNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
            case 3: {

            }
        }
    }

}