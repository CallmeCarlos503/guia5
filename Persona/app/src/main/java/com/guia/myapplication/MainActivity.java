package com.guia.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ArrayList<Personas> listapersonas;
    ListView lvl;
    Integer[] imgpersona = {
            R.drawable.ana,
            R.drawable.carlos,
            R.drawable.fernanda,
            R.drawable.gustavo,
            R.drawable.jose,
            R.drawable.juan,
            R.drawable.karla,
            R.drawable.luis,
            R.drawable.maria,
            R.drawable.marta,
            R.drawable.pedro,
            R.drawable.silvia,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listapersonas = new ArrayList<Personas>();
        listapersonas.add(new Personas("ana", 'f'));
        listapersonas.add(new Personas("Carlos", 'm'));
        listapersonas.add(new Personas("Fernanda", 'f'));
        listapersonas.add(new Personas("Gustavo", 'm'));
        listapersonas.add(new Personas("Jose", 'm'));
        listapersonas.add(new Personas("Juan", 'm'));
        listapersonas.add(new Personas("Karla", 'f'));
        listapersonas.add(new Personas("Luis", 'm'));
        listapersonas.add(new Personas("Maria", 'f'));
        listapersonas.add(new Personas("Marta", 'f'));
        listapersonas.add(new Personas("Pedro", 'm'));
        listapersonas.add(new Personas("Silvia", 'f'));
        AdaptadorPersonas adaptadorPersonas= new AdaptadorPersonas(this);
        lvl=findViewById(R.id.lvPersona);
        lvl.setAdapter(adaptadorPersonas);

    }
    class AdaptadorPersonas extends ArrayAdapter<Personas>{
        AppCompatActivity appCompatActivity;
        AdaptadorPersonas(AppCompatActivity context){
            super(context,R.layout.persona,listapersonas);
            appCompatActivity=context;
        }
        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater inflater= appCompatActivity.getLayoutInflater();
            View item= inflater.inflate(R.layout.persona,null);
            TextView Textview1= item.findViewById(R.id.txtnombre);
            Textview1.setText(listapersonas.get(position).getNombre());

            ImageView imageView1= item.findViewById(R.id.imgpersona);
            imageView1.setImageResource(imgpersona[position]);
            return (item);
        }
    }
}