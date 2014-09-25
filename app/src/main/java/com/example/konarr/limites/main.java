package com.example.konarr.limites;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class main extends Activity {

    private Button btn_uno, btn_dos, btn_tres, btn_cuatro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarComponentesUI();
    }

    private void inicializarComponentesUI() {
        btn_uno = (Button) findViewById(R.id.btn_uno);
        btn_dos = (Button) findViewById(R.id.btn_dos);
        btn_tres = (Button) findViewById(R.id.btn_tres);
        btn_cuatro = (Button) findViewById(R.id.btn_cuatro);
    }

    public void onClick_uno(View view) {
        startActivity(new Intent(getApplicationContext(), uno.class));
    }

    public void onClick_dos(View view) {
        startActivity(new Intent(getApplicationContext(), dos.class));
    }

    public void onClick_tres(View view) {
        startActivity(new Intent(getApplicationContext(), tres.class));
    }

    public void onClick_cuatro(View view) {
        startActivity(new Intent(getApplicationContext(), cuatro.class));
    }










   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
    }*/
}
