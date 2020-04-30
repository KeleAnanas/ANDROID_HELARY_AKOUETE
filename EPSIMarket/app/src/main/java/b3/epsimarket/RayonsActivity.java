package b3.epsimarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class RayonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_rayons);

        //Déclaration de la toolbar dans l'activité
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_rayons_toolbar);
        setSupportActionBar(toolbar);
        //Affichage du bouton back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}


