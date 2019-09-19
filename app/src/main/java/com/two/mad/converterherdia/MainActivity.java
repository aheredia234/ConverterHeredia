package com.two.mad.converterherdia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double input = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String str = "";
        final String s1 = "Centimeters to Inches";
        final String s2 = "Meters to Yards";
        final String s3 = "Grams to Ounces";
        final String s4 = "Kilograms to Pounds";
        final EditText num = findViewById(R.id.txtNum);
        final Spinner spin = findViewById(R.id.spinner);
        final TextView result = findViewById(R.id.txtRes);


        Button btn = findViewById(R.id.btnCalc);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(spin.getSelectedItem().equals(s1))
               {
                    input = Double.parseDouble(num.getText().toString());
                    input = input*0.393701;
                    result.setText(input + " inches");
               }
                if(spin.getSelectedItem().equals(s2))
                {
                    input = Double.parseDouble(num.getText().toString());
                    input = input*1.09361;
                    result.setText(input + " yards");
                }
                if(spin.getSelectedItem().equals(s3))
                {
                    input = Double.parseDouble(num.getText().toString());
                    input = input*0.035274;
                    result.setText(input + " ounces");
                }
                if(spin.getSelectedItem().equals(s4))
                {
                    input = Double.parseDouble(num.getText().toString());
                    input = input*2.20462;
                    result.setText(input + " pounds");
                }
            }
        });
    }
}
