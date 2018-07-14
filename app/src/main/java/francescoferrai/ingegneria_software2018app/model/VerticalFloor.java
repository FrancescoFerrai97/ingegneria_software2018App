package francescoferrai.ingegneria_software2018app.model;

import com.google.gson.annotations.SerializedName;

public class VerticalFloor {

    @SerializedName("id")
    private String id;

    @SerializedName("floor_number")
    private String floorNumber;

    @SerializedName("horizontal_url")
    private String horizontal_url;

    @SerializedName("rooms_number")
    private int roomsNumber;

    public VerticalFloor(String id, String floorNumber, String horizontal_url, int roomsNumber) {
        this.id = id;
        this.floorNumber = floorNumber;
        this.horizontal_url = horizontal_url;
        this.roomsNumber = roomsNumber;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getHorizontal_url() {
        return horizontal_url;
    }

    public void setHorizontal_url(String horizontal_url) {
        this.horizontal_url = horizontal_url;
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
    }
}
