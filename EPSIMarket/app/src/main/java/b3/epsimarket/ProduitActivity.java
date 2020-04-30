package b3.epsimarket;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.Serializable;

import b3.epsimarket.model.Produit;

public class ProduitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_produit);

        TextView nom_produit =findViewById(R.id.nom_produit);
        TextView description_produit = findViewById(R.id.description_produit);
        ImageView image_produit = findViewById(R.id.image_produit);

        Produit produit = (Produit) getIntent().getExtras().get("produit");

        nom_produit.setText(produit.getName());
        description_produit.setText(produit.getDescription());
        Picasso.get().load(produit.getPictureUrl()).into(image_produit);
    }

    public static void display(Activity activity, Produit produit){
        Intent intent = new Intent(activity, ProduitActivity.class);
        intent.putExtra("produit", (Serializable) produit);
        activity.startActivity(intent);
    }
}
