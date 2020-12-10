package nl.novi.dpcc.builder.domain;

public class HouseBuilderB {

    private String streetName;
    private int houseNumber;
    private String houseNumberAddition;
    private String postalCode;

    //Niet verplicht
    private String province;
    private boolean hasGarden;


    public HouseBuilderB(String streetName, int houseNumber, String houseNumberAddition, String postalCode) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.houseNumberAddition = houseNumberAddition;
        this.postalCode = postalCode;
    }

    public HouseBuilderB withProvince(String province){
        this.province = province;
        return this;
    }

    public HouseBuilderB withHasGarden(boolean hasGarden){
        this.hasGarden = hasGarden;
        return this;
    }
}
