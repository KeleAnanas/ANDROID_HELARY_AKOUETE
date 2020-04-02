package b3.epsimarket;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Création de l'activité pour l'affichage du splashscreen
 */
public class SplashActivity extends AppCompatActivity {

    //Durée d'affichage du splashscreen en ms
    private final int SPLASH_DISPLAY_LENGTH = 2000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        /**
         * Affichage du splashscreen avec un timer
         */
        new Handler().postDelayed(new Runnable() {

            //Cette méthode est executé une fois que le timer est fini
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, HomeActivity.class);
                startActivity(i);

                //Fermeture de l'activité
                finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
