/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author saugatdhakal
 */
public class RegisterData {
     private String vehicleId,vehicleName,category,range,vehicleCC;
    private int price;

    public RegisterData(String vehicleId, String vehicleName,String vehicleCC, String category, int price, String range) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.category = category;
        this.price = price;
        this.range = range;
        this.vehicleCC = vehicleCC;
    }
    

    public String getVehicleId() {
        return vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public String getRange() {
        return range;
    }

    public String getVehicleCC() {
        return vehicleCC;
    }
    
}
