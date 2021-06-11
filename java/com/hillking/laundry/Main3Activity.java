package com.hillking.laundry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class Main3Activity extends AppCompatActivity {

        EditText quantityText;
        int quantity = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main3);
            quantityText= (EditText) findViewById(R.id.quantity_textview);
        }

        /**
         * This method is called when the order button is clicked.
         */
        public void submitOrder(View view) {
            quantity = Integer.parseInt(quantityText.getText().toString());
            int price = quantity*5;
            displayPrice(price);
        }

        public void increment (View view) {
            quantity = quantity + 1;
            display(quantity);
        }

        public void decrement (View view) {
            if (quantity>0){
                quantity = quantity - 1;
                display(quantity);
            }
        }

        /**
         * This method displays the given quantity value on the screen.
         */
        private void display(int number) {
            quantityText.setText("" + number);
        }

        /**
         * This method displays the given price on the screen.
         */
        private void displayPrice(int number) {
            TextView priceTextView = (TextView) findViewById(R.id.price_textview);
            priceTextView.setText("TOTAL " + number);
        }
    public void cont(View view) {
        Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
        startActivity(intent);
    }
    }