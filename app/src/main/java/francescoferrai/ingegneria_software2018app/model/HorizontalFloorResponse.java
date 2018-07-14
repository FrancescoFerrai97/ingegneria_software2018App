package francescoferrai.ingegneria_software2018app.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HorizontalFloorResponse {

    @SerializedName("rooms")
    List<Room> roomList;


    @SerializedName("image_url")
    private String imageUrl;

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
