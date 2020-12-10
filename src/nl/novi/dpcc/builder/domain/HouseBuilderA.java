package nl.novi.dpcc.builder.domain;

public class HouseBuilderA {
    private String streetName;
    private int houseNumber;
    private String houseNumberAddition;
    private String postalCode;

    //Niet verplicht
    private String province;
    private boolean hasGarden;


    public HouseBuilderA(){

    }

    public HouseBuilderA withStreetName(String streetName){
        this.streetName = streetName;
        return this;
    }

    public HouseBuilderA withHouseNumber(int houseNumber){
        this.houseNumber = houseNumber;
        return this;
    }

    public HouseBuilderA withHouseNumberAddition(String houseNumberAddition){
        this.houseNumberAddition = houseNumberAddition;
        return this;
    }

    public HouseBuilderA withPostalCode(String postalCode){
        this.postalCode = postalCode;
        return this;
    }

    public HouseBuilderA withProvince(String province){
        this.province = province;
        return this;
    }

    public HouseBuilderA withHasGarden(boolean hasGarden){
        this.hasGarden = hasGarden;
        return this;
    }

}
