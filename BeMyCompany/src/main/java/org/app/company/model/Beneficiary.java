package org.app.company.model;

//import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

//@Entity
//@Table(name = "beneficiary")
public class Beneficiary {
    // @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String firstName;
    private String lastName;
    private String image;
    private Integer age;
    private Integer phone;
    private String email;
    private String location = "";
    private List<String> commonInterestsList;
    private List<String> myInterestsList = new ArrayList<>();

    public List<String> getMyInterestsList() {
        return myInterestsList;
    }

    public void populateMyInterestsList() {
        myInterestsList.add("Cinema");
        myInterestsList.add("Football");
        myInterestsList.add("Domino");
        myInterestsList.add("Crochet");
        myInterestsList.add("Cooking");
    }

    public Beneficiary() {
        populateMyInterestsList();
    }

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
    private boolean isScheduledSaturdayMorning;
    private boolean isScheduledSaturdayAfternoon;
    private boolean isScheduledSundayMorning;
    private boolean isScheduledSundayAfternoon;

    //---------------------------ASSIGNED VOLUNTEERS----------------------------

    // @OneToOne
    private Volunteer volunteerMondayMorning;
    //@OneToOne
    private Volunteer volunteerMondayAfternoon;
    //@OneToOne
    private Volunteer volunteerTuesdayMorning;
    //@OneToOne
    private Volunteer volunteerTuesdayAfternoon;
    //@OneToOne
    private Volunteer volunteerWednesdayMorning;
    //@OneToOne
    private Volunteer volunteerWednesdayAfternoon;
    //@OneToOne
    private Volunteer volunteerThursdayMorning;
    //@OneToOne
    private Volunteer volunteerThursdayAfternoon;
    //@OneToOne
    private Volunteer volunteerFridayMorning;
    //@OneToOne
    private Volunteer volunteerFridayAfternoon;
    //@OneToOne
    private Volunteer volunteerSaturdayMorning;
    //@OneToOne
    private Volunteer volunteerSaturdayAfternoon;
    //@OneToOne
    private Volunteer volunteerSundayMorning;
    //@OneToOne
    private Volunteer volunteerSundayAfternoon;

    // ----------------------------METHODS--------------------------------------


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Volunteer getVolunteerMondayMorning() {
        return volunteerMondayMorning;
    }

    public void setVolunteerMondayMorning(Volunteer volunteerMondayMorning) {
        this.volunteerMondayMorning = volunteerMondayMorning;
    }

    public Volunteer getVolunteerMondayAfternoon() {
        return volunteerMondayAfternoon;
    }

    public void setVolunteerMondayAfternoon(Volunteer volunteerMondayAfternoon) {
        this.volunteerMondayAfternoon = volunteerMondayAfternoon;
    }

    public Volunteer getVolunteerTuesdayMorning() {
        return volunteerTuesdayMorning;
    }

    public void setVolunteerTuesdayMorning(Volunteer volunteerTuesdayMorning) {
        this.volunteerTuesdayMorning = volunteerTuesdayMorning;
    }

    public Volunteer getVolunteerTuesdayAfternoon() {
        return volunteerTuesdayAfternoon;
    }

    public void setVolunteerTuesdayAfternoon(Volunteer volunteerTuesdayAfternoon) {
        this.volunteerTuesdayAfternoon = volunteerTuesdayAfternoon;
    }

    public Volunteer getVolunteerWednesdayMorning() {
        return volunteerWednesdayMorning;
    }

    public void setVolunteerWednesdayMorning(Volunteer volunteerWednesdayMorning) {
        this.volunteerWednesdayMorning = volunteerWednesdayMorning;
    }

    public Volunteer getVolunteerWednesdayAfternoon() {
        return volunteerWednesdayAfternoon;
    }

    public void setVolunteerWednesdayAfternoon(Volunteer volunteerWednesdayAfternoon) {
        this.volunteerWednesdayAfternoon = volunteerWednesdayAfternoon;
    }

    public Volunteer getVolunteerThursdayMorning() {
        return volunteerThursdayMorning;
    }

    public void setVolunteerThursdayMorning(Volunteer volunteerThursdayMorning) {
        this.volunteerThursdayMorning = volunteerThursdayMorning;
    }

    public Volunteer getVolunteerThursdayAfternoon() {
        return volunteerThursdayAfternoon;
    }

    public void setVolunteerThursdayAfternoon(Volunteer volunteerThursdayAfternoon) {
        this.volunteerThursdayAfternoon = volunteerThursdayAfternoon;
    }

    public Volunteer getVolunteerFridayMorning() {
        return volunteerFridayMorning;
    }

    public void setVolunteerFridayMorning(Volunteer volunteerFridayMorning) {
        this.volunteerFridayMorning = volunteerFridayMorning;
    }

    public Volunteer getVolunteerFridayAfternoon() {
        return volunteerFridayAfternoon;
    }

    public void setVolunteerFridayAfternoon(Volunteer volunteerFridayAfternoon) {
        this.volunteerFridayAfternoon = volunteerFridayAfternoon;
    }

    public Volunteer getVolunteerSaturdayMorning() {
        return volunteerSaturdayMorning;
    }

    public void setVolunteerSaturdayMorning(Volunteer volunteerSaturdayMorning) {
        this.volunteerSaturdayMorning = volunteerSaturdayMorning;
    }

    public Volunteer getVolunteerSaturdayAfternoon() {
        return volunteerSaturdayAfternoon;
    }

    public void setVolunteerSaturdayAfternoon(Volunteer volunteerSaturdayAfternoon) {
        this.volunteerSaturdayAfternoon = volunteerSaturdayAfternoon;
    }

    public Volunteer getVolunteerSundayMorning() {
        return volunteerSundayMorning;
    }

    public void setVolunteerSundayMorning(Volunteer volunteerSundayMorning) {
        this.volunteerSundayMorning = volunteerSundayMorning;
    }

    public Volunteer getVolunteerSundayAfternoon() {
        return volunteerSundayAfternoon;
    }

    public void setVolunteerSundayAfternoon(Volunteer volunteerSundayAfternoon) {
        this.volunteerSundayAfternoon = volunteerSundayAfternoon;
    }

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
        if(!likesFootball){
            myInterestsList.remove("Football");
        }
    }

    public boolean likesCinema() {
        return likesCinema;
    }

    public void setLikesCinema(boolean likesCinema) {
        this.likesCinema = likesCinema;
        if(!likesCinema){
            myInterestsList.remove("Cinema");
        }
    }

    public boolean likesDomino() {
        return likesDomino;
    }

    public void setLikesDomino(boolean likesDomino) {
        this.likesDomino = likesDomino;
        if (!likesDomino) {
            myInterestsList.remove("Domino");
        }
    }

    public boolean likesCrochet() {
        return likesCrochet;
    }

    public void setLikesCrochet(boolean likesCrochet) {
        this.likesCrochet = likesCrochet;
        if (!likesCrochet) {
            myInterestsList.remove("Crochet");
        }
    }

    public boolean likesCooking() {
        return likesCooking;
    }

    public void setLikesCooking(boolean likesCooking) {
        this.likesCooking = likesCooking;
        if(!likesCooking){
            myInterestsList.remove("Cooking");
        }
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

    public void setScheduledSaturdayMorning(boolean scheduledSaturdayMorning) {
        isScheduledSaturdayMorning = scheduledSaturdayMorning;
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

    public boolean isScheduledSaturdayAfternoon() {
        return isScheduledSaturdayAfternoon;
    }

    public void setScheduledFridayAfternoon(boolean scheduledFridayAfternoon) {
        isScheduledFridayAfternoon = scheduledFridayAfternoon;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCommonInterestsCount() {
        return commonInterestsList.size();
    }

    public void addToInterestList(String interest) {
        commonInterestsList.add(interest);
    }

    public List<String> getCommonInterestsList() {
        return commonInterestsList;
    }
}
