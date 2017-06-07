package it.itspiemonte.pietro.findingbalto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Registrati extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrati);


    }
    public void OnClickReg(View view) {
        Intent intent = new Intent(this, ActivityAnimale.class);

        startActivity(intent);
    }

}
