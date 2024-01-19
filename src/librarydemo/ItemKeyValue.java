package librarydemo;


public class ItemKeyValue {
    private  String value="";
    private  String key="";
    
    public ItemKeyValue(String k, String v){ //constructor
        key=k;
        value=v;
    }
    
    public String getKey(){ //getters
        return key;
    }
    public void setKey(String value){ //setters
        key = value;
    }
    public String getValue(){
        return value;
    }
    public void setValue(String value){
        value = value;
    }
    
    @Override
    public String toString(){
        return value;
    }
    
}
