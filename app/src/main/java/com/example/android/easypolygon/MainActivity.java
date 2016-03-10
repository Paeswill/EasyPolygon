package com.example.android.easypolygon;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app displays an number of sides of polygon.
 */

public class MainActivity extends AppCompatActivity{

    int quantity = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        String priceMessage = createOrderSummary(quantity);

        displayMessage(priceMessage);

    }


    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.order_summary_text_view);
        priceTextView.setText(message);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int numberOfSides) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfSides);

    }

    public void increment(View view) {
      quantity = ++quantity;
        displayQuantity(quantity);
    }

    public void decrement(View view) {
         quantity = --quantity ;
        displayQuantity(quantity);
    }

    private String createOrderSummary(int quantity){

        if (quantity == 0) {
            return "Does not exist"; }
        if (quantity == 1) {
            return "Does not exist"; }
        if (quantity == 2) {
            return "Does not exist"; }
        if (quantity == 3) {
            return "Triangle"; }
        if (quantity == 4) {
            return "Quadrilateral"; }
        if (quantity == 5) {
            return "Pentagon"; }
        if (quantity == 6) {
            return "Hexagon"; }
        if (quantity == 7) {
            return "Heptagon"; }
        if (quantity == 8) {
            return "Octagon"; }
        if (quantity == 9) {
            return "Nonagon"; }
        if (quantity == 10) {
            return "Decagon"; }
        if (quantity == 11) {
            return "Undecagon"; }
        if (quantity == 12) {
            return "Dodecagon"; }
        if (quantity == 13) {
            return "Tridecagon"; }
        if (quantity == 14) {
            return "Tetradecagon"; }
        if (quantity == 15) {
            return "Pentadecagon"; }
        if (quantity == 16) {
            return "Hexadecagon"; }
        if (quantity == 17) {
            return "Heptadecagon"; }
        if (quantity == 18) {
            return "Octadecagon"; }
        if (quantity == 19) {
            return "Enneadecagon"; }
        if (quantity == 20) {
            return "Icosagon"; }

       String priceMessage = "" + quantity ;

        return priceMessage;
    }

}