package ParkingGuidanceSystem.controller;

import java.util.List;
import ParkingGuidanceSystem.model.connection;

public class AdminClass  extends UserLogin implements Parking{
    
    
    public boolean AddSpot (String SpotCode){
        SpotCode = SpotCode.replaceAll("[^0-9a-zA-Z]", "");
        if(!SpotCode.isEmpty()&&SpotCode.length()<31){
            connection conn = new connection();
            int valid = conn.addSpot(SpotCode);
            if(valid > 0)
                return true;
            
        }
        return false;
    }
    
    public boolean AddUser (String UserName , String Password, int RoleID, int shiftID){
        UserName = UserName.replaceAll("[^0-9a-zA-Z]", "");
        Password = Password.replaceAll("[^0-9a-zA-Z]", "");
        if(!UserName.isEmpty()&&UserName.length()<12&&!Password.isEmpty()&&Password.length()<12&&shiftID > 0&&RoleID>0){
            connection conn = new connection();
            int valid = conn.addUser(UserName, Password, RoleID,shiftID);
            if(valid > 0)
                return true;
            
        }
        return false;
    }
    
    public boolean UpdateUser (String UserName  ,int roleId ){
        UserName = UserName.replaceAll("[^0-9a-zA-Z]", "");
        
        if(!UserName.isEmpty()&&UserName.length()<50&&roleId > 0){
            connection conn = new connection();
            int valid = conn.updateRole(UserName, roleId);
            if(valid > 0)
                return true;
            
        }
        return false;
    }
    
    public boolean DeleteUser( String UserName){
        UserName = UserName.replaceAll("[^0-9a-zA-Z]", "");
        if(!UserName.isEmpty()&&UserName.length()<50){
            connection conn = new connection();
            int valid = conn.deleteUser(UserName);
            if(valid > 0)
                return true;
            
        }
        return false;
        
    }
    
    public List ViewShiftReport(String date, int shiftid){
        connection conn = new connection();
        List list = conn.viewshiftreport(date,shiftid);
         
        return list;
    } 
    
     public List ViewParkingReport(String date){
         connection conn = new connection();
         List list = conn.viewcarreport(date);
         
        return list;   
    } 

    @Override
    public List ViewSpots() {
        connection conn = new connection();
        List list = conn.viewSpots();
        return list;
    }
}
