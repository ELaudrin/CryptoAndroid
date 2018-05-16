package com.example.erwan.projetcrypto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.*;

public class PageFinal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_final);
        final TextView Message = findViewById(R.id.Message);
        Message.setText("Transaction réussie");
        Button Final = findViewById(R.id.OK);


        Final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( PageFinal.this,Acceuil.class);
                //intent.putExtra("V1",retour);
                startActivity(intent);
                finish();
            }

        });
    }
}
