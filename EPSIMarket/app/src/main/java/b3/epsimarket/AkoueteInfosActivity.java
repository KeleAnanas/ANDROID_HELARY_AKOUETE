package b3.epsimarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class AkoueteInfosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akouete_infos);

        TextView textView = findViewById(R.id.l_header_text);
        textView.setText(R.string.Akouete_name);

        //Déclaration de la toolbar dans l'activité
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_akouete_infos_toolbar);
        setSupportActionBar(toolbar);
        //Affichage du bouton back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
