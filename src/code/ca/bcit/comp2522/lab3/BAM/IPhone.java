package ca.bcit.comp2522.lab3.BAM;

import java.util.Objects;

public class IPhone extends IDevice{
    // Marcus:
    // - Please add final to variables
    double phonePlanMins;
    String phoneCarrier;

    // Marcus:
    // - Please add final to arguments
    public IPhone (double phonePlanMins, String phoneCarrier){
        super("talking");
        // Marcus:
        // - Validate this please
        this.phonePlanMins = phonePlanMins;
        this.phoneCarrier = phoneCarrier;
    }

    public String getPurpose() {
        return "the purpose of this iDevice is “talking”";
    }

    @Override
    public void printDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
       StringBuilder iPhoneStrBuilder;
       String iDeviceString;
       String iPhoneStr ;


       iPhoneStrBuilder = new StringBuilder();
       iDeviceString = super.toString();

       // Marcus:
        // - Please one append per line
       iPhoneStrBuilder.append(iDeviceString).append("iPhone. Phone plan minutes: ")
        .append(phonePlanMins).append(". Phone carrier is: ").append(phoneCarrier);

       iPhoneStr = iPhoneStrBuilder.toString();
       return iPhoneStr;
    }

    @Override
    public int hashCode(){
        // Marcus:
        // - Why the fuck is the hashCode based on "woah"
        return Objects.hashCode("woah");
    }
}
