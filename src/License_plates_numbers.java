/**
 * A license plate number is of formart ABC - 123; three letters followed by three numbers
 *
 */


public class License_plates_numbers {

    //attributes of a license number
    private String alphPart;
    private int numericPart;

    private String licenseNumber;

    public License_plates_numbers(String alphPart, int numericPart) {
        this.alphPart = alphPart;
        this.numericPart = numericPart;
    }

    public String getAlphPart() {
        return alphPart;
    }

    public int getNumericPart() {
        return numericPart;
    }

    private String getLicenseNumber(){
        licenseNumber = getAlphPart() +"-" +getNumericPart();
        return licenseNumber;
    }
}
