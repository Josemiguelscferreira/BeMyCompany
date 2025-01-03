package org.app.company.services;

import org.app.company.model.Beneficiary;
import org.app.company.model.Volunteer;

import java.util.ArrayList;
import java.util.List;

public class ScheduleService {

    private VolunteerService volunteerService;
    private BeneficiaryService beneficiaryService;

    private List<Volunteer> volunteerList;

    private List<Beneficiary> beneficiaryList;

    public ScheduleService(VolunteerService volunteerService, BeneficiaryService beneficiaryService) {
        this.beneficiaryService = beneficiaryService;
        this.beneficiaryList = beneficiaryService.list();
        this.volunteerService = volunteerService;
        this.volunteerList = volunteerService.list();
    }


    public Volunteer scheduleMeetingMondayMorning(Beneficiary beneficiary) {

        for (Volunteer volunteer : volunteerList) {
            if (beneficiary.getLocation().equals(volunteer.getLocation()) && beneficiary.isAvailableMondayMorning() && volunteer.isAvailableMondayMorning() && !beneficiary.isScheduledMondayMorning() && !volunteer.isScheduledMondayMorning()) {
                volunteerService.checkCinemaInterest(beneficiary);
                volunteerService.checkCookingInterest(beneficiary);
                volunteerService.checkCrochetInterest(beneficiary);
                volunteerService.checkDominoInterest(beneficiary);
                volunteerService.checkFootballInterest(beneficiary);

            } else {
                System.out.println("Error. Someone is not available Monday morning.");
            }
        }
        Volunteer bestVolunteer = volunteerService.getMostCommonInterestsVolunteer();

        bestVolunteer.setAvailableMondayMorning(false);
        bestVolunteer.setScheduledMondayMorning(true);
        bestVolunteer.setBeneficiaryMondayMorning(beneficiary);
        beneficiary.setAvailableMondayMorning(false);
        beneficiary.setScheduledMondayMorning(true);
        beneficiary.setVolunteerMondayMorning(bestVolunteer);

        System.out.println("We found a match! It is " + bestVolunteer.getFirstName() + " " + bestVolunteer.getLastName());
        volunteerService.resetCommonInterests();

        return bestVolunteer;
    }

    public Volunteer scheduleMeetingMondayAfternoon(Beneficiary beneficiary) {

        for (Volunteer volunteer : volunteerList) {
            if (beneficiary.getLocation().equals(volunteer.getLocation()) && beneficiary.isAvailableMondayAfternoon() && volunteer.isAvailableMondayAfternoon() && !beneficiary.isScheduledMondayAfternoon() && !volunteer.isScheduledMondayAfternoon()) {
                volunteerService.checkCinemaInterest(beneficiary);
                volunteerService.checkCookingInterest(beneficiary);
                volunteerService.checkCrochetInterest(beneficiary);
                volunteerService.checkDominoInterest(beneficiary);
                volunteerService.checkFootballInterest(beneficiary);

            } else {
                System.out.println("Error. Someone is not available Monday afternoon.");
            }
        }
        Volunteer bestVolunteer = volunteerService.getMostCommonInterestsVolunteer();

        bestVolunteer.setAvailableMondayAfternoon(false);
        bestVolunteer.setScheduledMondayAfternoon(true);
        bestVolunteer.setBeneficiaryMondayAfternoon(beneficiary);
        beneficiary.setAvailableMondayAfternoon(false);
        beneficiary.setScheduledMondayAfternoon(true);
        beneficiary.setVolunteerMondayAfternoon(bestVolunteer);

        System.out.println("We found a match! It is " + bestVolunteer.getFirstName() + " " + bestVolunteer.getLastName());
        volunteerService.resetCommonInterests();
        return bestVolunteer;
    }

    public Volunteer scheduleMeetingTuesdayMorning(Beneficiary beneficiary) {

        for (Volunteer volunteer : volunteerList) {
            if (beneficiary.getLocation().equals(volunteer.getLocation()) && beneficiary.isAvailableTuesdayMorning() && volunteer.isAvailableTuesdayMorning() && !beneficiary.isScheduledTuesdayMorning() && !volunteer.isScheduledTuesdayMorning()) {
                volunteerService.checkCinemaInterest(beneficiary);
                volunteerService.checkCookingInterest(beneficiary);
                volunteerService.checkCrochetInterest(beneficiary);
                volunteerService.checkDominoInterest(beneficiary);
                volunteerService.checkFootballInterest(beneficiary);

            } else {
                System.out.println("Error. Someone is not available Tuesday morning.");
            }
        }
        Volunteer bestVolunteer = volunteerService.getMostCommonInterestsVolunteer();

        bestVolunteer.setAvailableTuesdayMorning(false);
        bestVolunteer.setScheduledTuesdayMorning(true);
        bestVolunteer.setBeneficiaryTuesdayMorning(beneficiary);
        beneficiary.setAvailableTuesdayMorning(false);
        beneficiary.setScheduledTuesdayMorning(true);
        beneficiary.setVolunteerTuesdayMorning(bestVolunteer);

        System.out.println("We found a match! It is " + bestVolunteer.getFirstName() + " " + bestVolunteer.getLastName());
        volunteerService.resetCommonInterests();
        return bestVolunteer;
    }

    public Volunteer scheduleMeetingTuesdayAfternoon(Beneficiary beneficiary) {

        for (Volunteer volunteer : volunteerList) {
            if (beneficiary.getLocation().equals(volunteer.getLocation()) && beneficiary.isAvailableTuesdayAfternoon() && volunteer.isAvailableTuesdayAfternoon() && !beneficiary.isScheduledTuesdayAfternoon() && !volunteer.isScheduledTuesdayAfternoon()) {
                volunteerService.checkCinemaInterest(beneficiary);
                volunteerService.checkCookingInterest(beneficiary);
                volunteerService.checkCrochetInterest(beneficiary);
                volunteerService.checkDominoInterest(beneficiary);
                volunteerService.checkFootballInterest(beneficiary);

            } else {
                System.out.println("Error. Someone is not available Tuesday afternoon.");
            }
        }
        Volunteer bestVolunteer = volunteerService.getMostCommonInterestsVolunteer();

        bestVolunteer.setAvailableTuesdayAfternoon(false);
        bestVolunteer.setScheduledTuesdayAfternoon(true);
        bestVolunteer.setBeneficiaryTuesdayAfternoon(beneficiary);
        beneficiary.setAvailableTuesdayAfternoon(false);
        beneficiary.setScheduledTuesdayAfternoon(true);
        beneficiary.setVolunteerTuesdayAfternoon(bestVolunteer);

        System.out.println("We found a match! It is " + bestVolunteer.getFirstName() + " " + bestVolunteer.getLastName());
        volunteerService.resetCommonInterests();
        return bestVolunteer;
    }

    public Volunteer scheduleMeetingWednesdayMorning(Beneficiary beneficiary) {

        for (Volunteer volunteer : volunteerList) {
            if (beneficiary.getLocation().equals(volunteer.getLocation()) && beneficiary.isAvailableWednesdayMorning() && volunteer.isAvailableWednesdayMorning() && !beneficiary.isScheduledWednesdayMorning() && !volunteer.isScheduledWednesdayMorning()) {
                volunteerService.checkCinemaInterest(beneficiary);
                volunteerService.checkCookingInterest(beneficiary);
                volunteerService.checkCrochetInterest(beneficiary);
                volunteerService.checkDominoInterest(beneficiary);
                volunteerService.checkFootballInterest(beneficiary);

            } else {
                System.out.println("Error. Someone is not available Wednesday morning.");
            }
        }
        Volunteer bestVolunteer = volunteerService.getMostCommonInterestsVolunteer();

        bestVolunteer.setAvailableWednesdayMorning(false);
        bestVolunteer.setScheduledWednesdayMorning(true);
        bestVolunteer.setBeneficiaryWednesdayMorning(beneficiary);
        beneficiary.setAvailableWednesdayMorning(false);
        beneficiary.setScheduledWednesdayMorning(true);
        beneficiary.setVolunteerWednesdayMorning(bestVolunteer);

        System.out.println("We found a match! It is " + bestVolunteer.getFirstName() + " " + bestVolunteer.getLastName());
        volunteerService.resetCommonInterests();
        return bestVolunteer;
    }

    public Volunteer scheduleMeetingWednesdayAfternoon(Beneficiary beneficiary) {

        for (Volunteer volunteer : volunteerList) {
            if (beneficiary.getLocation().equals(volunteer.getLocation()) && beneficiary.isAvailableWednesdayAfternoon() && volunteer.isAvailableWednesdayAfternoon() && !beneficiary.isScheduledWednesdayAfternoon() && !volunteer.isAvailableWednesdayAfternoon()) {
                volunteerService.checkCinemaInterest(beneficiary);
                volunteerService.checkCookingInterest(beneficiary);
                volunteerService.checkCrochetInterest(beneficiary);
                volunteerService.checkDominoInterest(beneficiary);
                volunteerService.checkFootballInterest(beneficiary);

            } else {
                System.out.println("Error. Someone is not available Wednesday afternoon.");
            }
        }
        Volunteer bestVolunteer = volunteerService.getMostCommonInterestsVolunteer();

        bestVolunteer.setAvailableWednesdayAfternoon(false);
        bestVolunteer.setScheduledWednesdayAfternoon(true);
        bestVolunteer.setBeneficiaryWednesdayAfternoon(beneficiary);
        beneficiary.setAvailableWednesdayAfternoon(false);
        beneficiary.setScheduledWednesdayAfternoon(true);
        beneficiary.setVolunteerWednesdayAfternoon(bestVolunteer);

        System.out.println("We found a match! It is " + bestVolunteer.getFirstName() + " " + bestVolunteer.getLastName());
        volunteerService.resetCommonInterests();
        return bestVolunteer;
    }

    public Volunteer scheduleMeetingThursdayMorning(Beneficiary beneficiary) {

        for (Volunteer volunteer : volunteerList) {
            if (beneficiary.getLocation().equals(volunteer.getLocation()) && beneficiary.isAvailableThursdayMorning() && volunteer.isAvailableThursdayMorning() && !beneficiary.isScheduledThursdayMorning() && !volunteer.isScheduledThursdayMorning()) {
                volunteerService.checkCinemaInterest(beneficiary);
                volunteerService.checkCookingInterest(beneficiary);
                volunteerService.checkCrochetInterest(beneficiary);
                volunteerService.checkDominoInterest(beneficiary);
                volunteerService.checkFootballInterest(beneficiary);

            } else {
                System.out.println("Error. Someone is not available Thursday morning.");
            }
        }
        Volunteer bestVolunteer = volunteerService.getMostCommonInterestsVolunteer();

        bestVolunteer.setAvailableThursdayMorning(false);
        bestVolunteer.setScheduledThursdayMorning(true);
        bestVolunteer.setBeneficiaryThursdayMorning(beneficiary);
        beneficiary.setAvailableThursdayMorning(false);
        beneficiary.setScheduledThursdayMorning(true);
        beneficiary.setVolunteerThursdayMorning(bestVolunteer);

        System.out.println("We found a match! It is " + bestVolunteer.getFirstName() + " " + bestVolunteer.getLastName());
        volunteerService.resetCommonInterests();
        return bestVolunteer;
    }

    public Volunteer scheduleMeetingThursdayAfternoon(Beneficiary beneficiary) {

        for (Volunteer volunteer : volunteerList) {
            if (beneficiary.getLocation().equals(volunteer.getLocation()) && beneficiary.isAvailableThursdayAfternoon() && volunteer.isAvailableThursdayAfternoon() && !beneficiary.isScheduledThursdayAfternoon() && !volunteer.isScheduledThursdayAfternoon()) {
                volunteerService.checkCinemaInterest(beneficiary);
                volunteerService.checkCookingInterest(beneficiary);
                volunteerService.checkCrochetInterest(beneficiary);
                volunteerService.checkDominoInterest(beneficiary);
                volunteerService.checkFootballInterest(beneficiary);

            } else {
                System.out.println("Error. Someone is not available Thursday afternoon.");
            }
        }
        Volunteer bestVolunteer = volunteerService.getMostCommonInterestsVolunteer();

        bestVolunteer.setAvailableThursdayAfternoon(false);
        bestVolunteer.setScheduledThursdayAfternoon(true);
        bestVolunteer.setBeneficiaryThursdayAfternoon(beneficiary);
        beneficiary.setAvailableThursdayAfternoon(false);
        beneficiary.setScheduledThursdayAfternoon(true);
        beneficiary.setVolunteerThursdayAfternoon(bestVolunteer);

        System.out.println("We found a match! It is " + bestVolunteer.getFirstName() + " " + bestVolunteer.getLastName());
        volunteerService.resetCommonInterests();
        return bestVolunteer;
    }

    public Volunteer scheduleMeetingFridayMorning(Beneficiary beneficiary) {

        for (Volunteer volunteer : volunteerList) {
            if (beneficiary.getLocation().equals(volunteer.getLocation()) && beneficiary.isAvailableFridayMorning() && volunteer.isAvailableFridayMorning() && !beneficiary.isScheduledFridayMorning() && !volunteer.isScheduledFridayMorning()) {
                volunteerService.checkCinemaInterest(beneficiary);
                volunteerService.checkCookingInterest(beneficiary);
                volunteerService.checkCrochetInterest(beneficiary);
                volunteerService.checkDominoInterest(beneficiary);
                volunteerService.checkFootballInterest(beneficiary);

            } else {
                System.out.println("Error. Someone is not available Friday morning.");
            }
        }
        Volunteer bestVolunteer = volunteerService.getMostCommonInterestsVolunteer();

        bestVolunteer.setAvailableFridayMorning(false);
        bestVolunteer.setScheduledFridayMorning(true);
        bestVolunteer.setBeneficiaryFridayMorning(beneficiary);
        beneficiary.setAvailableFridayMorning(false);
        beneficiary.setScheduledFridayMorning(true);
        beneficiary.setVolunteerFridayMorning(bestVolunteer);

        System.out.println("We found a match! It is " + bestVolunteer.getFirstName() + " " + bestVolunteer.getLastName());
        volunteerService.resetCommonInterests();
        return bestVolunteer;
    }

    public Volunteer scheduleMeetingFridayAfternoon(Beneficiary beneficiary) {

        for (Volunteer volunteer : volunteerList) {
            if (beneficiary.getLocation().equals(volunteer.getLocation()) && beneficiary.isAvailableFridayAfternoon() && volunteer.isAvailableFridayAfternoon() && !beneficiary.isScheduledFridayAfternoon() && !volunteer.isScheduledFridayAfternoon()) {
                volunteerService.checkCinemaInterest(beneficiary);
                volunteerService.checkCookingInterest(beneficiary);
                volunteerService.checkCrochetInterest(beneficiary);
                volunteerService.checkDominoInterest(beneficiary);
                volunteerService.checkFootballInterest(beneficiary);

            } else {
                System.out.println("Error. Someone is not available Friday afternoon.");
            }
        }
        Volunteer bestVolunteer = volunteerService.getMostCommonInterestsVolunteer();

        bestVolunteer.setAvailableFridayAfternoon(false);
        bestVolunteer.setScheduledFridayAfternoon(true);
        bestVolunteer.setBeneficiaryFridayAfternoon(beneficiary);
        beneficiary.setAvailableFridayAfternoon(false);
        beneficiary.setScheduledFridayAfternoon(true);
        beneficiary.setVolunteerFridayAfternoon(bestVolunteer);

        System.out.println("We found a match! It is " + bestVolunteer.getFirstName() + " " + bestVolunteer.getLastName());
        volunteerService.resetCommonInterests();
        return bestVolunteer;
    }

    public Volunteer scheduleMeetingSaturdayMorning(Beneficiary beneficiary) {

        for (Volunteer volunteer : volunteerList) {
            if (beneficiary.getLocation().equals(volunteer.getLocation()) && beneficiary.isAvailableSaturdayMorning() && volunteer.isAvailableSaturdayMorning() && !beneficiary.isScheduledSaturdayMorning() && !volunteer.isScheduledSaturdayMorning()) {
                volunteerService.checkCinemaInterest(beneficiary);
                volunteerService.checkCookingInterest(beneficiary);
                volunteerService.checkCrochetInterest(beneficiary);
                volunteerService.checkDominoInterest(beneficiary);
                volunteerService.checkFootballInterest(beneficiary);

            } else {
                System.out.println("Error. Someone is not available Saturday morning.");
            }
        }
        Volunteer bestVolunteer = volunteerService.getMostCommonInterestsVolunteer();

        bestVolunteer.setAvailableSaturdayMorning(false);
        bestVolunteer.setScheduledSaturdayMorning(true);
        bestVolunteer.setBeneficiarySaturdayMorning(beneficiary);
        beneficiary.setAvailableSaturdayMorning(false);
        beneficiary.setScheduledSaturdayMorning(true);
        beneficiary.setVolunteerSaturdayMorning(bestVolunteer);

        System.out.println("We found a match! It is " + bestVolunteer.getFirstName() + " " + bestVolunteer.getLastName());
        volunteerService.resetCommonInterests();
        return bestVolunteer;
    }

    public Volunteer scheduleMeetingSaturdayAfternoon(Beneficiary beneficiary) {

        for (Volunteer volunteer : volunteerList) {
            if (beneficiary.getLocation().equals(volunteer.getLocation()) && beneficiary.isAvailableSaturdayAfternoon() && volunteer.isAvailableSaturdayAfternoon() && !beneficiary.isScheduledSaturdayAfternoon() && !volunteer.isScheduledSaturdayAfternoon()) {
                volunteerService.checkCinemaInterest(beneficiary);
                volunteerService.checkCookingInterest(beneficiary);
                volunteerService.checkCrochetInterest(beneficiary);
                volunteerService.checkDominoInterest(beneficiary);
                volunteerService.checkFootballInterest(beneficiary);

            } else {
                System.out.println("Error. Someone is not available Saturday afternoon.");
            }
        }
        Volunteer bestVolunteer = volunteerService.getMostCommonInterestsVolunteer();

        bestVolunteer.setAvailableSaturdayAfternoon(false);
        bestVolunteer.setScheduledSaturdayAfternoon(true);
        bestVolunteer.setBeneficiarySaturdayAfternoon(beneficiary);
        beneficiary.setAvailableSaturdayAfternoon(false);
        beneficiary.setScheduledSaturdayAfternoon(true);
        beneficiary.setVolunteerSaturdayAfternoon(bestVolunteer);

        System.out.println("We found a match! It is " + bestVolunteer.getFirstName() + " " + bestVolunteer.getLastName());
        volunteerService.resetCommonInterests();
        return bestVolunteer;
    }

    public Volunteer scheduleMeetingSundayMorning(Beneficiary beneficiary) {

        for (Volunteer volunteer : volunteerList) {
            if (beneficiary.getLocation().equals(volunteer.getLocation()) && beneficiary.isAvailableSundayMorning() && volunteer.isAvailableSundayMorning() && !beneficiary.isScheduledSundayMorning() && !volunteer.isScheduledSundayMorning()) {
                volunteerService.checkCinemaInterest(beneficiary);
                volunteerService.checkCookingInterest(beneficiary);
                volunteerService.checkCrochetInterest(beneficiary);
                volunteerService.checkDominoInterest(beneficiary);
                volunteerService.checkFootballInterest(beneficiary);

            } else {
                System.out.println("Error. Someone is not available Sunday morning.");
            }
        }
        Volunteer bestVolunteer = volunteerService.getMostCommonInterestsVolunteer();

        bestVolunteer.setAvailableSundayMorning(false);
        bestVolunteer.setScheduledSundayMorning(true);
        bestVolunteer.setBeneficiarySundayMorning(beneficiary);
        beneficiary.setAvailableSundayMorning(false);
        beneficiary.setScheduledSundayMorning(true);
        beneficiary.setVolunteerSundayMorning(bestVolunteer);

        System.out.println("We found a match! It is " + bestVolunteer.getFirstName() + " " + bestVolunteer.getLastName());
        volunteerService.resetCommonInterests();
        return bestVolunteer;
    }

    public Volunteer scheduleMeetingSundayAfternoon(Beneficiary beneficiary) {

        for (Volunteer volunteer : volunteerList) {
            if (beneficiary.getLocation().equals(volunteer.getLocation()) && beneficiary.isAvailableSundayAfternoon() && volunteer.isAvailableSundayAfternoon() && !beneficiary.isScheduledSundayAfternoon() && !volunteer.isScheduledSundayAfternoon()) {
                volunteerService.checkCinemaInterest(beneficiary);
                volunteerService.checkCookingInterest(beneficiary);
                volunteerService.checkCrochetInterest(beneficiary);
                volunteerService.checkDominoInterest(beneficiary);
                volunteerService.checkFootballInterest(beneficiary);

            } else {
                System.out.println("Error. Someone is not available Sunday afternoon.");
                return null;
            }
        }
        Volunteer bestVolunteer = volunteerService.getMostCommonInterestsVolunteer();

        bestVolunteer.setAvailableSundayAfternoon(false);
        bestVolunteer.setScheduledSundayAfternoon(true);
        bestVolunteer.setBeneficiarySundayAfternoon(beneficiary);
        beneficiary.setAvailableSundayAfternoon(false);
        beneficiary.setScheduledSundayAfternoon(true);
        beneficiary.setVolunteerSundayAfternoon(bestVolunteer);

        System.out.println("We found a match! It is " + bestVolunteer.getFirstName() + " " + bestVolunteer.getLastName());
        volunteerService.resetCommonInterests();
        return bestVolunteer;
    }

}