package it.itspiemonte.pietro.findingbalto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        TextView textView= (TextView) findViewById(R.id.txtdescrizione);
        textView.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras orci enim, vestibulum vitae dignissim id, vehicula eu odio." +
                "Cras lobortis venenatis quam eu feugiat. Fusce pretium dolor non volutpat luctus. Phasellus congue ornare enim, eu ornare elit porttitor vitae."+
                " Nullam scelerisque urna sed tincidunt sodales. Vivamus augue elit, molestie vitae nisl eget, vestibulum auctor massa. Sed ligula lectus, "+
                "auctor quis dignissim id, tempus sed sem. Donec tempor quam ligula, in fringilla felis imperdiet sed. Fusce convallis odio et sem pharetra tempus."+
                " Donec eros sapien, laoreet id posuere a, porta id nisl. Pellentesque sed porttitor velit, ut aliquam sapien. Etiam sed accumsan quam. Ut tincidunt et felis at vestibulum. Etiam in ornare orci. Interdum et malesuada fames ac ante ipsum primis in faucibus.");
    }
}
