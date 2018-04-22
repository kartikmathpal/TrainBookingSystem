package com.kartik;
import java.util.*;

public class Train {

    private String toStation;
    private String fromStation;

    ArrayList<String> trainList = new ArrayList(Arrays.asList("A","B","C","D"));
    HashMap<String,Integer> hm=new HashMap<String,Integer>();
    public Train() {      //ASK
        //Seat Availability
        hm.put("A", 30);
        hm.put("B", 280);
        hm.put("C", 100);
        hm.put("D", 150);
        }
//    HashMap<String,Integer> hm = new HashMap<String, Integer>();
//    hm.put()

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public ArrayList<String> getTrainList() {
        return trainList;
    }

    public HashMap<String, Integer> getHm() {

        return hm;
    }
}




