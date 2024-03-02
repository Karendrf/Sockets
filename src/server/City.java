package server;

public class City {
    private int daneCode;
    private String nameCity;

    public City(int daneCode, String nameCity) {
        this.daneCode = daneCode;
        this.nameCity = nameCity;
    }

    public int getDaneCode() {
        return daneCode;
    }

    public void setDaneCode(int daneCode) {
        this.daneCode = daneCode;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }
}
