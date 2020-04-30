package b3.epsimarket;

import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import b3.epsimarket.model.Rayon;

public class RayonsActivity extends ApplicationActivity {

    public final String CATEGORY_URI = "http://djemam.com/epsi/categories.json";
    private ArrayList<Rayon> rayons;
    private RayonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_rayons);

        //Déclaration de la toolbar dans l'activité
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_rayons_toolbar);
        setSupportActionBar(toolbar);
        //Affichage du bouton back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rayons = new ArrayList();
        ListView listView = findViewById(R.id.liste_rayons);
        adapter = new RayonAdapter(this,R.layout.rayons,rayons);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListeProduitActivity.display(RayonsActivity.this, rayons.get(position));
            }
        });

        new HttpAsyTask(CATEGORY_URI, new HttpAsyTask.HttpAsyTaskListener() {
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
                Rayon rayon = new Rayon(jsonArray.getJSONObject(i));
                rayons.add(rayon);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        displayToast(String.valueOf(rayons.size()));
        adapter.notifyDataSetChanged();
    }
}


