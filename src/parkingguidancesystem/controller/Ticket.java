package ParkingGuidanceSystem.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import ParkingGuidanceSystem.model.connection;

public class Ticket {
    private int id;
    private String plateNumber;
    private String entryDate;
    private String spotCode;
    
    public Ticket(String pt,String spotCode){
        this.plateNumber = pt;
        this.spotCode = spotCode;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.entryDate = formatter.format(new Date());
        connection conn = new connection();
        this.id = conn.addTicket(this.plateNumber, this.entryDate, this.spotCode);
            
    }
    
    @Override
    public String toString(){
        if(this.id>0)
            return "Ticket ID: "+this.id+"\n"+
                    "Spot Code: "+this.spotCode+"\n"+
                    "Plate Number: "+this.plateNumber+"\n"+
                    "Entry Date: "+this.entryDate;
        else
            return "Process Faild";
            
    }
}
