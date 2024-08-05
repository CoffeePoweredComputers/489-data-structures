import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    private static final String COMMA_DELIMITER = ",";


    public static List<List<String>> readCSV(String fp) {

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fp))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                records.add(Arrays.asList(values));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return records;
    }

    public static void populateCampusMap(Graph<String> map, Map<String, Location> locationInfo,
                                         String nodeFP, String edgesFP) {

        List<List<String>> nodeRecords = readCSV(nodeFP);
        for(List<String> nodeRecord:  nodeRecords){
            String code = nodeRecord.get(0);
            String name = nodeRecord.get(1);
            String info = nodeRecord.get(2);
            map.addVertex(code);
            locationInfo.put(code, new Location(name, info));
        }

        List<List<String>> edgeRecords = readCSV(edgesFP);
        for(List<String> edgeRecord:  edgeRecords){
            String locationName1 = edgeRecord.get(0);
            String locationName2 = edgeRecord.get(1);
            Integer distance = Integer.valueOf(edgeRecord.get(2));
            map.addEdge(locationName1, locationName2, distance);
        }

    }

    public static void help(String locationCode){
        // Implement the method here
    }

    public static String move(Graph<String> map, String currentLocation){
        return " "; // REMOVE WHEN IMPLEMENTING
    }

    public static void look(Graph<String> map, String currentLocationCode) {
        // Implement the method here
    }

    public static void info(Map<String,Location> locationInfo, String currentLocationCode) {
        // Implement method here
    }

    public static void navigate(Graph<String> map, String currentLocationCode) {
    }

    public static void main(String [] args){

        Graph<String> map = new Graph<>();
        Map<String, Location> locationInfo = new HashMap<>();
        populateCampusMap(map, locationInfo, "vertexlist.csv", "edgelist.csv");


        Scanner sc = new Scanner(System.in);
        System.out.printf("Locations: %s\n", map.getVertecies());
        System.out.print("Choose a starting location: ");
        String currentLocationCode = sc.nextLine();
        if(!map.getVertecies().contains(currentLocationCode)){
            System.out.println("Invalid starting location. Exiting.");
            return;
        }


        while(true){

            break; //REMOVE WHEN IMPLEMENTING

        }

    }

}
