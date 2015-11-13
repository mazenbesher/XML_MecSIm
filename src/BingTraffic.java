import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BingTraffic {
    private String description;
    private String congestion;
    private String detour;
    private String end;

    public static class Point {
        private String type;
        private ArrayList<Double> coordinates;

        public Double getLatitude(){
            return coordinates.get(0);
        }

        public Double getLongitude(){
            return coordinates.get(1);
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public ArrayList<Double> getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(ArrayList<Double> coordinates) {
            this.coordinates = coordinates;
        }
    }

    private Point _point;

    // -------------------------------------------------------------------------------


    // End
    public Date getEnd() throws ParseException {
        //ToDo
//        Integer datetimestamp = Integer.parseInt(end.replaceAll("\\D", ""));
//        Date date = new Date(datetimestamp);

        return null;
    }

    // Detour
    public String getDetour() {
        return detour;
    }

    public void setDetour(String detour) {
        this.detour = detour;
    }

    // Point
    public Point getPoint() {
        return _point;
    }

    public void setPoint(Point _point) {
        this._point = _point;
    }

    // Congestion
    public String getCongestion() {
        return congestion;
    }

    public void setCongestion(String congestion) {
        this.congestion = congestion;
    }

    // Description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
