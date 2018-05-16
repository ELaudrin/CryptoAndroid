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

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        android.widget.ListView liste = findViewById(R.id.list);
        ArrayList maListe = new ArrayList();
        maListe.add("Bitcoin");
        maListe.add("Ethereum");
        maListe.add("Litecoin");
        maListe.add("Ripple");


         ArrayAdapter adt = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, maListe);
        liste.setAdapter(adt);


        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    /*Toast toast= Toast.makeText(MainActivity.this,"En cours de développement",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);toast.show();*/

                    Intent intent0 = new Intent(MainActivity.this, detailCrypto.class);
                    startActivity(intent0);

                }else{

                    Intent intent1 = new Intent(MainActivity.this, detailCrypto.class);
                    startActivity(intent1);
                }

            };
        });

    }
}
