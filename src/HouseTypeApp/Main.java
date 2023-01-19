package HouseTypeApp;

import HouseTypeApp.business.PropertyManager;
import HouseTypeApp.dataAccess.InMemoryProperty;
import HouseTypeApp.entities.House;
import HouseTypeApp.entities.Property;
import HouseTypeApp.entities.Summerhouse;
import HouseTypeApp.entities.Villa;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PropertyManager service=new PropertyManager(new InMemoryProperty());
        List<House> houseList = service.getHouseList();
        List<Villa> villaList = service.getVillaList();
        List<Summerhouse> summerhouseList=service.getSummerhouseList();
        List<Property> properties=service.filterByRoomAndLivingRoom(3,2);
        System.out.println("House List: ");
        for(House house : houseList) {
            System.out.println("Property Type: "+house.getType()+" Price: "
                    +house.getPrice()+"TL"+" Square meters : "
                    +house.getSquareMeters()+ "m^2"+
                    "  Room count: "+house.getRoomCount()+" Living room count: "+house.getLivingRoomCount());
        }
        System.out.println( );
        System.out.println("Villa List: ");
        for(Villa villa : villaList) {
            System.out.println("Propery Type: "+villa.getType()+" Price: "
                    +villa.getPrice()+"TL"+"  Square meters : "
                    +villa.getSquareMeters()+"m^2"+
                    "  Room count: "+villa.getRoomCount()+" Living room count:"+villa.getLivingRoomCount());
        }
        System.out.println( );
        System.out.println("Summerhouse List: ");
        for(Summerhouse summerhouse : summerhouseList) {
            System.out.println("Property Type: "+summerhouse.getType()+" Price: "
                    +summerhouse.getPrice()+"TL"+"  Square meters : "
                    +summerhouse.getSquareMeters()+"m^2"+
                    "  Room count: "+summerhouse.getRoomCount()+" Living room count:"+summerhouse.getLivingRoomCount());
        }
        System.out.println("----");


        System.out.println("Total price of all houses: "+ service.getHouseTotalPrice());
        System.out.println("Total price of all villas:  "+service.getVillaTotalPrice());
        System.out.println("Total price of all summerhouses: "+ service.getSummerhouseTotalPrice());
        System.out.println("The sum of the prices of all properties: "+service.getTotalPrice());

        System.out.println("----");

        System.out.println("Average square meter of all houses:  "+ service.getHouseAvgSquareMeters());
        System.out.println("Average square meter of all villas:  "+ service.getVillaAvgSquareMeters());
        System.out.println("Average square meter of all summerhouses: "+ service.getSummerhouseAvgSquareMeters());
        System.out.println("Average square meter of all properties:  "+ service.getTotalAvgSquareMeters());


        System.out.println("----");
        System.out.println("Type of properties with 3 rooms and 2 living rooms: ");
        for(Property property: properties) {
            System.out.println(property.getType()+" price: "+property.getPrice()+" square meters: "+property.getSquareMeters());
        }

    }
}