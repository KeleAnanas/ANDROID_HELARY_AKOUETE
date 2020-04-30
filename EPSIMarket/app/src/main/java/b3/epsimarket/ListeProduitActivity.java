package b3.epsimarket;

import android.app.Activity;
import android.content.Intent;

import b3.epsimarket.model.Rayon;

public class ListeProduitActivity {

    public static void display(Activity activity, Rayon rayon){
        Intent intent = new Intent(activity,ListeProduitActivity.class);
        intent.putExtra("rayon",rayon);
        activity.startActivity(intent);
    }
}
