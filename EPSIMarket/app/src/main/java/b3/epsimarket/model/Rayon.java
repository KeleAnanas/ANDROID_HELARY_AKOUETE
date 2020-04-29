package b3.epsimarket.model;
import org.json.JSONObject;
import java.io.Serializable;

public class Rayon implements Serializable{

    private String category_id="";
    private String title="";
    private String productsUrl="";

    public Rayon(JSONObject jsonObject){
        category_id=jsonObject.optString("category_id","");
        title=jsonObject.optString("title","");
        productsUrl=jsonObject.optString("products_url","");
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProductsUrl() {
        return productsUrl;
    }

    public void setProductsUrl(String productsUrl) {
        this.productsUrl = productsUrl;
    }
}
