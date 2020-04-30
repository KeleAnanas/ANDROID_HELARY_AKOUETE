package b3.epsimarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class HelaryInfosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helary_infos);

        TextView textView = findViewById(R.id.l_header_text);
        textView.setText(R.string.Helary_name);

        //Déclaration de la toolbar dans l'activité
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_helary_infos_toolbar);
        setSupportActionBar(toolbar);
        //Affichage du bouton back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
