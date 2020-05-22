package aut.utcluj.isp.ex3;

import javax.swing.*;
import java.awt.*;

public class MainScreen extends JFrame {
    StockController controller = new StockController();


    private JTextField pinProductId;
    private JTextField pinProductPrice;
    private JButton addProductToCatalogueButton;
    private JButton updateProducePriceButton;
    //private JTextField doorStatusTextField;
    //private JLabel errorMessageLabel;

    public MainScreen(StockController controller) throws HeadlessException {
        this.controller = controller;
        this.initializeUiComponents();
        //   this.initializeHandlers();
        //  this.setComponentsDefaultValues();
        this.initializeFrame();
    }

    /**
     * Initialize UI components
     */
    private void initializeUiComponents() {
        final JLabel typeProductId = new JLabel("Type product Id:");
        typeProductId.setBounds(5, 5, 150, 20);

        this.pinProductId = new JTextField("");
        this.pinProductId.setBounds(170, 5, 200, 20);

        this.pinProductPrice = new JTextField();
        this.pinProductPrice.setBounds(200, 5, 250, 20);


        this.addProductToCatalogueButton = new JButton("Add Product To Catalogue");
        this.addProductToCatalogueButton.setBounds(5, 30, 365, 20);

        this.updateProducePriceButton = new JButton("Update Produce Price");
        this.updateProducePriceButton.setBounds(5, 50, 400, 20);

        //final JLabel doorStatusLabel = new JLabel("Door status:");
        //doorStatusLabel.setBounds(5, 60, 150, 20);

        //this.doorStatusTextField = new JTextField();
        //this.doorStatusTextField.setBounds(170, 60, 200, 20);

        //this.errorMessageLabel = new JLabel();
        //this.errorMessageLabel.setBounds(5, 90, 300, 20);
        //this.errorMessageLabel.setVisible(false);

        // add elements to frame
        add(typeProductId);
        add(pinProductId);
        add(pinProductPrice);
        add(addProductToCatalogueButton);
        add(updateProducePriceButton);
        //add(doorStatusTextField);
        //add(errorMessageLabel);
    }

    /**
     * Initialize frame
     */
    private void initializeFrame() {
        setLayout(new BorderLayout());
        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

   /* private void initializeHandlers() {
        this.enterPinButton.addActionListener(e -> {
            final String enteredPin = pinAccessCodeTextField.getText();

            try {
                final DoorStatus updatedStatus = this.doorLockController.enterPin(enteredPin);
                this.setDoorStatusTextValue(updatedStatus);
                this.setErrorMessageTextValue(null);
            } catch (Exception exception) {
                if (exception instanceof InvalidPinException) {
                    this.setErrorMessageTextValue("Invalid pin.");
                } else if (exception instanceof TooManyAttemptsException) {
                    this.setErrorMessageTextValue("Door is permanently blocked. Used master key to unlock it.");
                } else {
                    this.setErrorMessageTextValue("Internal error. See stacktrace....");
                    exception.printStackTrace();
                }
            }
        });
    }

    private void initializeHandlers() {
        this.updateProducePriceButton.addActionListener(e -> {
            final String enteredPin = pinProductId.getText();
            final String enteredPrice = pinProductPrice.getText();
            try {
                final Product updatedProduct = this.controller.updateProductPriceByProductId(enteredPin, (double) enteredPrice);

            }
        }
    }*/


}
