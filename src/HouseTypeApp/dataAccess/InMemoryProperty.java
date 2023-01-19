package HouseTypeApp.dataAccess;

import HouseTypeApp.entities.House;
import HouseTypeApp.entities.Property;
import HouseTypeApp.entities.Summerhouse;
import HouseTypeApp.entities.Villa;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryProperty implements PropertyDao{

    List<Property> properties;


    public InMemoryProperty() {
        properties=new ArrayList<Property>();
        properties.add(new House("House",1850000,80,2,1));
        properties.add(new House("House",1545000,60,1,1));
        properties.add(new House("House",4500000,115,3,2));
        properties.add(new Villa("Villa",5950000,207,5,2));
        properties.add(new Villa("Villa",16850000,355,3,1));
        properties.add(new Villa("Villa",5150000,180,5,1));
        properties.add(new Summerhouse("Summerhouse",5085000,195,2,1));
        properties.add(new Summerhouse("Summerhouse",3200000,189,3,2));
        properties.add(new Summerhouse("Summerhouse",2700000,80,1,1));


    }

    @Override
    public void add(Property property) {
        properties.add(property);
    }

    @Override
    public List<House> getHouseList() {
        return properties.stream()
                .filter(property -> property instanceof House)
                .map(property -> (House) property)
                .collect(Collectors.toList());

    }

    @Override
    public List<Villa> getVillaList() {
        return properties.stream()
                .filter(property -> property instanceof Villa)
                .map(property -> (Villa) property)
                .collect(Collectors.toList());
    }

    @Override
    public List<Summerhouse> getSummerhouseList() {
        return properties.stream()
                .filter(property -> property instanceof Summerhouse)
                .map(property -> (Summerhouse) property)
                .collect(Collectors.toList());
    }

    @Override
    public double getHouseTotalPrice() {
        return properties.stream()
                .filter(property -> property instanceof House)
                .map(property -> (House) property).mapToDouble(Property::getPrice).sum();
    }

    @Override
    public double getVillaTotalPrice() {
        return properties.stream()
                .filter(property -> property instanceof Villa)
                .map(property -> (Villa) property).mapToDouble(Property::getPrice).sum();
    }

    @Override
    public double getSummerhouseTotalPrice() {
        return properties.stream()
                .filter(property -> property instanceof Summerhouse)
                .map(property -> (Summerhouse) property).mapToDouble(Property::getPrice).sum();
    }

    @Override
    public double getTotalPrice() {
        return properties.stream().mapToDouble(Property::getPrice).sum();
    }

    @Override
    public double getHouseAvgSquareMeters() {
        return properties.stream()
                .filter(property -> property instanceof House)
                .map(property -> (House) property).mapToDouble(Property::getSquareMeters).average().orElse(0);
    }

    @Override
    public double getVillaAvgSquareMeters() {
        return properties.stream()
                .filter(property -> property instanceof Villa)
                .map(property -> (Villa)property).mapToDouble(Property::getSquareMeters).average().orElse(0);
    }

    @Override
    public double getSummerhouseAvgSquareMeters() {
        return properties.stream()
                .filter(property -> property instanceof Summerhouse)
                .map(property -> (Summerhouse)property).mapToDouble(Property::getSquareMeters).average().orElse(0);
    }

    @Override
    public double getTotalAvgSquareMeters() {
        return properties.stream().mapToDouble(Property::getSquareMeters).average().orElse(0);
    }

    @Override
    public List<Property> filterByRoomAndLivingRoom(int room, int livingRoom) {
            return properties.stream().filter(p -> p.getRoomCount()==room && p.getLivingRoomCount()==  livingRoom).collect(Collectors.toList());
    }
}
