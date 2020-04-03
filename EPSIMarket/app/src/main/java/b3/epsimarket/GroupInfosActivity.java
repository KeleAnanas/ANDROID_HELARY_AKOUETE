package b3.epsimarket;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class GroupInfosActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_infos);

        //Déclaration de la toolbar dans l'activité
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_groupinfo_toolbar);
        setSupportActionBar(toolbar);
        //Affichage du bouton back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
