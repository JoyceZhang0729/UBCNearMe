package Parser;

import com.oracle.javafx.jmx.json.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;


public class RoomParser {
    public static void parseStudyRooms(String jsonResponse) throws org.json.JSONException {
        JSONArray studyrooms = new JSONArray(jsonResponse);

        for (int i = 0; i < studyrooms.length(); i++) {
            JSONObject roomtype = studyrooms.getJSONObject(i);
            String type = roomtype.getString("RoomType");
            JSONArray rooms = roomtype.getJSONArray("Rooms");
            for (int r = 0; 0 < rooms.length(); r++) {
                JSONObject room = rooms.getJSONObject(i);
                String building = room.getString("Building");
                int floorNum = room.getInt("Floor");
                String roomnum = room.getString("RoomNum");
                int minpeople = room.getInt("Size");
                Boolean availability = room.getBoolean("Availability");
                // create new studyroom!!!!!!!
            }
        }
    }

    public static void parseWashRoom(String jsonResponse) throws org.json.JSONException{
        JSONArray washrooms = new JSONArray(jsonResponse);
        for (int i = 0; i < washrooms.length(); i++) {
            JSONObject roomtype = washrooms.getJSONObject(i);
            String type = roomtype.getString("RoomType");

            JSONArray rooms = roomtype.getJSONArray("Rooms");
            for (int r = 0; 0 < rooms.length(); r++) {
                JSONObject room = rooms.getJSONObject(i);
                String building = room.getString("Building");
                int floorNum = room.getInt("Floor");
                String roomnum = room.getString("RoomNum");
                String gender = room.getString("Type");
                // create new washroom!!!!!!!
            }
        }
    }

    public static void parseBuilding(String jsonResponse) throws org.json.JSONException{
        JSONArray buildings = new JSONArray(jsonResponse);
        for(int i = 0; i < buildings.length(); i++) {
            JSONObject cs = buildings.getJSONObject(i);
            String name = cs.getString("Name");
            Double lat = cs.getDouble("Latitude");
            Double lon = cs.getDouble("Longitude");
            String hours = cs.getString("Hours");
            // create new Building!!!!!!!!!
        }
    }

}
