package org.app.company.services;

import org.app.company.model.Beneficiary;
import org.app.company.model.Volunteer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VolunteerService {

    private List<Volunteer> volunteerList = new ArrayList<>();

    public VolunteerService(){
        Volunteer volunteer = new Volunteer();
        volunteer.setFirstName("Mariuson");
        volunteer.setAge(28);
        volunteer.setLocation("Lisboa");
        volunteer.setLikesCrochet(false);
        volunteer.setLikesFootball(false);
        volunteer.setLikesDomino(false);

        Volunteer volunteer2 = new Volunteer();
        volunteer2.setFirstName("romario");
        volunteer2.setAge(18);
        volunteer2.setLocation("Porto");
        volunteer2.setLikesCrochet(false);
        volunteer2.setLikesFootball(false);

        Volunteer volunteer3 = new Volunteer();
        volunteer3.setFirstName("aNDRE");
        volunteer3.setAge(39);
        volunteer3.setLocation("Braga");
        volunteer3.setLikesFootball(false);

        addVolunteer(volunteer);
        addVolunteer(volunteer2);
        addVolunteer(volunteer3);
    }
    private List<String> commonInterestsList;

    public List<String> listCommonInterests(){
        return commonInterestsList;
    }
    public void addVolunteer (Volunteer volunteer){
        volunteerList.add(volunteer);
    }

    public List <Volunteer> list(){
        return volunteerList;
    }
    public void checkCinemaInterest(Beneficiary beneficiary) {
        for (Volunteer volunteer : volunteerList) {
            if (beneficiary.likesCinema() && volunteer.likesCinema()) {
                //volunteer.setCommonInterests(volunteer.getCommonInterestsCount() + 1);
                volunteer.addToInterestList("Cinema");
                beneficiary.addToInterestList("Cinema");
            }
        }
    }

    public void checkCookingInterest(Beneficiary beneficiary) {
        for (Volunteer volunteer : volunteerList) {
            if (beneficiary.likesCooking() && volunteer.likesCooking()) {
                //volunteer.setCommonInterests(volunteer.getCommonInterestsCount() + 1);
                volunteer.addToInterestList("Cooking");
                beneficiary.addToInterestList("Cooking");
            }
        }
    }

    public void checkCrochetInterest(Beneficiary beneficiary) {
        for (Volunteer volunteer : volunteerList) {
            if (beneficiary.likesCrochet() && volunteer.likesCrochet()) {
                //volunteer.setCommonInterests(volunteer.getCommonInterestsCount() + 1);
                volunteer.addToInterestList("Cooking");
                beneficiary.addToInterestList("Cooking");
            }
        }
    }

    public void checkFootballInterest(Beneficiary beneficiary) {
        for (Volunteer volunteer : volunteerList) {
            if (beneficiary.likesFootball() && volunteer.likesFootball()) {
                //volunteer.setCommonInterests(volunteer.getCommonInterestsCount() + 1);
                volunteer.addToInterestList("Football");
                beneficiary.addToInterestList("Football");
            }
        }
    }

    public void checkDominoInterest(Beneficiary beneficiary) {
        for (Volunteer volunteer : volunteerList) {
            if (beneficiary.likesDomino() && volunteer.likesDomino()) {
                //volunteer.setCommonInterests(volunteer.getCommonInterestsCount() + 1);
                volunteer.addToInterestList("Domino");
                beneficiary.addToInterestList("Domino");
            }
        }
    }

    public Volunteer getMostCommonInterestsVolunteer() {
        Volunteer newVolunteer = new Volunteer();
        for (Volunteer volunteer : volunteerList) {
            if (volunteer.getCommonInterestsCount() == 5) {
                newVolunteer = volunteer;
            } else if (volunteer.getCommonInterestsCount() == 4) {
                newVolunteer = volunteer;
            } else if (volunteer.getCommonInterestsCount() == 3) {
                newVolunteer = volunteer;
            } else if (volunteer.getCommonInterestsCount() == 2) {
                newVolunteer = volunteer;
            } else if (volunteer.getCommonInterestsCount() == 1) {
                newVolunteer = volunteer;
            } else if (volunteer.getCommonInterestsCount() == 0) {
                newVolunteer = volunteer;
            }
        }



        return newVolunteer;
    }

    public void resetCommonInterests(){
        for (Volunteer volunteer : volunteerList) {
            //volunteer.setCommonInterests(0);
            volunteer.getCommonInterestsList().removeAll(volunteer.getCommonInterestsList());
        }
    }

    public void cancelMondayMorningMeeting(Volunteer volunteer){
        volunteer.setAvailableMondayMorning(true);
        volunteer.setScheduledMondayMorning(false);
        volunteer.setBeneficiaryMondayMorning(null);
    }

    public void cancelMondayAfternoonMeeting(Volunteer volunteer){
        volunteer.setAvailableMondayAfternoon(true);
        volunteer.setScheduledMondayAfternoon(false);
        volunteer.setBeneficiaryMondayAfternoon(null);
    }

    public void cancelTuesdayMorningMeeting(Volunteer volunteer){
        volunteer.setAvailableTuesdayMorning(true);
        volunteer.setScheduledTuesdayMorning(false);
        volunteer.setBeneficiaryTuesdayMorning(null);
    }

    public void cancelTuesdayAfternoonMeeting(Volunteer volunteer){
        volunteer.setAvailableTuesdayAfternoon(true);
        volunteer.setScheduledTuesdayAfternoon(false);
        volunteer.setBeneficiaryTuesdayAfternoon(null);
    }

    public void cancelWednesdayMorningMeeting(Volunteer volunteer){
        volunteer.setAvailableWednesdayMorning(true);
        volunteer.setScheduledWednesdayMorning(false);
        volunteer.setBeneficiaryWednesdayMorning(null);
    }

    public void cancelWednesdayAfternoonMeeting(Volunteer volunteer){
        volunteer.setAvailableWednesdayAfternoon(true);
        volunteer.setScheduledWednesdayAfternoon(false);
        volunteer.setBeneficiaryWednesdayAfternoon(null);
    }

    public void cancelThursdayMorningMeeting(Volunteer volunteer){
        volunteer.setAvailableThursdayMorning(true);
        volunteer.setScheduledThursdayMorning(false);
        volunteer.setBeneficiaryThursdayMorning(null);
    }

    public void cancelFridayMorningMeeting(Volunteer volunteer){
        volunteer.setAvailableFridayMorning(true);
        volunteer.setScheduledFridayMorning(false);
        volunteer.setBeneficiaryFridayMorning(null);
    }

    public void cancelFridayAfternoonMeeting(Volunteer volunteer){
        volunteer.setAvailableFridayAfternoon(true);
        volunteer.setScheduledFridayAfternoon(false);
        volunteer.setBeneficiaryFridayAfternoon(null);
    }

    public void cancelSaturdayMorningMeeting(Volunteer volunteer){
        volunteer.setAvailableSaturdayMorning(true);
        volunteer.setScheduledSaturdayMorning(false);
        volunteer.setBeneficiarySaturdayMorning(null);
    }

    public void cancelSaturdayAfternoonMeeting(Volunteer volunteer){
        volunteer.setAvailableSaturdayAfternoon(true);
        volunteer.setScheduledSaturdayAfternoon(false);
        volunteer.setBeneficiarySaturdayAfternoon(null);
    }

    public void cancelSundayMorningMeeting(Volunteer volunteer){
        volunteer.setAvailableSundayMorning(true);
        volunteer.setScheduledSundayMorning(false);
        volunteer.setBeneficiarySundayMorning(null);
    }

    public void cancelSundayAfternoonMeeting(Volunteer volunteer){
        volunteer.setAvailableSundayAfternoon(true);
        volunteer.setScheduledSundayAfternoon(false);
        volunteer.setBeneficiarySundayAfternoon(null);
    }
}