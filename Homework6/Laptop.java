package Homework6;

public class Laptop { 
    int serialNumber;
    String brand;
    String color;
    int diagonal;
    int hdd;
    int ozu;
    String os;
    int price;
    public void buy() {
        }  
    public void order() {
    }  
    public String getbrand() {
        return this.brand;
    }
    public int getdiagonal() {
        return this.diagonal;
    }
    public int gethdd() {
        return this.hdd;
    }
    public String getcolor() {
        return this.color;
    }
    public int getozu() {
        return this.ozu;
    }
    public String getos() {
        return this.os;
    }
    public int getprice() {
        return this.price;
    }
    public Laptop(int serNumb, String brand, int diag, int hdd, int ozu){
        this.serialNumber=serNumb;
        this.brand = brand;
        this.diagonal = diag;
        this.hdd = hdd;
        this.ozu = ozu;
    }

    public String toString() {

        return String.format("Brand: %s; color: %s; diag: %d, hdd: %d; ozu: %d; os: %s, price: %d\n", brand, color, diagonal, hdd, ozu, os, price);
    }
}
