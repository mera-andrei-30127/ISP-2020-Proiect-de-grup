package aut.utcluj.isp.ex4;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ashraf_sarhan
 */
public class Main {

    private static UserCart userCart;
    private static Double userMoney;
    private static List<Product> cardProducts;
    private static double totalPrice;

    public static void main(String[] args) {
        userCart = new UserCart();
        userMoney = 500.0;
        cardProducts = new ArrayList<>();
        totalPrice = 0.0;

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    createAndShowGUI();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void createAndShowGUI() throws Exception {
        new UserCartMenu(userCart, userMoney, cardProducts, totalPrice);
    }
}