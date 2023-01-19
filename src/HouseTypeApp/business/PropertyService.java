package HouseTypeApp.business;

import HouseTypeApp.entities.House;
import HouseTypeApp.entities.Property;
import HouseTypeApp.entities.Summerhouse;
import HouseTypeApp.entities.Villa;

import java.util.List;

public interface PropertyService {
    public void add(Property property);
    public List<House> getHouseList();
    public List<Villa> getVillaList();
    public List<Summerhouse> getSummerhouseList();
    public double getHouseTotalPrice();
    public double getVillaTotalPrice();
    public double getSummerhouseTotalPrice();
    public double getTotalPrice();
    public double getHouseAvgSquareMeters();
    public double getVillaAvgSquareMeters();
    public double getSummerhouseAvgSquareMeters();
    public double getTotalAvgSquareMeters();
    public List<Property> filterByRoomAndLivingRoom(int room,int livingRoom);
}
