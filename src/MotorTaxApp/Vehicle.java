package MotorTaxApp;

import java.io.Serializable;

/**
    Instantiable class which defines a vehicle.
    Motor Tax Application
    2021 Mini Project
    @author Darren Dineen
 */

public class Vehicle implements Serializable {


    public String make;
    public String model;
    public int year;
    public String colour;
    public String numberPlate;
    public String fuelType;
    public double engineSize;
    public String taxDueDate;
    public String taxBracket;
    public String ownerName;
    public String onRoad;


    /**
     * Vehicle No-argument Constructor which initialises the attributes of a Vehicle object to default values.
    */
    public Vehicle() {

        this("Undefined", "Undefined", 0, "Undefined", "Undefined", "Undefined", 0, "Undefined", "Undefined" , "Undefined", "Y");

    }

    /**  10 argument constructor
           @param make of the Vehicle
           @param model of the Vehicle
           @param year of the Vehicle
           @param colour of the Vehicle
           @param numberPlate  of the Vehicle
           @param fuelType of the Vehicle
           @param engineSize of the Vehicle
           @param taxDueDate of the Vehicle
           @param onRoad Whether the Car is in the road or not
           @param ownerName of the Vehicle
     */
    public Vehicle(String make, String model, int year, String colour, String numberPlate, String fuelType, double engineSize, String taxDueDate , String ownerName, String bodyType, String onRoad ) {
        setMake(make);
        setModel(model);
        setYear(year);
        setColour(colour);
        setNumberPlate(numberPlate);
        setFuelType(fuelType);
        setEngineSize(engineSize);
        setTaxDueDate(taxDueDate);
        setOnRoad(onRoad);
        setOwnerName(ownerName);



    }



/**
    Getter Method for returning whether the vehicle of on the road or not
    @return a String Value to represent whether a vehicle is on the orad or not
 */
    public String getOnRoad(){
        return onRoad;
    }

    /**
    Setter Method for setting whether the vehicle is on the road
    @param onRoad the String for showing a vehicles status
     */

    public void setOnRoad(String onRoad){
        this.onRoad = onRoad;
    }

    /**
    Getter Method for getting Vehicle Make
    @return a String value to represent the Vehicle make
     */
    public String getMake() {
        return make;
    }

    /**
    Getter Method for getting Vehicle Model
    @return String value to represent the Vehicle model
    */
    public String getModel() {
        return model;
    }

    /**
    Getter Method for getting Vehicle Year
    @return int value to represent Vehicle Year
    */
    public int getYear() {
        return year;
    }

    /**
    Getter Method for getting Vehicle Colour
    @return String value to represent Vehicle Colour
     */
    public String getColour() {
        return colour;
    }

    /**
    Getter Method for getting Vehicle Number Plate
    @return String value to represent Vehicle Number Plate
     */
    public String getNumberPlate() {
        return numberPlate;
    }

    /**
    Getter Method for getting Vehicle Fuel Type
    @return String value to represent Vehicle fuel type
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
    Getter Method for getting Vehicle Engine Size
    @return double Value to represent Vehicle engine size
     */
    public double getEngineSize() {
        return engineSize;
    }

    /**
    Getter Method for getting Vehicle Tax Due Date
    @return String value to represent Vehicle tax due date
     */
    public String getTaxDueDate() {
        return taxDueDate;
    }

    /**
    Getter Method for getting Vehicle Owner Name
    @return String value to represent Vehicle owner name
     */
    public String getOwnerName(){
        return ownerName;
    }

    /**
    Setter Method for setting Vehicle Make
    @param make, the make of the Vehicle
    */
    public void setMake(String make) {
        this.make = make;
    }

    /**
    Setter Method for setting Vehicle Model
    @param model, the make of the Vehicle
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
    Setter Method for setting Vehicle Year
    @param year, the year of the Vehicle
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
    Setter Method for setting Vehicle Colour
    @param colour, the colour of the Vehicle
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
    Setter Method for setting Vehicle Number Plate
    @param numberPlate, the number plate of the vehicle
     */
    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    /**
    Setter Method for setting Vehicle Fuel Type
    @param fuelType, the fuel type of the Vehicle
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
    Setter Method for setting Vehicle Engine size
    @param engineSize, the engine size of the vehicle
     */
    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    /**
    Setter Method for setting Vehicle Tax Due Date
    @param taxDueDate, the tax due date of the vehicle
     */
    public void setTaxDueDate(String taxDueDate) {
        this.taxDueDate = taxDueDate;
    }

    /**
    Setter Method for setting Vehicle Owner Name
    @param ownerName, the owner name of the vehicle
     */
    public void setOwnerName(String ownerName) {
        this.ownerName=ownerName;
    }

    /**
    To String Method for displaying the object information in text
    @return a String value to specify the state of a Vehicle Object
    */

    public String toString() {
        return
                "\nMake: " + make + "\nModel: " + model + "\nYear: " + year + "\nColour: " + colour+ "" +
                        "\nNumber Plate: " + numberPlate + "\nFuel Type: " + fuelType+ "\nEngine Size: " + engineSize
                + "\nTax Due Date: " + taxDueDate + "\n Owner Name: " + getOwnerName() + "\n Currently on The road: " + getOnRoad();
    }

    }


