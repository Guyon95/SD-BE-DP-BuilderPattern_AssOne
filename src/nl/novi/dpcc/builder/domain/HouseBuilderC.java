package nl.novi.dpcc.builder.domain;

public class HouseBuilderC {
    private String streetName;
    private int houseNumber;
    private String houseNumberAddition;
    private String postalCode;

    //Niet verplicht
    private String province;
    private boolean hasGarden;


    public HouseBuilderC(String streetName, int houseNumber, String houseNumberAddition, String postalCode) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.houseNumberAddition = houseNumberAddition;
        this.postalCode = postalCode;
    }

    public HouseBuilderC withProvince(String province){
        this.province = province;
        return this;
    }

    public HouseBuilderC withHasGarden(boolean hasGarden){
        this.hasGarden = hasGarden;
        return this;
    }

    public HouseBuilderC buildWithEmptyCheck(){
        if(streetName.equalsIgnoreCase("")) {
            throw new RuntimeException("streetName cannot be empty");
        }
        if(houseNumber == 0) {
            throw new RuntimeException("houseNumber cannot be 0");
        }
        if(houseNumberAddition.equalsIgnoreCase("")) {
            throw new RuntimeException("houseNumberAddition cannot be empty");
        }
        if(postalCode.equalsIgnoreCase("")) {
            throw new RuntimeException("postalCode cannot be empty");
        }

        return new HouseBuilderC(streetName,houseNumber,houseNumberAddition,postalCode);
    }
}
