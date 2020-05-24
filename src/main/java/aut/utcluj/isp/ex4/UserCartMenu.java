package aut.utcluj.isp.ex4;

import javax.swing.*;
import java.awt.*;

public class UserCartMenu extends JFrame {
    private final UserCart userCart;

    private JTextField productID;
    private JButton enterProductID;
    private JTextField getTotalPrice;
    private JLabel totalPrice;


    public UserCartMenu(UserCart userCart) throws HeadlessException {
        this.userCart = userCart;
        initializeComponents();
        initializeFrame();
        initializeHandlers();
    }

    private void initializeComponents() {
        final JLabel jLabel = new JLabel(" ");
        jLabel.setBounds(5, 5, 150, 20);

        this.productID = new JTextField("");
        this.productID.setBounds(170, 5, 200, 20);

        this.enterProductID = new JButton("Enter ID ");
        this.enterProductID.setBounds(5, 30, 365, 20);

        final JLabel priceStatusLabel = new JLabel(" Total price is");
        priceStatusLabel.setBounds(5, 60, 150, 200);

        this.getTotalPrice = new JTextField();
        this.getTotalPrice.setBounds(170, 60, 200, 20);

        this.totalPrice = new JLabel();
        this.totalPrice.setBounds(5, 10, 360, 20);

        add(jLabel);
        add(productID);
        add(enterProductID);
        add(priceStatusLabel);
        add(getTotalPrice);
        add(totalPrice);
    }

    private void initializeFrame() {
        setLayout(new BorderLayout());
        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private void initializeHandlers() {
        this.enterProductID.addActionListener(e -> {
            //final String enteredPin =
        });
    }


}
