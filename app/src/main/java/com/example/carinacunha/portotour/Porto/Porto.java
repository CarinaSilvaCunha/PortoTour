package com.example.carinacunha.portotour.Porto;

public class Porto {

    private String portoLocalName;
    private String portoLocalSmallDescription;
    private String portoLocalDescription;
    private String portoLocalURL;
    private String portoLocalEmail;
    private int portoLocalPhone;
    private String portoLocalAddress;
    private int portoLocalPicture;

    /**
     * Create a Porto Local Object, this is a generic object that can be used with any
     * type of activities/locals
     *
     * @param portoLocalName             - for the name of the tourist local
     * @param portoLocalSmallDescription - for the small description of the tourism local
     * @param portoLocalDescription      - for the full local description
     * @param portoLocalURL              - for the tourist local website
     * @param portoLocalEmail            - for the tourist local e-mail
     * @param portoLocalPhone            - for the tourist local phone
     * @param portoLocalAddress          - for the tourist local address
     * @param portoLocalPicture          - for the tourist local picture
     */
    public Porto(String portoLocalName, String portoLocalSmallDescription, String portoLocalDescription, String portoLocalURL, String portoLocalEmail,
                 int portoLocalPhone, String portoLocalAddress, int portoLocalPicture) {
        this.portoLocalName = portoLocalName;
        this.portoLocalSmallDescription = portoLocalSmallDescription;
        this.portoLocalDescription = portoLocalDescription;
        this.portoLocalURL = portoLocalURL;
        this.portoLocalEmail = portoLocalEmail;
        this.portoLocalPhone = portoLocalPhone;
        this.portoLocalAddress = portoLocalAddress;
        this.portoLocalPicture = portoLocalPicture;
    }

    // This part of the class has the get and set methods for this class
    // Set methods are not used, they are just here preparing for the future.


    // Get and Set Methods for portoLocal
    public String getPortoLocalName() {
        return portoLocalName;
    }

    public void setPortoLocalName(String portoLocalName) {
        this.portoLocalName = portoLocalName;
    }

    // Get and Set Methods for getPortoLocalSmallDescription
    public String getPortoLocalSmallDescription() {
        return portoLocalSmallDescription;
    }

    public void setPortoLocalSmallDescription(String portoLocalSmallDescription) {
        this.portoLocalSmallDescription = portoLocalSmallDescription;
    }

    // Get and Set Methods for portoLocalDescription
    public String getPortoLocalDescription() {
        return portoLocalDescription;
    }

    public void setPortoLocalDescription(String portoLocalDescription) {
        this.portoLocalDescription = portoLocalDescription;
    }

    // Get and Set Methods for portoLocalURL
    public String getPortoLocalURL() {
        return portoLocalURL;
    }

    public void setPortoLocalURL(String portoLocalURL) {
        this.portoLocalURL = portoLocalURL;
    }

    // Get and Set Methods for portoLocalEmail
    public String getPortoLocalEmail() {
        return portoLocalEmail;
    }

    public void setPortoLocalEmail(String portoLocalEmail) {
        this.portoLocalEmail = portoLocalEmail;
    }

    // Get and Set Methods for portoLocalPhone
    public int getPortoLocalPhone() {
        return portoLocalPhone;
    }

    public void setPortoLocalPhone(int portoLocalPhone) {
        this.portoLocalPhone = portoLocalPhone;
    }

    // Get and Set Methods for portoLocalAddress
    public String getPortoLocalAddress() {
        return portoLocalAddress;
    }

    public void setPortoLocalAddress(String portoLocalAddress) {
        this.portoLocalAddress = portoLocalAddress;
    }

    // Get and Set Methods for portoLocalPicture
    public int getPortoLocalPicture() {
        return portoLocalPicture;
    }

    public void setPrtoLocalPicture(int portoLocalPicture) {
        this.portoLocalPicture = portoLocalPicture;
    }
}