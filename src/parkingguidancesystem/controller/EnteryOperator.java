package ParkingGuidanceSystem.controller;

import java.util.List;
import ParkingGuidanceSystem.model.connection;

public class EnteryOperator extends UserLogin implements Parking{
    @Override
    
    public List ViewSpots() {
        connection conn = new connection();
        List list = conn.viewSpots("true");
        return list;
    }
}
