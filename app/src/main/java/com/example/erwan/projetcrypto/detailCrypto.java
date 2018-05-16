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
        return 100;
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
        texte2.setText("" + nb );
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




        /*android.widget.ListView liste = findViewById(R.id.list);

        java.util.ArrayList maListe = new ArrayList();
        maListe.add("Sold");
        maListe.add("Bought");
        maListe.add("Sold");
        maListe.add("Ripple");


         ArrayAdapter adt = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, maListe);
        liste.setAdapter(adt);


        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){


                    Toast toast= Toast.makeText(detailCrypto.this,"En cours de développement",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);toast.show();

                }else{

                    Toast toast= Toast.makeText(detailCrypto.this,"En cours de développement",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);toast.show();
                }

            };
        });*/




    }





}
