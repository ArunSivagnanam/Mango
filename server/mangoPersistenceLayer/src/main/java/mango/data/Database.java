package mango.data;

import java.util.ArrayList;
import java.util.List;

public class Database {

    ArrayList<String> data = new ArrayList<String>();

    public void saveData(String data){
        this.data.add(data);
    }

}
