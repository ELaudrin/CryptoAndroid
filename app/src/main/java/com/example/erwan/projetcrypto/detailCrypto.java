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
import android.widget.*;
import android.view.*;


class MyAdapter extends BaseAdapter{

    private final Activity context;

    public MyAdapter(Activity mainActivity) {
        context  = mainActivity;
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(android.content.Context.LAYOUT_INFLATER_SERVICE);
        View v;
        if (convertView == null) {
            v = inflater.inflate(R.layout.adapter_custom, null);
        } else {
            v = convertView;
        }
        int nb = 1+ (int)(Math.random() * (99999 - 1));
        TextView texte = v.findViewById(R.id.monTexte);
        texte.setText("Sold " );
        TextView texte2 = v.findViewById(R.id.monTexte2);
        texte2.setText("Sep, 25, 2017" );

        TextView texte3 = v.findViewById(R.id.monTexte3);
        texte3.setText("" + nb );
        TextView texte4 = v.findViewById(R.id.monTexte4);
        texte4.setText("$80.50");
        return v;
    }
}

public class detailCrypto extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_crypto);

        ListView liste = findViewById(R.id.list);
        ListAdapter myAdapter = new MyAdapter(this);
        liste.setAdapter(myAdapter);


        final TextView Coin = findViewById(R.id.coin);
        final TextView PrixCoin = findViewById(R.id.price);
        Coin.setText("Bitcoin BTC");
        PrixCoin.setText("9054.32");





    }

    public void LogoBouton (View view){
        Intent intent0 = new Intent(detailCrypto.this, AchatCoin.class);
        startActivity(intent0);

    }

}
