package b3.epsimarket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import b3.epsimarket.model.Produit;
import b3.epsimarket.model.Rayon;

public class ListeProduitActivity extends ApplicationActivity {

    private ArrayList<Produit> produits;
    private ProduitAdapter adapter;

    public static void display(Activity activity, Rayon rayon){
        Intent intent = new Intent(activity,ListeProduitActivity.class);
        intent.putExtra("rayon",rayon);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_produit);

        produits = new ArrayList<>();
        ListView listView = findViewById(R.id.liste_produits);
        adapter = new ProduitAdapter(this,R.layout.liste_produit,produits);
        Rayon rayon = (Rayon) getIntent().getExtras().get("rayon");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ProduitActivity.display(ListeProduitActivity.this, produits.get(position));
            }
        });

        new HttpAsyTask(rayon.getProductsUrl(), new HttpAsyTask.HttpAsyTaskListener() {
            @Override
            public void webServiceDone(String result) {
                initData(result);
            }

            @Override
            public void webServiceError(Exception e) {
                displayToast(e.getMessage());
            }
        }).execute();
    }

    private void initData(String data) {
        try {
            JSONObject jsonObject;
            jsonObject=new JSONObject(data);
            JSONArray jsonArray=jsonObject.getJSONArray("items");
            for(int i=0;i<jsonArray.length();i++){
                Produit produit =new Produit(jsonArray.getJSONObject(i));
                produits.add(produit);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        displayToast(String.valueOf(produits.size()));
        adapter.notifyDataSetChanged();
    }
}
