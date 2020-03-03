package ParkingGuidanceSystem.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import ParkingGuidanceSystem.model.connection;

public class exitOperator {
    
    public int parkingHours(int ticketId) throws ParseException{
        if(ticketId < 0)
            return -1;
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        Date date1 = new Date();
        
        connection conn = new connection();
        String transaction = conn.getTicket(ticketId);
        
        if(transaction == "0")
            return -1;
        
        Date date2 = formatter.parse(transaction);
        long diff = date1.getTime() - date2.getTime();
        int diffhours = (int) (diff / (60 * 60 * 1000));
        return diffhours;
    }
}
