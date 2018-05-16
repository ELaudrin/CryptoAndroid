package com.example.erwan.projetcrypto;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.*;

public class AchatCoin extends Activity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achat_coin);

        //Bundle extras = getIntent().getExtras();
        //String value1 = extras.getString(Intent.EXTRA_TEXT);
        final TextView Coin = findViewById(R.id.Coin);
        final TextView Argent = findViewById(R.id.Argent);
        final TextView nb = findViewById(R.id.nb);
        final TextView PriCoin = findViewById(R.id.PriCoin);
        final TextView Balance = findViewById(R.id.Balance);
        Button Final = findViewById(R.id.button);

        Balance.setText("Balance = $");
        PriCoin.setText(1+""+"="+""+"$");
        Argent.setText("$");
       // Coin.setText(value1);

       Coin.setText("Bitcoin");
        Balance.setText("Balance = 5500$");
        PriCoin.setText("1 Bitcoin = 200 000$");
        Argent.setText("534.84$");
        nb.setText("2.369875");

        Final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( AchatCoin.this,PageFinal.class);
                //intent.putExtra("V1",retour);
                startActivity(intent);
                finish();
            }

        });
    }

}

