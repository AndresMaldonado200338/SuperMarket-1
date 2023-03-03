package model;

public class Address {
    private String city, district, roadType, roadName, dial, roadNumber, dial2, badgeNumber;

    public Address(String city, String district, String roadType, String roadName, String dial, String roadNumber,
            String dial2, String badgeNumber) {
        this.city = city;
        this.district = district;
        this.roadType = roadType;
        this.roadName = roadName;
        this.dial = dial;
        this.roadNumber = roadNumber;
        this.dial2 = dial2;
        this.badgeNumber = badgeNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getRoadType() {
        return roadType;
    }

    public void setRoadType(String roadType) {
        this.roadType = roadType;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public String getDial() {
        return dial;
    }

    public void setDial(String dial) {
        this.dial = dial;
    }

    public String getRoadNumber() {
        return roadNumber;
    }

    public void setRoadNumber(String roadNumber) {
        this.roadNumber = roadNumber;
    }

    public String getDial2() {
        return dial2;
    }

    public void setDial2(String dial2) {
        this.dial2 = dial2;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public String getFullAddress(){
        return "Direccion [Ciudad=" + city + ", Barrio=" + district + ", Tipo de via=" + roadType
                + ", Nombre o numero de via=" + roadName + ", cuadrante=" + dial + ", Via generadora=" + roadNumber + ", Cuadrante de via="
                + dial2 + ", Numero de placa=" + badgeNumber +  "]";
    }

    @Override
    public String toString() {
        return "[" + city + ", " + district + ". " + roadType + " " + roadName + " " + dial + " # " + roadNumber + " " + dial2 + "-" + badgeNumber +  "]";
    }
}
