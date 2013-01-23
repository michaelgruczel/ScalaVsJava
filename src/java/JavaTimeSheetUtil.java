package java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaTimeSheetUtil {

    private JavaTimeSheetUtil(){
        // do nothing
    }

    public static List<JavaTimeSheetEntry> filterEntriesByUser(String user, List<JavaTimeSheetEntry> entries) {

        List<JavaTimeSheetEntry> result = new ArrayList<JavaTimeSheetEntry>();

        for(JavaTimeSheetEntry entry : entries) {
            if(entry.getName().equals(user)) {
                result.add(entry);
            }
        }

        return result;
    }


    public static List<JavaTimeSheetEntry> addTime(int timeToAdd, List<JavaTimeSheetEntry> entries) {


        List<JavaTimeSheetEntry> result = new ArrayList<JavaTimeSheetEntry>();

        for(JavaTimeSheetEntry entry : entries) {

            JavaTimeSheetEntry newEntry = new JavaTimeSheetEntry(entry.getName());
            newEntry.setMinutes(entry.getMinutes() + timeToAdd);
            result.add(newEntry);
        }

        return result;
    }

    public static int aggregateTimes(List<JavaTimeSheetEntry> entries) {


        int minutes = 0;

        for(JavaTimeSheetEntry entry : entries) {
            minutes += entry.getMinutes();
        }

        return minutes;
    }

    public static Map<String, Integer> timesGroupedByUser(List<JavaTimeSheetEntry> entries) {

        Map<String, Integer> result = new HashMap<String, Integer>();

        for(JavaTimeSheetEntry entry : entries) {

            Integer minutes = result.get(entry.getName());
            if(minutes != null) {
                result.put(entry.getName(), minutes + entry.getMinutes());
            } else {
                result.put(entry.getName(), entry.getMinutes());
            }
        }

        return result;
    }

}
