package com.example.konarr.limites;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class dos extends Activity {

    private EditText txt_valor_d;
    private Button btn_calcular_d;
    private TextView lbl_resultado_d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        inicializarComponenteUI();
    }


    private void inicializarComponenteUI() {
        txt_valor_d = (EditText) findViewById(R.id.txt_valor_d);
        btn_calcular_d = (Button) findViewById(R.id.btn_calcular_d);
        lbl_resultado_d = (TextView) findViewById(R.id.lbl_resultado_d);
    }






    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dos, menu);
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
