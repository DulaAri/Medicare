public class Patient {
    private String patientId;
    private String name;
    private String contactNumber;

    public Patient(String patientId, String name, String contactNumber) {
        this.patientId = patientId;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    // Getters
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    // Setters
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
