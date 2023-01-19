package HouseTypeApp.business;

import HouseTypeApp.dataAccess.PropertyDao;
import HouseTypeApp.entities.House;
import HouseTypeApp.entities.Property;
import HouseTypeApp.entities.Summerhouse;
import HouseTypeApp.entities.Villa;

import java.util.List;

public class PropertyManager implements PropertyService {

    private PropertyDao propertyDao;

    public PropertyManager(PropertyDao propertyDao) {
        this.propertyDao = propertyDao;
    }
    public void add(Property property){
        propertyDao.add(property);

    }

    public List<House> getHouseList(){
        return propertyDao.getHouseList();
    }
    public List<Villa> getVillaList(){
        return propertyDao.getVillaList();
    }
    public List<Summerhouse> getSummerhouseList(){
        return propertyDao.getSummerhouseList();
    }
    public double getHouseTotalPrice(){
        return propertyDao.getHouseTotalPrice();
    }
    public double getVillaTotalPrice(){
        return propertyDao.getVillaTotalPrice();
    }
    public double getSummerhouseTotalPrice(){
        return propertyDao.getSummerhouseTotalPrice();
    }
    public double getTotalPrice(){
        return propertyDao.getTotalPrice();
    }

    public double getHouseAvgSquareMeters(){
        return propertyDao.getHouseAvgSquareMeters();
    }
    public double getVillaAvgSquareMeters(){
        return propertyDao.getVillaAvgSquareMeters();
    }
    public double getSummerhouseAvgSquareMeters(){
        return propertyDao.getSummerhouseAvgSquareMeters();
    }
    public double getTotalAvgSquareMeters(){
        return propertyDao.getTotalAvgSquareMeters();
    }
    public List<Property> filterByRoomAndLivingRoom(int room, int livingRoom) {
        return  propertyDao.filterByRoomAndLivingRoom(3,2);
    }
}
