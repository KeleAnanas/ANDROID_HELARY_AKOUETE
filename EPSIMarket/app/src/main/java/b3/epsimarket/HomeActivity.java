package b3.epsimarket;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Activité de la page principale de l'application
 */
public class HomeActivity extends AppCompatActivity {
    private Button btnZone1;
    private Button btnZone2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnZone1 = (Button) findViewById(R.id.activity_home_btn1);
        btnZone2 = (Button) findViewById(R.id.activity_home_btn2);

        TextView textView = findViewById(R.id.l_header_text);
        textView.setText(R.string.app_name);

        //Lancement de l'activité GroupInfo lorsque le bouton est appuyé
        btnZone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent groupInfoActivity = new Intent(HomeActivity.this, GroupInfosActivity.class);
                startActivity(groupInfoActivity);
            }
        });

        //Lancement de l'activité Rayons lorsque le bouton est appuyé
        btnZone2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rayonsActivity = new Intent(HomeActivity.this, RayonsActivity.class);
                startActivity(rayonsActivity);
            }
        });
    }
}
