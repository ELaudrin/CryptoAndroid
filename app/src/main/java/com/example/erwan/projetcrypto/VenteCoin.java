package com.example.erwan.projetcrypto;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.*;

public class VenteCoin extends Activity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vente_coin);
        final TextView Coin = findViewById(R.id.Coin);
        final TextView Argent = findViewById(R.id.Argent);
        final TextView nb = findViewById(R.id.nb);
        final TextView PriCoin = findViewById(R.id.PriCoin);
        final TextView Balance = findViewById(R.id.Balance);
        Button Final = findViewById(R.id.button);

        Balance.setText("Balance = $");
        PriCoin.setText(1+""+"="+""+"$");
        Argent.setText("$");

        Final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( VenteCoin.this,PageFinal.class);
                //intent.putExtra("V1",retour);
                startActivity(intent);
                finish();
            }

        });

        Final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( VenteCoin.this,PageFinal.class);
                //intent.putExtra("V1",retour);
                startActivity(intent);
                finish();
            }

        });
    }
}
