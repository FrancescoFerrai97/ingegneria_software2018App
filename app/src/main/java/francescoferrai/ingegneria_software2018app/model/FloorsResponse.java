package francescoferrai.ingegneria_software2018app.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FloorsResponse {

    @SerializedName("floors")
    List<VerticalFloor> floorList;

    public List<VerticalFloor> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<VerticalFloor> floorList) {
        this.floorList = floorList;
    }
}
