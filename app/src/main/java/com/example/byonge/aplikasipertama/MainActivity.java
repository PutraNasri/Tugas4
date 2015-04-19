package com.example.byonge.aplikasipertama;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }public void onClickbtnTerjemah(View view) {
        TextView txtTulisan = (TextView) findViewById(R.id.txtTulisan);
        Button button = (Button) findViewById(R.id.btnTerjemah);
        bahasaindonesia = false;
        String apakabar = getString(R.string.apakabar_dunia);
        txtTulisan.setText(apakabar);


        bahasaindonesia = true;



    }

    public void onClicktomboltrjemah2(View view) {
        TextView txtTulisan = (TextView) findViewById(R.id.txtTulisan);
        Button button = (Button) findViewById(R.id.btnTerjemah);
        bahasaindonesia = false;
        String helloworld = getString(R.string.hello_world);
        txtTulisan.setText(helloworld);


        bahasaindonesia = true;



    }
    public void onClicktomboltrjemah3(View view) {
        TextView txtTulisan = (TextView) findViewById(R.id.txtTulisan);
        Button button = (Button) findViewById(R.id.btnTerjemah);
        bahasaindonesia = false;
        String pehabadonya = getString(R.string.pe_haba);
        txtTulisan.setText(pehabadonya);


        bahasaindonesia = true;

    }
    private boolean bahasaindonesia = false;
}