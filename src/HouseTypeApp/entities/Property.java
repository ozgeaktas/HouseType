package HouseTypeApp.entities;

public class Property {

    private  String type;
    private int price;
    private int squareMeters;
    private int roomCount;
    private int livingRoomCount;

    public Property() {
    }

    public Property(String type, int price, int squareMeters, int roomCount, int livingRoomCount) {
        this.type=type;
        this.price = price;
        this.squareMeters=squareMeters;
        this.roomCount=roomCount;
        this.livingRoomCount=livingRoomCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLivingRoomCount() {
        return livingRoomCount;
    }

    public void setLivingRoomCount(int livingRoomCount) {
        this.livingRoomCount = livingRoomCount;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
