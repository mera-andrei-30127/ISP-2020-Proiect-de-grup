package aut.utcluj.isp.ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JFrame {
    private StockController controller = new StockController();

    private JTextField pinProductId;
    private JTextField pinProductName;
    private JTextField pinProductPrice;
    private JTextField pinProductQuantity;
    private JButton addProductToCatalogueButton;
    private JButton updateProducePriceButton;
    private JButton removeAllProducts;
    private JButton getProductsWithSameID;
    private JButton getTotalNumberOfproducts;


    public MainScreen(StockController controller) throws HeadlessException {
        this.controller = controller;
        this.initializeUiComponents();
        this.initializeHandlers();
        this.initializeFrame();
    }

    public MainScreen(JTextField productId, JTextField productName, JTextField productQuantity, JTextField productPrice, int option) {
        super();
        this.pinProductId = productId;
        this.pinProductName = productName;
        this.pinProductQuantity = productQuantity;
        this.pinProductPrice = productPrice;

    }

    /**
     * Initialize UI components
     */
    private void initializeUiComponents() {
        final JLabel typeProductId = new JLabel("Type product Id:");
        typeProductId.setBounds(5, 5, 150, 20);

        this.pinProductId = new JTextField("");
        this.pinProductId.setBounds(170, 5, 200, 20);

        final JLabel typeProductName = new JLabel("Type product name:");
        typeProductName.setBounds(5, 30, 250, 20);

        this.pinProductName = new JTextField("");
        pinProductName.setBounds(170, 200, 270, 20);

        final JLabel typeProductPrice = new JLabel("Type product price:");
        typeProductPrice.setBounds(5, 50, 300, 20);

        this.pinProductPrice = new JTextField();
        this.pinProductPrice.setBounds(200, 250, 350, 20);

        final JLabel typeProductQuantity = new JLabel("");
        typeProductQuantity.setBounds(5, 250, 300, 20);

        this.pinProductQuantity = new JTextField();
        this.pinProductQuantity.setBounds(250, 250, 350, 20);


        this.addProductToCatalogueButton = new JButton("Add Product To Catalogue");
        this.addProductToCatalogueButton.setBounds(5, 30, 365, 20);

        this.updateProducePriceButton = new JButton("Update Produce Price");
        this.updateProducePriceButton.setBounds(5, 50, 400, 20);

        this.removeAllProducts = new JButton("Remove all products");
        this.removeAllProducts.setBounds(5, 70, 450, 20);

        this.getProductsWithSameID = new JButton("Get products with same id");
        this.getProductsWithSameID.setBounds(5, 90, 500, 20);

        this.getTotalNumberOfproducts = new JButton("Get total number of products");
        this.getTotalNumberOfproducts.setBounds(5, 110, 650, 20);

        // add elements to frame
        add(typeProductId);
        add(typeProductName);
        add(typeProductPrice);
        add(typeProductQuantity);
        add(pinProductId);
        add(pinProductName);
        add(pinProductPrice);
        add(pinProductQuantity);
        add(addProductToCatalogueButton);
        add(updateProducePriceButton);
        add(removeAllProducts);
        add(getProductsWithSameID);
        add(getTotalNumberOfproducts);
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


    private void initializeHandlers() {
        addProductToCatalogueButton.addActionListener(new MyActionListener());
        updateProducePriceButton.addActionListener(new MyActionListener());
        removeAllProducts.addActionListener(new MyActionListener());
        getProductsWithSameID.addActionListener(new MyActionListener());
        getTotalNumberOfproducts.addActionListener(new MyActionListener());

    }

    class MyActionListener implements ActionListener {
        StockController controller = new StockController();

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == addProductToCatalogueButton) {
                String productId = pinProductId.getText();
                String productName = pinProductName.getText();
                String quantity = pinProductQuantity.getText();
                String price = pinProductPrice.getText();
                Product product = new Product(productId, productName, Double.valueOf(price));
                controller.addProductToCatalogue(product, Integer.valueOf(quantity));
            } else if (e.getSource() == updateProducePriceButton) {
                String productId = pinProductId.getText();
                String productName = pinProductName.getText();
                String quantity = pinProductQuantity.getText();
                String price = pinProductPrice.getText();
                Product product = new Product(productId, productName, Double.valueOf(price));
                controller.updateProductPriceByProductId(productId, Double.valueOf(price));

            } else if (e.getSource() == removeAllProducts) {
                String productId = pinProductId.getText();
                controller.removeAllProductsWitProductId(productId);
            } else if (e.getSource() == getProductsWithSameID) {
                String productId = pinProductId.getText();
                controller.getProductsWithSameId(productId);

            } else if (e.getSource() == getTotalNumberOfproducts) {
                controller.getTotalNumberOfProducts();
            }


        }
    }
}


