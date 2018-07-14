package francescoferrai.ingegneria_software2018app.model;

import com.google.gson.annotations.SerializedName;

public class Room {
    @SerializedName("id")
    private String id;

    @SerializedName("from_date")
    private long fromDate;

    @SerializedName("to_date")
    private long toDate;

    @SerializedName("closing_day")
    private long closingDay;

    private boolean open;

    public Room(String id, long fromDate, long toDate, long closingDay, boolean open) {
        this.id = id;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.closingDay = closingDay;
        this.open = open;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public long getFromDate() {
        return fromDate;
    }

    public void setFromDate(long fromDate) {
        this.fromDate = fromDate;
    }

    public long getToDate() {
        return toDate;
    }

    public void setToDate(long toDate) {
        this.toDate = toDate;
    }

    public long getClosingDay() {
        return closingDay;
    }

    public void setClosingDay(long closingDay) {
        this.closingDay = closingDay;
    }
}
