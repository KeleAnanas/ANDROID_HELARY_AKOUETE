package b3.epsimarket;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class GroupInfosActivity extends AppCompatActivity {

    private Button btnHelary;
    private Button btnAkouete;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_infos);

        //Déclaration de la toolbar dans l'activité
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_groupinfo_toolbar);
        setSupportActionBar(toolbar);
        //Affichage du bouton back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnHelary = (Button) findViewById(R.id.activity_groupinfo_btnHelary);
        btnAkouete = (Button) findViewById(R.id.activity_groupinfo_btnAkouete);

        //Lancement de l'activité HelaryInfos lorsque le bouton est appuyé
        btnHelary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent groupInfoActivity = new Intent(GroupInfosActivity.this, HelaryInfosActivity.class);
                startActivity(groupInfoActivity);
            }
        });

        //Lancement de l'activité AkoueteInfos lorsque le bouton est appuyé
        btnAkouete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rayonsActivity = new Intent(GroupInfosActivity.this, AkoueteInfosActivity.class);
                startActivity(rayonsActivity);
            }
        });
    }
}
