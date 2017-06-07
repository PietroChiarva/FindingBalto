package it.itspiemonte.pietro.findingbalto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityAnimale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animale);
    }

    public void OnClickIndietro(View view) {
        Intent intent = new Intent(this, NewsActivity.class);

        startActivity(intent);
    }
}
