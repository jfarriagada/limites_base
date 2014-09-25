package com.example.konarr.limites;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class cuatro extends Activity {

    private EditText txt_valor_c;
    private Button btn_calcular_c;
    private TextView lbl_resultado_c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuatro);

        inicializarComponenteUI();
    }


    private void inicializarComponenteUI() {
        txt_valor_c = (EditText) findViewById(R.id.txt_valor_c);
        btn_calcular_c = (Button) findViewById(R.id.btn_calcular_c);
        lbl_resultado_c = (TextView) findViewById(R.id.lbl_resultado_c);
    }














    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.cuatro, menu);
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
