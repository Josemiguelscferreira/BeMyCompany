package org.app.company.model;

//import javax.persistence.*;
import java.util.List;

//@Entity
//@Table(name = "volunteer")
public class Volunteer {
  //  @Id
   // @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String firstName;
    private String lastName;
    private String image;
    private Integer age;
    private Integer phone;
    private String email;
    //private int commonInterests = 0;
    private List<String> commonInterestsList;
    private String location = "";

//--------------------INTERESTS------------------------

    private boolean likesFootball;
    private boolean likesCinema;
    private boolean likesDomino;
    private boolean likesCrochet;
    private boolean likesCooking;

    //--------------------AVAILABILITY---------------------

    private boolean isAvailableMondayMorning;
    private boolean isAvailableMondayAfternoon;
    private boolean isAvailableTuesdayMorning;
    private boolean isAvailableTuesdayAfternoon;
    private boolean isAvailableWednesdayMorning;
    private boolean isAvailableWednesdayAfternoon;
    private boolean isAvailableThursdayMorning;
    private boolean isAvailableThursdayAfternoon;
    private boolean isAvailableFridayMorning;
    private boolean isAvailableFridayAfternoon;
    private boolean isAvailableSaturdayMorning;
    private boolean isAvailableSaturdayAfternoon;
    private boolean isAvailableSundayMorning;
    private boolean isAvailableSundayAfternoon;

    //-------------------SCHEDULED--------------------------

    private boolean isScheduledMondayMorning;
    private boolean isScheduledMondayAfternoon;
    private boolean isScheduledTuesdayMorning;
    private boolean isScheduledTuesdayAfternoon;
    private boolean isScheduledWednesdayMorning;
    private boolean isScheduledWednesdayAfternoon;
    private boolean isScheduledThursdayMorning;
    private boolean isScheduledThursdayAfternoon;
    private boolean isScheduledFridayMorning;
    private boolean isScheduledFridayAfternoon;

    //-------------------ASSOCIATED BENEFICIARY------------------

    //@OneToOne
    private Beneficiary beneficiaryMondayMorning;
    //@OneToOne
    private Beneficiary beneficiaryMondayAfternoon;
    //@OneToOne
    private Beneficiary beneficiaryTuesdayMorning;
    //@OneToOne
    private Beneficiary beneficiaryTuesdayAfternoon;
    //@OneToOne
    private Beneficiary beneficiaryWednesdayMorning;
    //@OneToOne
    private Beneficiary beneficiaryWednesdayAfternoon;
    //@OneToOne
    private Beneficiary beneficiaryThursdayMorning;
    //@OneToOne
    private Beneficiary beneficiaryThursdayAfternoon;
    //@OneToOne
    private Beneficiary beneficiaryFridayMorning;
    //@OneToOne
    private Beneficiary beneficiaryFridayAfternoon;
    //@OneToOne
    private Beneficiary beneficiarySaturdayMorning;
    //@OneToOne
    private Beneficiary beneficiarySaturdayAfternoon;
    //@OneToOne
    private Beneficiary beneficiarySundayMorning;
    //@OneToOne
    private Beneficiary beneficiarySundayAfternoon;

//----------------------METHODS-----------------------------


    public Beneficiary getBeneficiaryMondayMorning() {
        return beneficiaryMondayMorning;
    }

    public void setBeneficiaryMondayMorning(Beneficiary beneficiaryMondayMorning) {
        this.beneficiaryMondayMorning = beneficiaryMondayMorning;
    }

    public Beneficiary getBeneficiaryMondayAfternoon() {
        return beneficiaryMondayAfternoon;
    }

    public void setBeneficiaryMondayAfternoon(Beneficiary beneficiaryMondayAfternoon) {
        this.beneficiaryMondayAfternoon = beneficiaryMondayAfternoon;
    }

    public Beneficiary getBeneficiaryTuesdayMorning() {
        return beneficiaryTuesdayMorning;
    }

    public void setBeneficiaryTuesdayMorning(Beneficiary beneficiaryTuesdayMorning) {
        this.beneficiaryTuesdayMorning = beneficiaryTuesdayMorning;
    }

    public Beneficiary getBeneficiaryTuesdayAfternoon() {
        return beneficiaryTuesdayAfternoon;
    }

    public void setBeneficiaryTuesdayAfternoon(Beneficiary beneficiaryTuesdayAfternoon) {
        this.beneficiaryTuesdayAfternoon = beneficiaryTuesdayAfternoon;
    }

    public Beneficiary getBeneficiaryWednesdayMorning() {
        return beneficiaryWednesdayMorning;
    }

    public void setBeneficiaryWednesdayMorning(Beneficiary beneficiaryWednesdayMorning) {
        this.beneficiaryWednesdayMorning = beneficiaryWednesdayMorning;
    }

    public Beneficiary getBeneficiaryWednesdayAfternoon() {
        return beneficiaryWednesdayAfternoon;
    }

    public void setBeneficiaryWednesdayAfternoon(Beneficiary beneficiaryWednesdayAfternoon) {
        this.beneficiaryWednesdayAfternoon = beneficiaryWednesdayAfternoon;
    }

    public Beneficiary getBeneficiaryThursdayMorning() {
        return beneficiaryThursdayMorning;
    }

    public void setBeneficiaryThursdayMorning(Beneficiary beneficiaryThursdayMorning) {
        this.beneficiaryThursdayMorning = beneficiaryThursdayMorning;
    }

    public Beneficiary getBeneficiaryThursdayAfternoon() {
        return beneficiaryThursdayAfternoon;
    }

    public void setBeneficiaryThursdayAfternoon(Beneficiary beneficiaryThursdayAfternoon) {
        this.beneficiaryThursdayAfternoon = beneficiaryThursdayAfternoon;
    }

    public Beneficiary getBeneficiarySundayMorning() {
        return beneficiarySundayMorning;
    }

    public void setBeneficiarySundayMorning(Beneficiary beneficiarySundayMorning) {
        this.beneficiarySundayMorning = beneficiarySundayMorning;
    }

    public Beneficiary getBeneficiarySundayAfternoon() {
        return beneficiarySundayAfternoon;
    }

    public void setBeneficiarySundayAfternoon(Beneficiary beneficiarySundayAfternoon) {
        this.beneficiarySundayAfternoon = beneficiarySundayAfternoon;
    }

    public Beneficiary getBeneficiaryFridayMorning() {
        return beneficiaryFridayMorning;
    }

    public void setBeneficiaryFridayMorning(Beneficiary beneficiaryFridayMorning) {
        this.beneficiaryFridayMorning = beneficiaryFridayMorning;
    }

    public Beneficiary getBeneficiaryFridayAfternoon() {
        return beneficiaryFridayAfternoon;
    }

    public void setBeneficiaryFridayAfternoon(Beneficiary beneficiaryFridayAfternoon) {
        this.beneficiaryFridayAfternoon = beneficiaryFridayAfternoon;
    }

    public Beneficiary getBeneficiarySaturdayMorning() {
        return beneficiarySaturdayMorning;
    }

    public void setBeneficiarySaturdayMorning(Beneficiary beneficiarySaturdayMorning) {
        this.beneficiarySaturdayMorning = beneficiarySaturdayMorning;
    }

    public Beneficiary getBeneficiarySaturdayAfternoon() {
        return beneficiarySaturdayAfternoon;
    }

    public void setBeneficiarySaturdayAfternoon(Beneficiary beneficiarySaturdayAfternoon) {
        this.beneficiarySaturdayAfternoon = beneficiarySaturdayAfternoon;
    }

    public boolean isAvailableSaturdayMorning() {
        return isAvailableSaturdayMorning;
    }

    public void setAvailableSaturdayMorning(boolean availableSaturdayMorning) {
        isAvailableSaturdayMorning = availableSaturdayMorning;
    }

    public boolean isAvailableSaturdayAfternoon() {
        return isAvailableSaturdayAfternoon;
    }

    public void setAvailableSaturdayAfternoon(boolean availableSaturdayAfternoon) {
        isAvailableSaturdayAfternoon = availableSaturdayAfternoon;
    }

    public boolean isAvailableSundayMorning() {
        return isAvailableSundayMorning;
    }

    public void setAvailableSundayMorning(boolean availableSundayMorning) {
        isAvailableSundayMorning = availableSundayMorning;
    }

    public boolean isAvailableSundayAfternoon() {
        return isAvailableSundayAfternoon;
    }

    public void setAvailableSundayAfternoon(boolean availableSundayAfternoon) {
        isAvailableSundayAfternoon = availableSundayAfternoon;
    }

    public boolean isScheduledSaturdayMorning() {
        return isScheduledSaturdayMorning;
    }

    public void setScheduledSaturdayMorning(boolean scheduledSaturdayMorning) {
        isScheduledSaturdayMorning = scheduledSaturdayMorning;
    }

    public boolean isScheduledSaturdayAfternoon() {
        return isScheduledSaturdayAfternoon;
    }

    public void setScheduledSaturdayAfternoon(boolean scheduledSaturdayAfternoon) {
        isScheduledSaturdayAfternoon = scheduledSaturdayAfternoon;
    }

    public boolean isScheduledSundayMorning() {
        return isScheduledSundayMorning;
    }

    public void setScheduledSundayMorning(boolean scheduledSundayMorning) {
        isScheduledSundayMorning = scheduledSundayMorning;
    }

    public boolean isScheduledSundayAfternoon() {
        return isScheduledSundayAfternoon;
    }

    public void setScheduledSundayAfternoon(boolean scheduledSundayAfternoon) {
        isScheduledSundayAfternoon = scheduledSundayAfternoon;
    }

    private boolean isScheduledSaturdayMorning;
    private boolean isScheduledSaturdayAfternoon;
    private boolean isScheduledSundayMorning;
    private boolean isScheduledSundayAfternoon;

    //--------------------------------------------------------------
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean likesFootball() {
        return likesFootball;
    }

    public void setLikesFootball(boolean likesFootball) {
        this.likesFootball = likesFootball;
    }

    public boolean likesCinema() {
        return likesCinema;
    }

    public void setLikesCinema(boolean likesCinema) {
        this.likesCinema = likesCinema;
    }

    public boolean likesDomino() {
        return likesDomino;
    }

    public void setLikesDomino(boolean likesDomino) {
        this.likesDomino = likesDomino;
    }

    public boolean likesCrochet() {
        return likesCrochet;
    }

    public void setLikesCrochet(boolean likesCrochet) {
        this.likesCrochet = likesCrochet;
    }

    public boolean likesCooking() {
        return likesCooking;
    }

    public void setLikesCooking(boolean likesCooking) {
        this.likesCooking = likesCooking;
    }

    public boolean isAvailableMondayMorning() {
        return isAvailableMondayMorning;
    }

    public void setAvailableMondayMorning(boolean availableMondayMorning) {
        isAvailableMondayMorning = availableMondayMorning;
    }

    public boolean isAvailableMondayAfternoon() {
        return isAvailableMondayAfternoon;
    }

    public void setAvailableMondayAfternoon(boolean availableMondayAfternoon) {
        isAvailableMondayAfternoon = availableMondayAfternoon;
    }

    public boolean isAvailableTuesdayMorning() {
        return isAvailableTuesdayMorning;
    }

    public void setAvailableTuesdayMorning(boolean availableTuesdayMorning) {
        isAvailableTuesdayMorning = availableTuesdayMorning;
    }

    public boolean isAvailableTuesdayAfternoon() {
        return isAvailableTuesdayAfternoon;
    }

    public void setAvailableTuesdayAfternoon(boolean availableTuesdayAfternoon) {
        isAvailableTuesdayAfternoon = availableTuesdayAfternoon;
    }

    public boolean isAvailableWednesdayMorning() {
        return isAvailableWednesdayMorning;
    }

    public void setAvailableWednesdayMorning(boolean availableWednesdayMorning) {
        isAvailableWednesdayMorning = availableWednesdayMorning;
    }

    public boolean isAvailableWednesdayAfternoon() {
        return isAvailableWednesdayAfternoon;
    }

    public void setAvailableWednesdayAfternoon(boolean availableWednesdayAfternoon) {
        isAvailableWednesdayAfternoon = availableWednesdayAfternoon;
    }

    public boolean isAvailableThursdayMorning() {
        return isAvailableThursdayMorning;
    }

    public void setAvailableThursdayMorning(boolean availableThursdayMorning) {
        isAvailableThursdayMorning = availableThursdayMorning;
    }

    public boolean isAvailableThursdayAfternoon() {
        return isAvailableThursdayAfternoon;
    }

    public void setAvailableThursdayAfternoon(boolean availableThursdayAfternoon) {
        isAvailableThursdayAfternoon = availableThursdayAfternoon;
    }

    public boolean isAvailableFridayMorning() {
        return isAvailableFridayMorning;
    }

    public void setAvailableFridayMorning(boolean availableFridayMorning) {
        isAvailableFridayMorning = availableFridayMorning;
    }

    public boolean isAvailableFridayAfternoon() {
        return isAvailableFridayAfternoon;
    }

    public void setAvailableFridayAfternoon(boolean availableFridayAfternoon) {
        isAvailableFridayAfternoon = availableFridayAfternoon;
    }

    public boolean isScheduledMondayMorning() {
        return isScheduledMondayMorning;
    }

    public void setScheduledMondayMorning(boolean scheduledMondayMorning) {
        isScheduledMondayMorning = scheduledMondayMorning;
    }

    public boolean isScheduledMondayAfternoon() {
        return isScheduledMondayAfternoon;
    }

    public void setScheduledMondayAfternoon(boolean scheduledMondayAfternoon) {
        isScheduledMondayAfternoon = scheduledMondayAfternoon;
    }

    public boolean isScheduledTuesdayMorning() {
        return isScheduledTuesdayMorning;
    }

    public void setScheduledTuesdayMorning(boolean scheduledTuesdayMorning) {
        isScheduledTuesdayMorning = scheduledTuesdayMorning;
    }

    public boolean isScheduledTuesdayAfternoon() {
        return isScheduledTuesdayAfternoon;
    }

    public void setScheduledTuesdayAfternoon(boolean scheduledTuesdayAfternoon) {
        isScheduledTuesdayAfternoon = scheduledTuesdayAfternoon;
    }

    public boolean isScheduledWednesdayMorning() {
        return isScheduledWednesdayMorning;
    }

    public void setScheduledWednesdayMorning(boolean scheduledWednesdayMorning) {
        isScheduledWednesdayMorning = scheduledWednesdayMorning;
    }

    public boolean isScheduledWednesdayAfternoon() {
        return isScheduledWednesdayAfternoon;
    }

    public void setScheduledWednesdayAfternoon(boolean scheduledWednesdayAfternoon) {
        isScheduledWednesdayAfternoon = scheduledWednesdayAfternoon;
    }

    public boolean isScheduledThursdayMorning() {
        return isScheduledThursdayMorning;
    }

    public void setScheduledThursdayMorning(boolean scheduledThursdayMorning) {
        isScheduledThursdayMorning = scheduledThursdayMorning;
    }

    public boolean isScheduledThursdayAfternoon() {
        return isScheduledThursdayAfternoon;
    }

    public void setScheduledThursdayAfternoon(boolean scheduledThursdayAfternoon) {
        isScheduledThursdayAfternoon = scheduledThursdayAfternoon;
    }

    public boolean isScheduledFridayMorning() {
        return isScheduledFridayMorning;
    }

    public void setScheduledFridayMorning(boolean scheduledFridayMorning) {
        isScheduledFridayMorning = scheduledFridayMorning;
    }

    public boolean isScheduledFridayAfternoon() {
        return isScheduledFridayAfternoon;
    }

    public void setScheduledFridayAfternoon(boolean scheduledFridayAfternoon) {
        isScheduledFridayAfternoon = scheduledFridayAfternoon;
    }

    public int getCommonInterestsCount() {
        return commonInterestsList.size();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addToInterestList(String interest){
        commonInterestsList.add(interest);
    }

    public List<String> getCommonInterestsList() {
        return commonInterestsList;
    }

    // public void setCommonInterests(int commonInterests) {
   //     this.commonInterests = commonInterests;
   // }
}
