/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan55handphone;

/**
 *
 * @author nm
 */
public class HandPhone {
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public HandPhone(String man, String os, String model, int harga) {
        
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct(){
        System.out.println("Manufacture : " +manufacture);
        System.out.println("OS\t: " +operatingSystem);
        System.out.println("Model\t: " +model);
        System.out.println("Harga\t: " +harga);   
    }
}
