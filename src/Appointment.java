public class Appointment {
    private String appointmentId;
    private String patientId;
    private String doctorId;
    private String dateTime;

    public Appointment(String appointmentId, String patientId, String doctorId, String dateTime) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.dateTime = dateTime;
    }

    // Getters
    public String getAppointmentId() {
        return appointmentId;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getDateTime() {
        return dateTime;
    }

    // Setters
    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
