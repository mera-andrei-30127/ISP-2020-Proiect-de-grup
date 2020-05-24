package aut.utcluj.isp.ex4;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class UserCartMenu extends JFrame {

    private UserCart userCart;
    private Double userMoney;
    private List<Product> cardProducts;
    private double totalPrice;

    public UserCartMenu(UserCart userCart, Double userMoney, List<Product> cardProducts, double totalPrice) {
        this.cardProducts = cardProducts;
        this.totalPrice = totalPrice;
        this.userCart = userCart;
        this.userMoney = userMoney;
        initializeComponents();
        initializeFrame();
    }


    private void initializeComponents() {
        final JLabel addProductLabel = new JLabel("Product Id: ");
        addProductLabel.setBounds(5, 5, 150, 20);
        add(addProductLabel);


        final JTextField addProductText = new JTextField("");
        addProductText.setBounds(170, 5, 200, 20);
        add(addProductText);


        final JLabel quantityLabel = new JLabel("Product quantity: ");
        quantityLabel.setBounds(5, 30, 150, 20);
        add(quantityLabel);


        final JTextField quantityText = new JTextField("");
        quantityText.setBounds(170, 30, 200, 20);
        add(quantityText);

        final JLabel addProductPriceLabel = new JLabel("Product price: ");
        addProductPriceLabel.setBounds(5, 60, 150, 20);
        add(addProductPriceLabel);


        final JTextField addProductPriceText = new JTextField("");
        addProductPriceText.setBounds(170, 60, 200, 20);
        add(addProductPriceText);

        final JButton addProductButton = new JButton("Add product");
        addProductButton.setBounds(5, 90, 365, 20);
        add(addProductButton);


        final JLabel removeProduct = new JLabel("Product Id: ");
        removeProduct.setBounds(5, 120, 150, 20);
        add(removeProduct);

        final JTextField removeProductText = new JTextField("");
        removeProductText.setBounds(170, 120, 200, 20);
        add(removeProductText);

        final JButton removeProductButton = new JButton("Remove product");
        removeProductButton.setBounds(5, 150, 365, 20);
        add(removeProductButton);

        final JButton submitCartButton = new JButton("Submit cart");
        submitCartButton.setBounds(5, 180, 365, 20);
        add(submitCartButton);

        final JLabel currentMoneyLabel = new JLabel("Current money: " + userMoney);
        currentMoneyLabel.setBounds(5, 210, 365, 20);
        add(currentMoneyLabel);

        final JLabel cartMoneyLabel = new JLabel("Cart money: " + totalPrice);
        cartMoneyLabel.setBounds(5, 240, 365, 20);
        add(cartMoneyLabel);

        Controller addProductControler = new Controller(addProductText, quantityText, addProductPriceText, 1, userCart, userMoney, cardProducts, totalPrice);
        addProductButton.addActionListener(addProductControler);

        Controller removeProductControler = new Controller(removeProductText, addProductPriceText, 2, userCart, userMoney, cardProducts, totalPrice);
        removeProductButton.addActionListener(removeProductControler);

        Controller submitCartControler = new Controller(3, userCart, userMoney, cardProducts, totalPrice);
        submitCartButton.addActionListener(submitCartControler);
    }

    private void initializeFrame() {
        setLayout(new BorderLayout());
        setVisible(true);
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


}
