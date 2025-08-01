public class Product{
    private String productName;
    private String productType;
    private float productPrice;
    
    public Product(String productName, String productType, float productPrice){
        this.productName = productName;
        this.productType = productType;
        this.productPrice = productPrice;
    }

    public String getProductName(){
        return this.productName;
    }

    public String getProductType(){
        return this.productType;
    }
    
    public float getProductPrice(){
        return this.productPrice;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }
    public void setProductType(String productType){
        this.productType = productType;
    }
    public void setProductPrice(float productPrice){
        this.productPrice = productPrice;
    }
}