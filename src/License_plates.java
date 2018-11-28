import java.util.HashSet;
import java.util.Iterator;


public class License_plates implements Iterable<License_plates_numbers>{

    /**
     * License plate numbers are distinct
     * to maintain their uniquness we store our license numbers in a set; hashset of the collection
     */

    HashSet<License_plates_numbers> license_plates = new HashSet<>();

    //TODO write tests for this


    /**
     * add plate numbers to the set
     *
     * @param license_plate_numbers
     * return set with newly added license_plate_numbers
     */
    private HashSet<License_plates_numbers> addPLateNumbers(License_plates_numbers license_plate_numbers) {
        license_plates.add(license_plate_numbers);
        return license_plates;

    }

    /**
     *
     * @param license_plate_numbers
     * @return the new set oflicense_plate_numbers
     */

    private HashSet<License_plates_numbers>  removePlateNumbers(License_plates_numbers license_plate_numbers){

        license_plates.remove(license_plate_numbers);
        return license_plates;
    }

    /**
     * check if a particular license plate numbers exists in the set
     *
     * @param license_plate_numbers
     */

    private boolean checkIfExists(License_plates_numbers license_plate_numbers) {

        return license_plates.contains(license_plate_numbers);

    }

    /**
     * check if the licence_plate_number alpabet part matches a particular sequence of chraracter.
     * if the sequence matches add the license_plate_number to the new subset subset_plates_numbers
     * @param charSequence
     * @return subset_plate_numbers
     */

    private HashSet<License_plates_numbers> isBeginWith(String charSequence){
        HashSet<License_plates_numbers> subset_plates_numbers = new HashSet<>();
        while (iterator().hasNext()){
            License_plates_numbers license_plates_numbers = iterator().next();

            //check if the first part of the string matches the provide charsequence
            if (license_plates_numbers.getAlphPart().equals(charSequence)){
                //add that place number to the subset_plate_numbers
                subset_plates_numbers.add(license_plates_numbers);
            }

        }

        return subset_plates_numbers;


    }

    /**
     * find the number of license_plate_numbers that start with a given combination of characters
     * @param charsequence
     * @return size
     */

    private int isSubsetSize(String charsequence){
        HashSet<License_plates_numbers> subset_license_plate_numbers = isBeginWith(charsequence);

        int size = subset_license_plate_numbers.size();
        return size;
    }

    @Override
    public Iterator<License_plates_numbers> iterator() {
        return license_plates.iterator();
    }
}
