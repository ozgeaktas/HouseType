package HouseTypeApp.dataAccess;

import HouseTypeApp.entities.House;
import HouseTypeApp.entities.Property;
import HouseTypeApp.entities.Summerhouse;
import HouseTypeApp.entities.Villa;

import java.util.List;

public class JdbcPropertyDao implements PropertyDao{
    @Override
    public void add(Property property) {
        System.out.println(" Eklenen evin fiyatı:" +property.getPrice());
    }

    @Override
    public List<House> getHouseList() {
        List<House> houses=
        return null;
    }

    @Override
    public List<Villa> getVillaList() {
        return null;
    }

    @Override
    public List<Summerhouse> getSummerhouseList() {
        return null;
    }
}
