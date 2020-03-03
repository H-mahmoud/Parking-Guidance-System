package ParkingGuidanceSystem.controller;

import ParkingGuidanceSystem.model.connection;
public class UserLogin {

    private int Id = 0;
    
    public int Login(String UserName , String password ){
         UserName = UserName.replaceAll("[^0-9a-zA-Z]", "");
         password = password.replaceAll("[^0-9a-zA-Z]", "");
        if(!UserName.isEmpty()&&!password.isEmpty()&&UserName.length()<100&&password.length()<100){
            connection conn = new connection();
            this.Id = conn.checkLogin(UserName, password);
        }
         
        return this.Id;   
    }

}
