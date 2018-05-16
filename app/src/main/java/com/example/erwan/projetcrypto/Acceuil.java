package com.example.erwan.projetcrypto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.*;
import android.graphics.*;

public class Acceuil extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);


        ListView liste = findViewById(R.id.listView);

        ArrayList maListe = new ArrayList();
        maListe.add("Bitcoin");
        maListe.add("Ethereum");
        maListe.add("Litecoin");
        maListe.add("Ripple");


         ArrayAdapter adt = new ArrayAdapter<String>
                (Acceuil.this, android.R.layout.simple_list_item_1, android.R.id.text1, maListe);
        liste.setAdapter(adt);


        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){

                    Intent intent0 = new Intent(Acceuil.this, detailCrypto.class);
                    startActivity(intent0);

                }else{

                    Intent intent1 = new Intent(Acceuil.this, detailCrypto.class);
                    startActivity(intent1);
                }

            };
        });

    }
}
