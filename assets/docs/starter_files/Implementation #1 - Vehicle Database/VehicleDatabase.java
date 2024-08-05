import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class VehicleDatabase {

    private List<Vehicle> vdb;
    private List<String> makes;

    /*
    This is the constructor for our database. It will take a single parameter which is a
    string containing a filepath to the xml file from which we will build our database. 
    Given the large number of steps involved inthisprocess we have provided comments to 
    help guide you. Though it is strongly encourage that you follow the steps detailed
    here and in the documentation it is not strictly required.
    */ 
    VehicleDatabase(String filepath) {

        //
        // Step 1: Creating a parser
        //
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        DocumentBuilder db = null;
        try {
            db = dbf.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        Document doc = null;
        try {
            doc = db.parse(new File(filepath));
        } catch (SAXException | IOException e) {
            e.printStackTrace();
            System.exit(-2);
        }


        //
        // Step 2: Extracting the info
        //
        NodeList vehicles = //Get all of the vehicles in the document

        vdb = new ArrayList<>(); //this is our vehicle data base
        makes = new ArrayList<>(); //this is our collection of unique makes

        for(int i = 0; i < vehicles.getLength(); i++){

            Element vehicle = (Element) vehicles.item(i);

            // Get the make and model of the car (replace the ??)
            String make = vehicle.getElementsByTagName(??).item(0).getTextContent();
            String model = vehicle.getElementsByTagName(??).item(0).getTextContent();

            //Add if the make or model is new. Add it.
            if(!makes.contains(make)){
                makes.add(make);
            }

            //Get the number of cylinders
            Integer cylinders;
            try {
                cylinders = Integer.valueOf(vehicle.getElementsByTagName(??).item(0).getTextContent());
            } catch (NumberFormatException e){
                continue;
            }

            // Get the drive and fuel type
            String drive = vehicle.getElementsByTagName(??).item(0).getTextContent();
            String fuelType = vehicle.getElementsByTagName(??).item(0).getTextContent();

            
            // Get the year
            Integer year;
            try {
                year = Integer.valueOf(vehicle.getElementsByTagName(??).item(0).getTextContent());
            } catch (NumberFormatException e){
                continue;
            }

            // Get transmission and vehicle class
            String trans = vehicle.getElementsByTagName(??).item(0).getTextContent();
            String VClass = vehicle.getElementsByTagName(??).item(0).getTextContent();
            
            // Instantiate a new vehicle class with the attributes you extracted and add it to the database
            vdb.add(??);

        }

        Collections.sort(makes); //Sort the list of makes just to make it easier to look through
    } 

    public List<String> getMakes() {
        return makes;
    }

    /**
     * Given a make, this function should construct and return a List<> of
     * strings of each vehicle make in the database that also has that make.
     * This function should ignore the case of the String parameters in any
     * comparisions. Once this list is constructed it should be sorted and
     * returned from the function.
     *
     * @param make -> A
     * @return A **sorted** list of strings
     */
    public List<String> queryClasses(String make) {

    }

    /**
     * Given a make and a class, this function should construct and return a
     * List<> of strings of each vehicle model in the database that also has
     * that make and class. This function should ignore the case of the String
     * parameters in any comparisions. Once this list is constructed it should
     * be sorted and returned from the function.
     *
     * @param userMake -> A string indicating the make of the car in which the
     * user is interested.
     * @param userClass -> A string inidcating the vehicle class in which the
     * user is interested.
     * @return Returns a **sorted** list of strings
     */
    public List<String> queryModels(String userMake, String userClass) {

    }

    /**
     * Given a model, this function should construct and return a List<> of
     * Vehicle instances in the database that are of that model. This function
     * should ignore the case of the String parameters in any comparisions. Once
     * this list is constructed it should be sorted and returned from the
     * function.
     *
     * @param userModel -> A string indicating the model in which the user is
     * interested.
     * @return a **sorted** list of Vehicle instances 
     */
    public List<Vehicle> queryVehicles(String userModel){

    }

}
