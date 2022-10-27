public class Product {

    public Product(int _id,String _name,String _description,double _price,int _stockAmount,String _renk){
        System.out.println("Yapıcı blok çalıştı");
        this._name= "Ais";
    }
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;

    private String _renk;


    public int getId(){ //sadece get yazarsam readonly oluyo, sadece set yazarsam write only
        return _id;
    }

    public String getName(){
        return _name;
    }
    public void setId(int id){
        //this.id= id;   //this benim içinde bulunduğum class demek
        _id=id;
    }
    public void set_name(String name){
        _name=name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }

    public String get_renk() {
        return _renk;
    }

    public void set_renk(String _renk) {
        this._renk = _renk;
    }
}
