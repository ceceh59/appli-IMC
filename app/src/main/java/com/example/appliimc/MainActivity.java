package com.example.appliimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnImc;
    private Double nbPoids, nbTaille, nbImc;
    private TextView txtInter, txtImc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton();
        listenerButton();

    }

    @Override
    public void onClick(View v) {


        if (v.equals(btnImc)) {
            Toast.makeText(this, "btnImc", Toast.LENGTH_LONG).show();
            nbImc = nbPoids / (nbTaille * nbTaille);
            nbImc = setText(txtImc);
        }

        if (nbImc > 40) {
            txtInter.setText("obesite morbide");

        }
    }

    public void initButton() {
        btnImc = findViewById(R.id.btnImc);

    }

    public void listenerButton() {

        btnImc.setOnClickListener(this);
    }
}

